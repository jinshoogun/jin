package ex15_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List 인터페이스 - ArrayList(상속받는 클래스)
// 1. 여러가지 자료형의 Data를 모두 저장할 수 있다.
// 2. 입력한 순서대로 출력이 된다.(index번호순으로 저장됨)
// 3. 중복된 Data를 저장할 수 있음
// 4. 배열의 장점과 배열에서 사용할 수 없는 것을 사용가능
// 5. 동적인 저장 구조를 이용할 수 있다.


public class ArrayListExample2 {
	public static void main(String args[]){
		List list = new ArrayList(); //업캐스팅 (상속해준 메소드만 사용가능)
		//ArrayList = new ArrayList();
		
		// 자료 추가 add
		list.add("하나");
		list.add(2);
		list.add(false);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add('A');
		
		
		// 출력방법 1. 해당 개체명으로 출력하는 방법
		System.out.println(list); 
		System.out.println("=========================");
		
		//출력방법 2. get()메소드 활용법
		for(int i = 0; i <list.size(); i++){
			System.out.println(i + "번째 요소 = "+ list.get(i));
		}
		System.out.println("=========");
		
		for(int i = 0; i <list.size(); i++){
			Object s = list.get(i); // get()메소드의 변환형 (E)은 Object
			System.out.println(s);
	        //System.out.println(s.toString());
		}

		System.out.println("=========");
		
		//출력 방법 3 - Iterator 인터페이스 사용 : 반복자
		Iterator elments = list.iterator();
		while (elments.hasNext()){ //hasNext는 다음 list에서 가지고 올 데이터가 있는지 확인함.
			System.out.println(elments.next());
			//next() 메소오오오드를 이용해서 차례대로 한걔식 데이터를 가져온다
		}
	}
}

