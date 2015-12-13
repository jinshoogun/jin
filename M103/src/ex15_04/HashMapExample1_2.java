package ex15_04;

import java.util.HashMap;

// HashMap 제너릭 사용하지 않는 예
// Map 인터페이스 - HashMap, HashTable(상속받은 클래스)
//  1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
//  ex) int, double, char, boolean, String etc
//  2. Data를 저장할 때 Key, Value를 동시에 저장한다. 단, Key값은 중복지지 않는다.
//  3. 단 하나의 null key, 여러개의 null값 허용

public class HashMapExample1_2 {
	public static void main(String args[]) {

		HashMap hm = new HashMap(); // 2. 구현 클래스를 객체로 생성


		hm.put("woman", "재미있니?");
		hm.put("man", "좋은 하루");
		hm.put("age", new Integer(10)); // hm.put("age", 10);
		hm.put("city", "seoul");
		hm.put(null, "seoul");
		hm.put(null, "hoho");
		hm.put("city", "seoul");
		hm.put("city", null);
		
		// HashMap에 있는 객체들의 출력
		// 출력방법 1.해당 개체명으로 출력
		System.out.println(hm);
		// {null=hoho, woman=재미있니?, city=null, man=좋은 하루, age=10}

		// 출력 방법2. Key값만 출력
		System.out.println(hm.keySet());
		// [null, woman, city, man, age]

		// 출력 방법 3. Value값만 출력
		System.out.println(hm.values());
		// [hoho, 재미있니?, null, 좋은 하루, 10]

		// 출력방법 4. get(Key) : Key에 해당하는 Value를 출력 - 가장 많이 사용
		System.out.println(hm.get("woman")); // 재미있니?
		System.out.println(hm.get("city")); // null
	}

}
