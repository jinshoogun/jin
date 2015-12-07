package ex15_01;
// ���׸� (Generic) JDK 5.x
// - Ŭ���� ���� ����(<>)��ȣ�� �̿��ؼ� �����.
// - <>�ȿ� Ư���� �ڷ���(Wrapper Ŭ����)�� �־��ָ� �ȴ�.
// - <>�ȿ� ����� ���� Ŭ�������� ����� �� �ִ�.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//     List <String>  list = new ArrayList<String>();
//ArrayList <String>  list = new ArrayList<String>();
//ArrayList <Integer> list = new ArrayList<Integer>();
//ArrayList <Double>  list = new ArrayList<Double>();

public class ArrayListExample3_1 {
	public static void main(String args[]){
		List <String> list = new ArrayList<String>(); 
		//ArrayList = new ArrayList();
		
		// �ڷ� �߰� add
		list.add("�ϳ�");
		list.add(2);       // ���� �߻� - String �� �ƴ�
		list.add(false);   // ���� �߻� - String �� �ƴ�
		list.add(3.42);    // ���� �߻� - String �� �ƴ�
		list.add("��");
		list.add("five");
		list.add('A');     // ���� �߻� - String �� �ƴ�
		
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
