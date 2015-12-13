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
		System.out.println("제목 : " + title);
		System.out.println("보내는 사람 : " + senderName);
		System.out.println("전화번호 : " + recipient);
		System.out.println("내용 : " + message);
	}

}