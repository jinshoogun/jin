package ex15_01;
import java.util.LinkedList;



public class LinkedListExample2 {
	public static void main(String args[]){
		LinkedList <String> list = new LinkedList<String>(); 
		// LinkedList ��ü�� ����
		list.add("����");
		list.add("����");
		list.add("������");        
		
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++){
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}


// ���� ���´� 
//    1        2         3    
//   ���� -> <- ���� -> <- ������
//
//