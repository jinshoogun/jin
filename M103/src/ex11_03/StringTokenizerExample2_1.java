package ex11_03;

//StringTokenzier�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� �ý���
// ������ �̻��� ��ȹ���ڸ� �������� ��ū�� �����մϴ�.

import java.util.StringTokenizer;

public class StringTokenizerExample2_1 {
	public static void main(String args[]) {

		StringTokenizer stok = new StringTokenizer("���,��|,������", ",|");
	// ��ȹ���� - ,�� |
		while (stok.hasMoreTokens()){
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}
