package Q09_18;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		int data[];
		data = new int[5];
		int i;

		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ���.");
		for (i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}

		int max = data[0];
		int min = data[0];

		for (i = 1; i < data.length; i++) {
			max = max > data[i] ? max : data[i];
			min = min < data[i] ? min : data[i];
		}

		System.out.println("max = " + max); // �ݺ��ϴ� ������ ���� ������ ������ for�� �ȿ� �־
											// ��.(Ȯ�ο�!)
		System.out.println("min = " + min); // ����� ���� ������ ������ for ������!
	}
}
