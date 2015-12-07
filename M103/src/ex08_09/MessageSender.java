package ex08_09;

abstract class MessageSender { // 클래스 자체도 추상클래스로 선언
	String title; // 제목
	String senderName; // 발송자이름

	MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}

	abstract void sendMessage(String recipient);
	// 추상 메소드 - 메세지를 송신한다.
}
// 추상 메소드 목적은?
// 서브 클래스에서 상속받은 추상메소드를 반드시 구현하도록 만들기 위해서이기 때문이다.