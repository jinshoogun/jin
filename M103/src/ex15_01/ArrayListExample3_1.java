package ex15_01;
// 제네릭 (Generic) JDK 5.x
// - 클래식 옆에 꺽쇠(<>)기호를 이용해서 만든다.
// - <>안에 특정한 자료형(Wrapper 클래스)를 넣어주면 된다.
// - <>안에 사용자 정의 클래스형도 사용할 수 있다.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//     List <String>  list = new ArrayList<String>();
//ArrayList <String>  list = new ArrayList<String>();
//ArrayList <Integer> list = new ArrayList<Integer>();
//ArrayList <Double>  list = new ArrayList<Double>();

public class ArrayListExample3_1 {
	public static void main(String args[]){
		List <String> list = new ArrayList<String>(); 
		//ArrayList = new ArrayList();
		
		// 자료 추가 add
		list.add("하나");
		list.add(2);       // 에러 발생 - String 형 아님
		list.add(false);   // 에러 발생 - String 형 아님
		list.add(3.42);    // 에러 발생 - String 형 아님
		list.add("넷");
		list.add("five");
		list.add('A');     // 에러 발생 - String 형 아님
		
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
