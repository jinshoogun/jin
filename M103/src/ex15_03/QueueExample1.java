package ex15_03;
//Queue(큐) 인터페이스 - LinkedList (상속받는 클래스)
//- FIFO(First In First Out) 구조, 먼저 입력된 자료가 먼저 출력되는 구조

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
	public static void main(String args[]){
		//큐로 사용할 LinkedList객체를 생성합니다.
		// LinkedList<String> queue = new LinkedList<String>();
		
		Queue <String> queue = new LinkedList<String>();
		System.out.println("비어 있나유? " + queue.isEmpty());
		
		//큐에 3개의 데이터를 추가한다. offer()메소드
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("호랑이");
		
		//peek() 메소드는 처음 데이터 그대로 둔채 가져옵니다.
		System.out.println(queue.peek());
		System.out.println("비어 있나유? " + queue.isEmpty());
		System.out.println("갯수 : " + queue.size());
		
		System.out.println("poll() 사용");
		while(!queue.isEmpty()) {
			//poll()메소드는 큐에 있는 데이터를 제거하면서 가져옵니다. - Stack - pop 같이
			String str = queue.poll();
			System.out.println(str);
		}
		System.out.println("비어 있나유? " + queue.isEmpty());
	}
}
