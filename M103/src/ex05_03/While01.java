package ex05_03;

public class While01 {
	public static void main(String args[]) {
		System.out.println("==1씩증가==.");
		int i = 1;
		while (i <= 20) {
			System.out.println(i);
			i = i + 1;
		}
		System.out.println("==홀수출력==");
		i = 1;
		while (i <= 20) {
			System.out.println(i);
			i = i + 2;
		}
		System.out.println("==짝수출력==");
		i = 2;
		while (i <= 20) {
			System.out.println(i);
			i = i + 2;
		}
		System.out.println("==20이하 3의배수 출력==");
		i = 3;
		while (i <= 20) {
			System.out.println(i);
			i = i + 3;
		}
		System.out.println("==1~10까지의 합==");
		int sum = 0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println(sum);
		System.out.println("==1~10까지 홀수의 합==");
		sum = 0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
			
		}
		System.out.println(sum);
		System.out.println("==1~10까지 짝수의 합==");
		
		sum = 0;
		i = 2;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
			
		}
		System.out.println(sum);
	}
}
