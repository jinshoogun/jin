package Q10_07_01;

import java.util.StringTokenizer;

public class A1 {
	public static void main(String[] args) {
		String zumin = "123456-4123456";
		StringTokenizer str = new StringTokenizer(zumin, "-");
		System.out.println("�ֹι�ȣ ���ڸ��� " + str.nextToken());
		System.out.println("�ֹι�ȣ ���ڸ��� " + str.nextToken());

	}
}
