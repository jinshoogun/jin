package ex15_04;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;



public class HashTableExample2 {
	public static void main(String args[]) {

		Hashtable<String, String> ht = new Hashtable <String, String> ();

		
		ht.put("딸기", "StrawBerry");
		ht.put("사과", "Apple");
		ht.put("포도", "Grape");

		Object obj = ht.get("포도");

		System.out.println("포도의 값 -> " + obj);
		System.out.println("포도의 값 -> " + obj.toString());
		
		//해쉬 테이블의 값을 키를 이용해서 얻는다.
		String Val = (String)ht.get("포도");
		
		if(Val != null){
			System.out.println("포도 -> " + Val);	
		}
		
		// 헤쉬 테이블의 키 요소들에 대한 Enumeration 객체 변환
		Enumeration <String> Enum = ht.keys();
		while (Enum.hasMoreElements()){ //제너릭을 사용해서 아래와 같이 사용안해도 된다.
		// String k = (String)Enum.nextElement(); 
			String k = Enum.nextElement(); 
			String v = ht.get(k); //제너릭을 사용해서 아래와 같이 사용안해도 된다.
        // String v = (String)Enum.nextElement(); 	
			System.out.println(k + " : " + v);
		}
	}
}
