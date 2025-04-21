package JDBC;

public class ScoreVO {
	// 멤버변수 : 객체 형태로 데이터 처리를 위한
	
	private int bno;
	private String name;
	private int kor, eng, mat;
	
	public void print() {
		int total = kor + eng + mat;
		double average = total / 3.0;
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\n", bno, name, kor, eng, mat, total, average);
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
}
