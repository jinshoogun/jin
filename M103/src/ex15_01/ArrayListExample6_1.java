package ex15_01;
// ArrayList에 데이터를 삽입/수정/삭제하는 예
// indexOf(data) : 파라미터와 같은 값을 갖는 첫번째 데이터를 찾아서 그위치의 인덱스를 리턴
// lastIndexOf(data) : 파라미터와 같은 값을 마지막부터 순서대로 데이터를 찾아서 그 위치에 인덱스를 리턴
// 파라미터와 같은 값이 없다면 -1을 리턴
import java.util.ArrayList;
import java.util.List;

// 제네릭 사용

public class ArrayListExample6_1 {
	public static void main(String args[]){
		ArrayList <String> list = new ArrayList<String>(); 
		
		list.add("머루");
		list.add("사과");
		list.add("앵두");       
		list.add("자두");   
		list.add("사과");
		
		int index1 = list.indexOf("사과");
		int index2 = list.lastIndexOf("사과");
		System.out.println("첫번째 사과 : " + index1);
		System.out.println("마지막 사과 : " + index2);		
	}
}
