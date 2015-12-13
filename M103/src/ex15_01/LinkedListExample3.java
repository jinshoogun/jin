package ex15_01;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample3 {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		// LinkedList ��ü�� ����
		list.add("����");
		list.add("���ξ���");
		list.add("�ٳ���");

		// iterator()�޼ҵ带 ȣ���Ͽ� ��ü�� �̿��Ͽ� Iterator ��ü�� ����ϴ�.
		Iterator<String> iterator = list.iterator();
		// Iterator ��ü�� �̿��Ͽ� list�� �ִ� �����͸� ������� �����ͼ� ���
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}
}

// ���� ���´�
//  1          2          3
// ���� -> <- ���ξ��� -> <- �ٳ���
//
//