package ex15_01;
// ArrayList�� �����͸� ����/����/�����ϴ� ��
import java.util.ArrayList;
import java.util.List;

// ���׸� ���

public class ArrayListExample5 {
	public static void main(String args[]){
		ArrayList <String> list = new ArrayList<String>(); 
		//ArrayList ��ü ����
		
		// list�� 3�� ������ �߰�
		list.add("����");
		list.add("����");       
		list.add("������");   
		
		list.add(2, "Ű��"); // �ε��� 2 ��ġ�� ����
		list.add(4, "Ű��"); // �ε��� 4 ��ġ�� ����
		pArrayList(list);
		
		//�ε��� 0 ��ġ�� ������ "������"�� �ٲ۴�.
		 list.set(0, "������");
		 pArrayList(list);
		 
		 // �ε��� 1 ��ġ�� �ִ� �����͸� �����Ѵ�.
		 list.remove(1);
		 pArrayList(list);
		 
		 // list���� "Ű��"��� �����͸� ã�Ƽ� �����Ѵ�. �ߺ��� ���� ����� index���� ����
		 list.remove("Ű��");
		 pArrayList(list);
		 
		 
	}
	static void pArrayList(ArrayList<String> list) {
		System.out.println("====================");
		int num = list.size();
		for (int cnt = 0; cnt <num; cnt++){
			String str = list.get(cnt);
			System.out.println("Index = " + cnt + "\t" + "������ =" + list.get(cnt));

	
		}
	}
}
