package ex11_03;

//StringTokenzier�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� �ý���
// �Ѱ��� ��ȹ����(������)�� �������� ��ū�� �����մϴ�

import java.util.StringTokenizer;

public class StringTokenizerExample2 {
	public static void main(String args[]) {

		StringTokenizer stok = new StringTokenizer("���,��,������", ",");
	
		while (stok.hasMoreTokens()){
			String str = stok.nextToken();
			System.out.println(str);
		}
	}
}
