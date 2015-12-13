package ex15_04;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

// Hashtable - 동기화 관련 솔루션으로 사용(사용은 많이 안함)
// null값을 Key값으로 허용하지 않는다.
//  업캐스팅한 방법으로  Map을 생성하면 상속해준 메소드만 사용할 수 있어 참조가능한 영역이 축소된다.
//  ht.keys()에 접근을 못한다.
//  2. Data를 저장할 때 Key, Value를 동시에 저장한다. 단, Key값은 중복지지 않는다.
//  3. 단 하나의 null key, 여러개의 null값 허용

public class HashTableExample1 {
	public static void main(String args[]) {

		// Map ht = new Hashtable(); //업캐스팅(상속된 메소오오오드만 사용 가능하다.)
		//업캐스팅으로 생성하면 자식(Hashtable)에 있는 keys()메소드를 사용할 수 없어 에러 발생
		Hashtable ht = new Hashtable ();
		
		//헤쉬 테이블에  (키/ 데이터를 입력한다.)
		//메소드에 저장
		
		ht.put("딸기", "StrawBerry");
		ht.put("사과", "Apple");
		ht.put("포도", "Grape");
		ht.put("메론", 10);
		//ht.put(null, 10);
		
		//헤쉬 테이블의 값을 키를 통해 얻는다.
		Object obj = ht.get("포도");
		//해당 키를 아는 경우 get메소오오드를 통해 구현하고 변환형은 Object형이다.
		//하지만 String형으로 많이 사용한다. 
		//키를 알때만 사용하는 방법
		
		System.out.println("포도의 값 -> " + obj);
		System.out.println("포도의 값 -> " + obj.toString());
		
		String Val = (String)ht.get("포도");// 다운 캐스팅
	  //String val = (String)ht.get("메론"); //에러 : 정수형을 문자형으로 변경 불가능

		
		if(Val != null){
			System.out.println("포도 -> " + Val);	
		}
		
		//업캐스팅으로 생성하면 자식(Hashtable)에 있는 key()메소드를 사용할 수 없어 에러 발생

		Enumeration Enum = ht.keys();
		//해결방법 : Hashtable ht = new Hashtable();
		// 모든 키를 열거형으로 가져오는 메소소소오오오드
		
		
		while (Enum.hasMoreElements()){ //키에 어떤 것들이 있는지 알지 못할때, 개수를 알지 못할때
			Object k = Enum.nextElement(); // 키를 구해온다.
			Object v = ht.get(k); //키에 해당하는 값을 가져온다.
			System.out.println(k + " : " + v);
		}

		
	}

}
