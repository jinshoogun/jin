package ex11_01;

public class StringExample1 {
	public static void main(String args[]) {
		String str = "�ڹ� Ŀ��";
		int len = str.length(); // length ȣ�� (���� ����Ҷ� ���� ���� int)

		for (int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt); // charAt ȣ�� (���� ����Ҷ� ���� ���� char)
			System.out.println("Index =" + cnt + " | ���ڿ� = " + ch);
		}
	}
}
