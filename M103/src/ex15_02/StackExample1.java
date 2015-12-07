package ex15_02;

import java.util.LinkedList;

public class StackExample1 {
	public static void main(String args[]) {
		// LinkedList객체 생성
		LinkedList<Integer> stack = new LinkedList<Integer>();

		// 스택에 3개의 데이터 추가
		stack.addLast(new Integer(12));
		stack.addLast(new Integer(59));
		stack.addLast(new Integer(7));
		System.out.println("stack.size() = " + stack.size());

		// isEmpty():LinkedList객체 안에 데이터가 없을 때 true,있으면 false
		while (!stack.isEmpty()) {
			// removeLast() : 마지막 데이터를 꺼네오고 제거하는 메소오오오드
			Integer num = stack.removeLast();
			System.out.println(num);

		}
		// true - 비었는지 판단
		System.out.println("비어 있나유? " + stack.isEmpty());
	}

}
