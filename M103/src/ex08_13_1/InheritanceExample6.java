package ex08_13_1;

public class InheritanceExample6 {
	public static void main(String args[]) {
		EMailSender obj1 = new EMailSender("���� �����մϴ�.", "������", "admin@dukeeship.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		SMSSender obj2 = new SMSSender("���� �����մϴ�.", "������", "02-000-0000", "10% ���������� ����Ǿ����ϴ�.");

		//���� Ŭ���� ��ü obj1, obj2�� ������ �ִ� �޼ҵ带 ȣ��
		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.sendMessage("010-000-0000");
	}//MessageSender obj ����Ŭ���� Ÿ�� �Ķ����
	static void send(MessageSender obj, String recipient){
		obj.sendMessage(recipient);
	}	//abstract void sendMessage(String recipient); 
	///�� �޼ҵ带 �������� ������ Ÿ�Ը� ���� �޼ҵ尡 �ִ��� üũ�ϴµ� sendMessage�� ������ �����Ϸ����� ������ �߻��˴ϴ�.(������ Ư�������Դϴ�)

}
