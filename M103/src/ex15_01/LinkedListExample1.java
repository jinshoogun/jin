package ex15_01;
import java.util.LinkedList;



public class LinkedListExample1 {
	public static void main(String args[]){
		LinkedList <String> list = new LinkedList<String>(); 
		// LinkedList 객체를 생성
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2, "키위");
		
		list.set(0, "오렌지");
		
		list.remove(1);
		list.remove("키위");
		
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++){
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}


// 현재 상태는 
//   포도 -> <- 딸기 -> <- 복숭아    (기본 add)
//   포도 -> <- 딸기 -> <- 키위 -> <- 복숭아 (2번에 키위 추가) 
//   오렌지 -> <- 딸기 -><- 키위  -> <- 복숭아 (0번에 포도가 오렌지로 교체)
//   오렌지 -> <- 키위  -> <- 복숭아  (1번 딸기 삭제)
//   오렌지 -> <- 복숭아 (키위(2번)에 삭제)
//
//  