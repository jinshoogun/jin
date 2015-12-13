package ex10_08;

public class PersonalInfo {
	String name;
	int age;
	char gender;
	String bloodType;

	private PersonalInfo(String name, int age) {
		this.name = name;
		this.age = age;

	}

	PersonalInfo(String name, int age, char gender) {
		this(name, age);
		this.gender = gender;
	}

	PersonalInfo(String name, int age, char gender, String bloodType) {
		this(name, age, gender);
		this.bloodType = bloodType;
	}

}
