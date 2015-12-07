package ex15_01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample3 {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		// LinkedList 객체를 생성
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");

		// iterator()메소드를 호출하여 객체를 이용하여 Iterator 객체를 얻습니다.
		Iterator<String> iterator = list.iterator();
		// Iterator 객체를 이용하여 list에 있는 데이터를 순서대로 가져와서 출력
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}
}

// 현재 상태는
//  1          2          3
// 망고 -> <- 파인애플 -> <- 바나나
//
//