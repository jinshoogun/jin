package ex11_03;

//StringTokenzier�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� �ý���
// ���鹮�ڸ� �������� ��ū�� �����մϴ�.

import java.util.StringTokenizer;

public class StringTokenizerExample1 {
	public static void main(String args[]) {

		StringTokenizer stok = new StringTokenizer("��� �� ������");
		String s1 = stok.nextToken();
		System.out.println(s1);

		String s2 = stok.nextToken();
		System.out.println(s2);

		String s3 = stok.nextToken();
		System.out.println(s3);
		
		//��Ÿ�� ���� �߻� - ������ ��ū�� �� �̻� ���� (�׸��� ����)
		//String s4 = stok.nextToken();
		//System.out.println(s4);
		
		System.out.println("=============================================");
		
		StringTokenizer stok2 = new StringTokenizer ("��� �� ������");
		while (stok2.hasMoreTokens()){ //��ū�� �������� �ݺ��ϱ�
			String str = stok2.nextToken(); // ���ڿ��κ��� ��ū�� ����
			System.out.println(str);
		}
		
		
		
		
		
		
	}

}
