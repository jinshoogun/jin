package ex15_01;
import java.util.LinkedList;



public class LinkedListExample1 {
	public static void main(String args[]){
		LinkedList <String> list = new LinkedList<String>(); 
		// LinkedList ��ü�� ����
		list.add("����");
		list.add("����");
		list.add("������");
		list.add(2, "Ű��");
		
		list.set(0, "������");
		
		list.remove(1);
		list.remove("Ű��");
		
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++){
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}


// ���� ���´� 
//   ���� -> <- ���� -> <- ������    (�⺻ add)
//   ���� -> <- ���� -> <- Ű�� -> <- ������ (2���� Ű�� �߰�) 
//   ������ -> <- ���� -><- Ű��  -> <- ������ (0���� ������ �������� ��ü)
//   ������ -> <- Ű��  -> <- ������  (1�� ���� ����)
//   ������ -> <- ������ (Ű��(2��)�� ����)
//
//  