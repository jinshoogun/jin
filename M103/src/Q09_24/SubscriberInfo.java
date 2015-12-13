package Q09_24;

public class SubscriberInfo {
	String name, ki, age, fm, blood;

	SubscriberInfo() {
	}

	SubscriberInfo(String name, String ki, String age) {
		this.name = name;
		this.ki = ki;
		this.age = age;
	}

	SubscriberInfo(String name, String ki, String age, String fm, String blood) {
		this(name, ki, age);
		this.fm = fm;
		this.blood = blood;
	}

}
