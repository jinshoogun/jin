package Q09_23;

public class Saram {
	String name; // 이름
	double ki; // 키
	int age; // 나이
	boolean fm; // 성별 남자(false), 여자 (true)
	String blood; // 혈액형 A, B, O, AB

	Saram(String name, int age, String blood, boolean fm) {

		this.name = name;
		this.age = age;
		this.blood = blood;
		this.fm = fm;

	}

	public void eat() {
		System.out.println(name + "밥을 먹는다.");
	}

	public void walk() {
		System.out.println(name + "걷는다.");
	}

	public void sesu() {
		System.out.println(name + "세수한다.");
	}

	public void age() {
		System.out.println(name + age + "세 이다.");
	}

	public void blood() {
		System.out.println(name + blood + "형이다.");
	}
	
	public void fm() {
		String a;
		if(fm==false)
			a="남자";
		else
			a="여자";
		System.out.println(name + a + "이다.");
	}
}
