package ex08_13_1;

public class EMailSender extends MessageSender {
	String senderAddr;
	String emailBody;

	EMailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;

	}

	void sendMessage(String recipient) {
		System.out.println("-------------------------");
		System.out.println("���� : " + title);
		System.out.println("������ ��� : " + senderName + " " + senderAddr);
		System.out.println("�޴� ��� : " + recipient);
		System.out.println("���� : " + emailBody);
	}

}
