package jdbc_artist;

public class ArtistVO {
	private String artist_id;
	private String artist_name;
	private String artist_gender;
	private String artist_birth;
	private String talent;
	private String agency;

	private String mento_id;
	private String mento_name;

	private Integer serial_no;
	private Integer point;

	private Integer artist_total;
	private Double artist_average;
	
	public String getArtist_id() {
		return artist_id;
	}
	public void setArtist_id(String artist_id) {
		this.artist_id = artist_id;
	}
	public String getArtist_name() {
		return artist_name;
	}
	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}
	public String getArtist_gender() {
		return artist_gender;
	}
	public void setArtist_gender(String artist_gender) {
		this.artist_gender = artist_gender;
	}
	public String getArtist_birth() {
		return artist_birth;
	}
	public void setArtist_birth(String artist_birth) {
		this.artist_birth = artist_birth;
	}
	public String getTalent() {
		return talent;
	}
	public void setTalent(String talent) {
		this.talent = talent;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getMento_id() {
		return mento_id;
	}
	public void setMento_id(String mento_id) {
		this.mento_id = mento_id;
	}
	public String getMento_name() {
		return mento_name;
	}
	public void setMento_name(String mento_name) {
		this.mento_name = mento_name;
	}
	public Integer getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(Integer serial_no) {
		this.serial_no = serial_no;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public Integer getArtist_total() {
		return artist_total;
	}
	public void setArtist_total(Integer artist_total) {
		this.artist_total = artist_total;
	}
	public Double getArtist_average() {
		return artist_average;
	}
	public void setArtist_average(Double artist_average) {
		this.artist_average = artist_average;
	}

	
}
