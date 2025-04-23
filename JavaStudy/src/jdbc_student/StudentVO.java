package jdbc_student;

public class StudentVO {
	private String syear;
	private String sclass;
	private String sno;
	private String sname;
	private String birth;
	private String gender;
	private String tel1;
	private String tel2;
	private String tel3;
	
	private int kor;
	private int eng;
	private int mat;
	
	private int total;
	private double average;
	
	private String tname;
	private int korTotal;
	private int engTotal;
	private int matTotal;
	private double korAverage;
	private double engAverage;
	private double matAverage;
	
	
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public int getKorTotal() {
		return korTotal;
	}
	public void setKorTotal(int korTotal) {
		this.korTotal = korTotal;
	}
	public int getEngTotal() {
		return engTotal;
	}
	public void setEngTotal(int engTotal) {
		this.engTotal = engTotal;
	}
	public int getMatTotal() {
		return matTotal;
	}
	public void setMatTotal(int matTotal) {
		this.matTotal = matTotal;
	}
	public double getKorAverage() {
		return korAverage;
	}
	public void setKorAverage(double korAverage) {
		this.korAverage = korAverage;
	}
	public double getEngAverage() {
		return engAverage;
	}
	public void setEngAverage(double engAverage) {
		this.engAverage = engAverage;
	}
	public double getMatAverage() {
		return matAverage;
	}
	public void setMatAverage(double matAverage) {
		this.matAverage = matAverage;
	}
	public void setMatAverage(int matAverage) {
		this.matAverage = matAverage;
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
	public String getSyear() {
		return syear;
	}
	public void setSyear(String syear) {
		this.syear = syear;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getTel3() {
		return tel3;
	}
	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}
}
