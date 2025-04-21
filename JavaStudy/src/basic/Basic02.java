package basic;

public class Basic02 {
	public static void main(String... args) {
		String name="hong";
		int idx=1111;
		int kor=100;
		int eng=100;
		int mat=100;
		int tot=kor+eng+mat;
		double avg=tot/3;
		
		
		System.out.println("\t\t\t\t성적표");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t등수");
		System.out.println("--------------------------------------------------------------------");
		System.out.println(idx+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
		System.out.println("--------------------------------------------------------------------");
	}
}
