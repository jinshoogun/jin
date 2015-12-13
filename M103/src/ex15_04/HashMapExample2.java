package ex15_04;

import java.util.HashMap;

// HashMap ���ʸ� ��� ��
// Map �������̽� - HashMap, HashTable(��ӹ��� Ŭ����)
//  1. �������� �ڷ����� Data�� ��� ������ �� �ִ�.
//  ex) int, double, char, boolean, String etc
//  2. Data�� ������ �� Key, Value�� ���ÿ� �����Ѵ�. ��, Key���� �ߺ����� �ʴ´�.
//  3. �� �ϳ��� null key, �������� null�� ���

public class HashMapExample2 {
	public static void main(String args[]) {
		
		// HashMap ��ü ���� ��� �ΰ���
		// Map hm = new HashMap(); 1. ��ĳ����
		HashMap <String, String >hm = new HashMap<String, String >(); // 2. ���� Ŭ������ ��ü�� ����


		hm.put("woman", "����ִ�?");
		hm.put("man", "���� �Ϸ�");
		hm.put("age", new String("10")); // hm.put("age", 10);
		hm.put("city", "seoul");

		
		// HashMap�� �ִ� ��ü���� ���
		// ��¹�� 1.�ش� ��ü������ ���
		System.out.println(hm);
		// {woman=����ִ�?, city=seoul, man=���� �Ϸ�, age=10}

		// ��� ���2. Key���� ���
		System.out.println(hm.keySet());
		// [woman, city, man, age]

		// ��� ��� 3. Value���� ���
		System.out.println(hm.values());
		// [����ִ�?, seoul, ���� �Ϸ�, 10]

		// ��¹�� 4. get(Key) : Key�� �ش��ϴ� Value�� ��� - ���� ���� ���
		System.out.println(hm.get("woman")); // ����ִ�?
		System.out.println(hm.get("city")); // seoul
	}

}
