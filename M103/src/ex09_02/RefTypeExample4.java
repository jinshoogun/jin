package ex09_02;
// ���۷��� ������ null �������� ���ؼ� ó���ϴ� ���α׷�!!!
// �Ⱦ��� Exception in thread "main" java.lang.NullPointerException �䷱ ���� ��������.....
public class RefTypeExample4 {
	public static void main(String args[]) {
		Point obj = null;
		if (obj == null){
			System.out.println("obj ������ ����Ű�� ��ü�� �����ϴ�.");
			return;
		}
		System.out.println("x = " + obj.x);
		System.out.println("y = " + obj.y);
	}

}
