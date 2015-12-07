package ex08_13_1;

public class InheritanceExample6 {
	public static void main(String args[]) {
		EMailSender obj1 = new EMailSender("생일 축하합니다.", "고객센터", "admin@dukeeship.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		SMSSender obj2 = new SMSSender("생일 축하합니다.", "고객센터", "02-000-0000", "10% 할인쿠폰이 발행되었습니다.");

		//서브 클래스 객체 obj1, obj2를 가지고 있는 메소드를 호출
		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.sendMessage("010-000-0000");
	}//MessageSender obj 슈퍼클래스 타입 파라미터
	static void send(MessageSender obj, String recipient){
		obj.sendMessage(recipient);
	}	//abstract void sendMessage(String recipient); 
	///위 메소드를 빼버리면 변수의 타입만 갖고 메소드가 있는지 체크하는데 sendMessage가 없으니 컴파일러에서 에러가 발생됩니다.(다형성 특성때문입니다)

}
