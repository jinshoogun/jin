package ex15_02;

import java.util.Date;
import java.util.Stack;

// 제너릭 사용안함
//Stack 클래스
//1. LIFO (Last In First Out) 구조 마지막으로 입력된 자료가 가장 먼저 출력되는 구조
//2. 여러가지 자료형의 Data를 모두 저장할 수 있다.

public class StackExample2 {
	public static void main(String args[]) {
		// Stack 객체 생성
		Stack s= new Stack();
		// true - 비었는지 판단
		System.out.println("비어 있어유? " + s.empty());
		
		// Stack에 값을 넣음
		s.push("좋아요");
		Date d = new Date();
		s.push(d);
		s.push(new Integer(10));
		s.push("아이유");
		
		System.out.println("비어 있어유? " + s.empty());
		
		//출구쪽(맨 마지막에 저장된 )에 있는 자료를 제거하지 않고 구해오는 메소오오오드 (false)
		System.out.println("맨 마지막에 있는 데이터 : " + s.peek()); 
		
//		//Stack 값을 출력 pop은 데이터를 꺼내면서 데이터를 삭제한다.
//		System.out.println("데이터 출력 : "+ s.pop()); //아이유(라고 적고 리무엔도라고 한다) 출력
//		System.out.println("데이터 출력 : "+ s.pop()); // 10 출력
//		System.out.println("데이터 출력 : "+ s.pop()); // 출력 현재 날짜시각가 출력
//		System.out.println("데이터 출력 : "+ s.pop()); // 좋아요 출력
//
//		System.out.println("비어 있어유? " + s.empty()); //비어 있는지 판단 - true
		
		
		while(!s.empty()){
			Object num = s.pop();
			System.out.println(num);
		}
		System.out.println("비어 있어유? " + s.empty());
	}

}
