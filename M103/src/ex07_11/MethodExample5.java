package ex07_11;

public class MethodExample5 {
	public static void main(String args[]) {
		Account obj = new Account("777-777-77777777", "�ִ��", 10);
		try {
			int amount = obj.withdraw (100000000);
		    System.out.println("����� : " + amount);
		}
		catch (Exception e) { //��ü���� ������ �𸦶� ����ϴµ� (�������Ѱɷ� Ȯ��)
			String msg = e.getMessage();
			System.out.println(msg);
		}

	}
}
