package interInterface;

public class Answer implements Question {

	@Override
	public void cal35() {
		int count = 1;
		do {
			if (count % 3 + count % 5 > 0) continue;
			System.out.printf("%4d", count);
		} while (count++ < 100);
		System.out.println("\n");
	}

	@Override
	public int sum(int a) {
		int count = 0;
		int sum = 0;
		
		do {
			System.out.printf("%4d", a);
			
			if ((a & 1) == 1)
				sum += a;
			if (++count % 10 == 0)
				System.out.println();
		} while (a++ < 100);
		
		System.out.println("\n홀수 합계 : " + sum);
		return sum;
	}

}
