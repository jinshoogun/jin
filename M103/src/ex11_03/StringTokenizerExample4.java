package ex11_03;

//StringTokenzier�� �̿��ؼ� ���ڿ��κ��� ��ū�� �и��ϴ� �ý���
// �Ѱ��� ��ȹ����(������)�� �������� ��ū�� �����մϴ�

import java.util.StringTokenizer;

public class StringTokenizerExample4 {
	public static void main(String args[]) {

		StringTokenizer stok = new StringTokenizer("���=10|���ݷ�=3|������=1", "=|", true);
	    // true :  ��ȹ���ڵ� ��ū���� �����ϵ��� ����� �Ķ����
		System.out.println("��ǰ�̸�\t��ǰ�� " );
		
		while (stok.hasMoreTokens()){
			String token = stok.nextToken();
			//System.out.println(token);
			
			if (token.equals("="))
				System.out.print("\t");
			else if (token.equals("|"))
				System.out.print("\n");
			else
				System.out.print(token);
		}
	}
}
