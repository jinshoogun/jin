package ex15_01;

import java.util.ArrayList;
import java.util.List;

//List �������̽� - ArrayList(��ӹ޴� Ŭ����)
// 1. �������� �ڷ����� Data�� ��� ������ �� �ִ�.
// 2. �Է��� ������� ����� �ȴ�.(index��ȣ������ �����)
// 3. �ߺ��� Data�� ������ �� ����
// 4. �迭�� ������ �迭���� ����� �� ���� ���� ��밡��
// 5. ������ ���� ������ �̿��� �� �ִ�.


public class ArrayListExample3 {
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
		
		for(int i = 0; i <list.size(); i++){
			//�ε������� ���� ����Ǿ��ִ� �ڷ����� �ٸ��Ƿ� ������ �߻��Ѵ�.(String, Integer, Boolen���� �ִµ� String���θ� �����ϰ� �����Ƿ� �翬�� ����)
			String s1 = (String)(list.get(i));
			System.out.println(s1);
		}
		System.out.println("=========");
	}
}
