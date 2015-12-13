package Q09_24;

public class ConstrExample {
	public static void main(String args[]) {
		SubscriberInfo obj, obj1, obj2;
		obj = new SubscriberInfo("±è¹Ì¼÷", "172", "31");
		obj1 = new SubscriberInfo("±èÁ¾ÅÂ", "169", "56", "³²¼º", "AB");
		obj2 = new SubscriberInfo("±è°æ¼ø", "170", "51", "¿©¼º", "B");

		printSubscriberInfo(obj);
		printSubscriberInfo(obj1);
		printSubscriberInfo(obj2);
	}

	static void printSubscriberInfo(SubscriberInfo obj) {
		System.out.println("ÀÌ¸§ : " + obj.name);
		System.out.println("Å° : " + obj.ki);
		System.out.println("³ªÀÌ : " + obj.age);
		System.out.println("¼ºº° : " + obj.fm);
		System.out.println("Ç÷¾×Çü : " + obj.blood);
		System.out.println();
	}

}