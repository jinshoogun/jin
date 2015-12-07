package ex08_13;

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
	}

}
