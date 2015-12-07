package ex15_01;

import java.util.ArrayList;
import java.util.List;

// 제네릭 사용

public class ArrayListExample4 {
	public static void main(String args[]){
		List <String> list = new ArrayList<String>(); 
		//ArrayList 객체 생성
		
		// list에 3개 데이터 추가
		list.add("포도");
		list.add("딸기");       
		list.add("복숭아");   
		
		int num = list.size(); //list안에 있는 데이터의 수를 구하는 메소소소오옹드
		
		//list에 있는 데이터의 수만큼 반복하면서 데이터를 가져와서 출력
		for (int cnt = 0; cnt <num; cnt++){
			//get(index)메소소소소오오오드를 사용하여 index 위치에 있는 자료를 가지고 온다
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}
