package ex15_01;
// ArrayList에 데이터를 삽입/수정/삭제하는 예
import java.util.ArrayList;
import java.util.List;

// 제네릭 사용

public class ArrayListExample5 {
	public static void main(String args[]){
		ArrayList <String> list = new ArrayList<String>(); 
		//ArrayList 객체 생성
		
		// list에 3개 데이터 추가
		list.add("포도");
		list.add("딸기");       
		list.add("복숭아");   
		
		list.add(2, "키위"); // 인덱스 2 위치에 삽입
		list.add(4, "키위"); // 인덱스 4 위치에 삽입
		pArrayList(list);
		
		//인덱스 0 위치에 데이터 "오렌지"로 바꾼다.
		 list.set(0, "오렌지");
		 pArrayList(list);
		 
		 // 인덱스 1 위치에 있는 데이터를 삭제한다.
		 list.remove(1);
		 pArrayList(list);
		 
		 // list에서 "키위"라는 데이터를 찾아서 삭제한다. 중복시 가장 가까운 index부터 삭제
		 list.remove("키위");
		 pArrayList(list);
		 
		 
	}
	static void pArrayList(ArrayList<String> list) {
		System.out.println("====================");
		int num = list.size();
		for (int cnt = 0; cnt <num; cnt++){
			String str = list.get(cnt);
			System.out.println("Index = " + cnt + "\t" + "데이터 =" + list.get(cnt));

	
		}
	}
}
