package ex08_13;

public class SMSSender extends MessageSender {
	String retrunPhoneNo;
	String message;

	SMSSender(String title, String senderName, String retrunPhoneNo, String message) {
		super(title, senderName);
		this.retrunPhoneNo = retrunPhoneNo;
		this.message = message;

	}

	void sendMessage(String recipient) {
		System.out.println("-------------------------");
		System.out.println("���� : " + title);
		System.out.println("������ ��� : " + senderName);
		System.out.println("��ȭ��ȣ : " + recipient);
		System.out.println("���� : " + message);
	}

}