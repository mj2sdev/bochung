package jdbc_artist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ArtistDAO {
	private static ArtistDAO instance = new ArtistDAO();

	private Connection connection = null;

	private PreparedStatement preparedStatement = null;

	private ResultSet resultSet = null;

	private StringBuilder sql = null;
	
	private ArtistDAO() {}

	private void close() throws Exception {
		if (resultSet != null) resultSet.close();
		if (preparedStatement != null) preparedStatement.close();
		if (connection != null) connection.close();
	}

	private ArtistDAO set(String parts) {
		sql = new StringBuilder();
		return this.ln(parts);
	}

	private ArtistDAO ln(String parts) {
		sql.append(parts).append(" ");
		return this;
	}

	private String get() {
		return sql.toString();
	}
	
	public static ArtistDAO getInstance(){
		return instance;
	}

	public List<ArtistVO> selectArtists() throws Exception {
		List<ArtistVO> list = new ArrayList<>();
		String sql = 
			set("SELECT")
			.ln("artist_name, artist_id, artist_birth, artist_gender, talent, agency")
			.ln("FROM tbl_artist_201905")
			.get();

		connection = DatabaseManager.getInstance().getConnection();
		preparedStatement = connection.prepareStatement(sql);
		resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			ArtistVO vo = new ArtistVO();
			vo.setArtist_name(resultSet.getString(1));
			vo.setArtist_id(resultSet.getString(2));
			vo.setArtist_birth(resultSet.getString(3));
			vo.setArtist_gender(resultSet.getString(4));
			vo.setTalent(resultSet.getString(5));
			vo.setAgency(resultSet.getString(6));
			list.add(vo);
		}
		close();

		return list;
	}

	public List<ArtistVO> selectPoints() throws Exception {
		List<ArtistVO> list = new ArrayList<>();
		String sql =
			set("SELECT")
			.ln("p.serial_no, a.artist_id, a.artist_name, a.artist_birth, p.point, m.mento_name")
			.ln("FROM tbl_point_201905 p")
			.ln("JOIN tbl_artist_201905 a")
			.ln("ON p.artist_id = a.artist_id")
			.ln("JOIN tbl_mento_201905 m")
			.ln("ON m.mento_id = p.mento_id")
			.ln("ORDER BY p.serial_no ASC")
			.get();
		
		connection = DatabaseManager.getInstance().getConnection();
		preparedStatement = connection.prepareStatement(sql);
		resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			ArtistVO vo = new ArtistVO();
			vo.setSerial_no(resultSet.getInt(1));
			vo.setArtist_id(resultSet.getString(2));
			vo.setArtist_name(resultSet.getString(3));
			vo.setArtist_birth(resultSet.getString(4));
			vo.setPoint(resultSet.getInt(5));
			vo.setMento_name(resultSet.getString(6));
			list.add(vo);
		}
		
		close();
		return list;
	}

	public List<ArtistVO> selectRanking() throws Exception {
		List<ArtistVO> list = new ArrayList<>();
		String sql =
			set("SELECT a.artist_id, a.artist_name, a.artist_gender,")
			.ln("SUM(p.point) as artist_total,")
			.ln("AVG(p.point) as artist_average")
			.ln("FROM TBL_ARTIST_201905 a")
			.ln("JOIN TBL_point_201905 p")
			.ln("ON p.ARTIST_ID = a.ARTIST_ID")
			.ln("GROUP BY a.artist_id, a.artist_name, a.artist_gender")
			.ln("ORDER BY artist_average DESC")
			.get();

		connection = DatabaseManager.getInstance().getConnection();
		preparedStatement = connection.prepareStatement(sql);
		resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			ArtistVO vo = new ArtistVO();
			vo.setArtist_id(resultSet.getString(1));
			vo.setArtist_name(resultSet.getString(2));
			vo.setArtist_gender(resultSet.getString(3));
			vo.setArtist_total(resultSet.getInt(4));
			vo.setArtist_average(resultSet.getDouble(5));
			list.add(vo);
		}

		close();
		return list;
	}
}
