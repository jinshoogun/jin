package ex15_01;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample2 {
	public static void main(String args[]) {
		Vector<String> vec = new Vector<String>(); //only String 형
		vec.add("Apple");
		vec.add("Banana");
		vec.add("Orange");

		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = vec.get(i); //get(i)의 변환형이 Object형이지만 제너릭으로 선언했기 때문에 (String)은 생략가능
			// temp = (String)vec.get(i)
			// 제너릭을 사용하지 않을 경우에는 변환형을 명시적으로 선언해야 한다.
			System.out.println(temp.toUpperCase());
		}

	}
}
