package ex15_03;
//Queue(ť) �������̽� - LinkedList (��ӹ޴� Ŭ����)
//- FIFO(First In First Out) ����, ���� �Էµ� �ڷᰡ ���� ��µǴ� ����

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
	public static void main(String args[]){
		//ť�� ����� LinkedList��ü�� �����մϴ�.
		// LinkedList<String> queue = new LinkedList<String>();
		
		Queue <String> queue = new LinkedList<String>();
		System.out.println("��� �ֳ���? " + queue.isEmpty());
		
		//ť�� 3���� �����͸� �߰��Ѵ�. offer()�޼ҵ�
		queue.offer("�䳢");
		queue.offer("�罿");
		queue.offer("ȣ����");
		
		//peek() �޼ҵ�� ó�� ������ �״�� ��ä �����ɴϴ�.
		System.out.println(queue.peek());
		System.out.println("��� �ֳ���? " + queue.isEmpty());
		System.out.println("���� : " + queue.size());
		
		System.out.println("poll() ���");
		while(!queue.isEmpty()) {
			//poll()�޼ҵ�� ť�� �ִ� �����͸� �����ϸ鼭 �����ɴϴ�. - Stack - pop ����
			String str = queue.poll();
			System.out.println(str);
		}
		System.out.println("��� �ֳ���? " + queue.isEmpty());
	}
}
