package ex06_02;
import java.util.Scanner;

public class Method03_4 {
	static void sum(int a, int b) {
		int sum = 0, imsi;
		if (a > b) {
			imsi = a;
			a = b;
			b = imsi;
		}
			for (int i = a; i <= b; i++)
				sum += i;
			System.out.println(a + " ~ " + b + "������ �� : " + sum);
		
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��� ���ΰ���?");
		int from = sc.nextInt();
		System.out.println("�� ������ ���� ���ұ��?");
		int to = sc.nextInt();
		sum(from, to);
}
}	
