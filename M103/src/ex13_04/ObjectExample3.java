package ex13_04;

public class ObjectExample3 {
	public static void main(String args[]) {
		GoodsStock obj = new GoodsStock("57293", 100);
		String str = "�������  = " + obj;
		// ���ڿ��� GoodsStock ��ü ������ +�����ڷ� �����ϸ� �� ��ü�� toString �޼ҵ尡 ȣ��� �� ���ڿ���
		// ����ȴ�.

		System.out.println(str);
	}

}