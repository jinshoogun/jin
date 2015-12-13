package ex07_03;

public class ConstrExample3 {
	public static void main(String args[]) {
		SubscriberInfo2 obj;
		obj = new SubscriberInfo2();
		printSubscriberInfo(obj);
	}

	static void printSubscriberInfo(SubscriberInfo2 obj) {
		System.out.println("이름 : " + obj.name);
		System.out.println("아이디 : " + obj.id);
		System.out.println("패스워드 : " + obj.password);
		System.out.println("전화번호 : " + obj.phoneNo);
		System.out.println("주소 : " + obj.address);
		System.out.println();
	}

}