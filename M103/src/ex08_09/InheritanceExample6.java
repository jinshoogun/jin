package ex08_09;

public class InheritanceExample6 {
	public static void main(String args[]) {
		EMailSender obj1 = new EMailSender("���� �����մϴ�.", "������", "admin@dukeeship.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		SMSSender obj2 = new SMSSender("���� �����մϴ�.", "������", "02-000-0000", "10% ���������� ����Ǿ����ϴ�.");

		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.sendMessage("010-000-0000");
	}

}
