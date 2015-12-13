package ex15_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List �������̽� - ArrayList(��ӹ޴� Ŭ����)
// 1. �������� �ڷ����� Data�� ��� ������ �� �ִ�.
// 2. �Է��� ������� ����� �ȴ�.(index��ȣ������ �����)
// 3. �ߺ��� Data�� ������ �� ����
// 4. �迭�� ������ �迭���� ����� �� ���� ���� ��밡��
// 5. ������ ���� ������ �̿��� �� �ִ�.


public class ArrayListExample2 {
	public static void main(String args[]){
		List list = new ArrayList(); //��ĳ���� (������� �޼ҵ常 ��밡��)
		//ArrayList = new ArrayList();
		
		// �ڷ� �߰� add
		list.add("�ϳ�");
		list.add(2);
		list.add(false);
		list.add(3.42);
		list.add("��");
		list.add("five");
		list.add('A');
		
		
		// ��¹�� 1. �ش� ��ü������ ����ϴ� ���
		System.out.println(list); 
		System.out.println("=========================");
		
		//��¹�� 2. get()�޼ҵ� Ȱ���
		for(int i = 0; i <list.size(); i++){
			System.out.println(i + "��° ��� = "+ list.get(i));
		}
		System.out.println("=========");
		
		for(int i = 0; i <list.size(); i++){
			Object s = list.get(i); // get()�޼ҵ��� ��ȯ�� (E)�� Object
			System.out.println(s);
	        //System.out.println(s.toString());
		}

		System.out.println("=========");
		
		//��� ��� 3 - Iterator �������̽� ��� : �ݺ���
		Iterator elments = list.iterator();
		while (elments.hasNext()){ //hasNext�� ���� list���� ������ �� �����Ͱ� �ִ��� Ȯ����.
			System.out.println(elments.next());
			//next() �޼ҿ������带 �̿��ؼ� ���ʴ�� �Ѱ½� �����͸� �����´�
		}
	}
}

