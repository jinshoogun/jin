package Q10_07;

import java.util.StringTokenizer;

public class A2 {
	public static void main(String args[]) {

		StringTokenizer stok = new StringTokenizer("123456-4123456", "-", true);
		System.out.print("�ֹι�ȣ ���ڸ��� ");
		while (stok.hasMoreTokens()) {
			String token = stok.nextToken();
			if (token.equals("-"))
				System.out.print("\n�ֹι�ȣ ���ڸ��� ");
			else
				System.out.print(token);

		}
	}
}