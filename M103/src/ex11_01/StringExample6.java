package ex11_01;
//substring(int beginIndex) : begin���� ���ڿ� ������ �κ� ���ڿ� ����
//substring(int beginIndex, endIndex) : begin���� end-1���� �κ� ���ڿ� ����

public class StringExample6 {
	public static void main(String args[]) {
		String str = "���� �ڱ��ϴ� �ڹ�";
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
	}
}
