package ex15_01;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample2 {
	public static void main(String args[]) {
		Vector<String> vec = new Vector<String>(); //only String ��
		vec.add("Apple");
		vec.add("Banana");
		vec.add("Orange");

		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = vec.get(i); //get(i)�� ��ȯ���� Object�������� ���ʸ����� �����߱� ������ (String)�� ��������
			// temp = (String)vec.get(i)
			// ���ʸ��� ������� ���� ��쿡�� ��ȯ���� ��������� �����ؾ� �Ѵ�.
			System.out.println(temp.toUpperCase());
		}

	}
}
