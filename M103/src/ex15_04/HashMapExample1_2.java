package ex15_04;

import java.util.HashMap;

// HashMap ���ʸ� ������� �ʴ� ��
// Map �������̽� - HashMap, HashTable(��ӹ��� Ŭ����)
//  1. �������� �ڷ����� Data�� ��� ������ �� �ִ�.
//  ex) int, double, char, boolean, String etc
//  2. Data�� ������ �� Key, Value�� ���ÿ� �����Ѵ�. ��, Key���� �ߺ����� �ʴ´�.
//  3. �� �ϳ��� null key, �������� null�� ���

public class HashMapExample1_2 {
	public static void main(String args[]) {

		HashMap hm = new HashMap(); // 2. ���� Ŭ������ ��ü�� ����


		hm.put("woman", "����ִ�?");
		hm.put("man", "���� �Ϸ�");
		hm.put("age", new Integer(10)); // hm.put("age", 10);
		hm.put("city", "seoul");
		hm.put(null, "seoul");
		hm.put(null, "hoho");
		hm.put("city", "seoul");
		hm.put("city", null);
		
		// HashMap�� �ִ� ��ü���� ���
		// ��¹�� 1.�ش� ��ü������ ���
		System.out.println(hm);
		// {null=hoho, woman=����ִ�?, city=null, man=���� �Ϸ�, age=10}

		// ��� ���2. Key���� ���
		System.out.println(hm.keySet());
		// [null, woman, city, man, age]

		// ��� ��� 3. Value���� ���
		System.out.println(hm.values());
		// [hoho, ����ִ�?, null, ���� �Ϸ�, 10]

		// ��¹�� 4. get(Key) : Key�� �ش��ϴ� Value�� ��� - ���� ���� ���
		System.out.println(hm.get("woman")); // ����ִ�?
		System.out.println(hm.get("city")); // null
	}

}
