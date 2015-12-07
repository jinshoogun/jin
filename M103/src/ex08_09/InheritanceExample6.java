package ex08_09;

public class InheritanceExample6 {
	public static void main(String args[]) {
		EMailSender obj1 = new EMailSender("생일 축하합니다.", "고객센터", "admin@dukeeship.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		SMSSender obj2 = new SMSSender("생일 축하합니다.", "고객센터", "02-000-0000", "10% 할인쿠폰이 발행되었습니다.");

		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.sendMessage("010-000-0000");
	}

}
