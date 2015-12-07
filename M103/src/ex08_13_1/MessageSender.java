package ex08_13_1;

abstract class MessageSender { // 클래스 자체도 추상클래스로 선언
	String title; // 제목
	String senderName; // 발송자이름

	MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}

	abstract void sendMessage(String recipient); 
	///위 메소드를 빼버리면 변수의 타입만 갖고 메소드가 있는지 체크하는데 sendMessage가 없으니 컴파일러에서 에러가 발생됩니다.(다형성 특성때문입니다)
	// 추상 메소드 - 메세지를 송신한다.
}
// 추상 메소드 목적은?
// 서브 클래스에서 상속받은 추상메소드를 반드시 구현하도록 만들기 위해서이기 때문이다.
// 슈퍼 클레스의 메소드를 호출하는 척하면서 컴파일러의 체크를 무사통과하고 프로그램이 실행될때는 서브클래스의 메소드가 호출되도록 하는 것!
