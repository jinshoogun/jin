package ex15_01;

import java.util.ArrayList;
import java.util.List;

//List �������̽� - ArrayList(��ӹ޴� Ŭ����)
// 1. �������� �ڷ����� Data�� ��� ������ �� �ִ�.
// 2. �Է��� ������� ����� �ȴ�.(index��ȣ������ �����)
// 3. �ߺ��� Data�� ������ �� ����
// 4. �迭�� ������ �迭���� ����� �� ���� ���� ��밡��
// 5. ������ ���� ������ �̿��� �� �ִ�.


public class ArrayListExample1 {
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
		
		System.out.println(list); //list�� ��� ������ ���
		
		//size() : �������� ���� ���ϴ� �޼ҿ�������
		System.out.println("�������� ���� = " + list.size());
		
		//get(index) : �ش� �ε����� ������ �������� �޼ҵ�
		System.out.println("list.get(3) = " + list.get(3));
		                                      //0���� ����, index = 3�� ����϶�
	}
}
