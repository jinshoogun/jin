package ex05_05;

public class For01 {
	public static void main(String args[]) {
		int cnt = 0;
		for (cnt = 1; cnt <= 10; cnt = cnt + 2)
			System.out.println(cnt);
		System.out.println("홀수 출력 완료.");
		System.out.println();

		for (cnt = 2; cnt <= 10; cnt = cnt + 2)
			System.out.println(cnt);
		System.out.println("짝수 출력 완료.");
		System.out.println();

		int sum = 0;
		for (cnt = 1; cnt <= 10; cnt = cnt + 1)
			sum = sum + cnt;
		System.out.println(sum);
		System.out.println("1~10까지 합완료.");
		System.out.println();

		sum = 0;
		for (cnt = 1; cnt <= 10; cnt = cnt + 2)
			sum = sum + cnt;
		System.out.println(sum);
		System.out.println("1~10까지 홀수완료.");
		System.out.println();

		sum = 0;
		for (cnt = 2; cnt <= 10; cnt = cnt + 2)
			sum = sum + cnt;
		System.out.println(sum);
		System.out.println("1~10까지 홀수완료.");
		System.out.println();

	}

}
