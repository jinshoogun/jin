package ex07_06;

public class ConstrExample4 {
	public static void main(String args[]) {
		SubscriberInfo2 obj;
		obj = new SubscriberInfo2("제임스 고슬링", "java", "java", "010-111-2222", "찾지마세요");
		printSubscriberInfo2(obj);
	}

	static void printSubscriberInfo2(SubscriberInfo2 obj) {
		System.out.println("이름 : " + obj.name);
		System.out.println("아이디 : " + obj.id);
		System.out.println("패스워드 : " + obj.password);
		System.out.println("전화번호 : " + obj.phoneNo);
		System.out.println("주소 : " + obj.address);
		System.out.println();
	}

}

