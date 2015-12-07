package ex15_01;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//Vector Ŭ���� - List�� ���� ���, ���߿��� List�� �� ���� ���
// 1. �������� �ڷ����� Data�� ��� ������ �� �ִ�.
//   ex)int, double, char, boolean, String etc
// 2. ���� �ִ� ��,��� ó��(index ��ȣ ������ �����)
// 3. �ߺ��� Data�� ������ �� �ִ�.
// 4. ����� ����� �پ��ϴ�. (���������� ��°���)
// 5. ������ ����ȭ�� �ϱ� ������ ���� ������ ó�������� ArrayList�� LinkedList�� ���� ������ ��������.
//    (�ڹ� 1.2 ���� �δ� ���� ������ ����)
// ���� )����ȭ�� �����忡�� �����ڿ��� �۾��� ��ġ�� �������� �ٸ� �����̵忡�� �����ڿ��� �������� ���ϰ� ����ϴ� ��

public class VectorExample1 {
	public static void main(String args[]) {
		Vector vec = new Vector();
		vec.add("Apple");
		vec.add("Banana");
		vec.add("Orange");

		String temp;
		for (int i = 0; i < vec.size(); i++) {
			// �ٿ�ĳ���� (����� ����ȯ) (String)�����ϸ� ���� �߻� - temp�� String��
			// temp = vec.get(i);
			temp = (String) vec.get(i);
			System.out.println(vec.get(i));
			System.out.println(temp.toUpperCase());
		}

		// Vector�� ����
		Enumeration enu = vec.elements(); // Enumeration�� ���������� ���� �� �ִ�. Enum��
											// Ǯ����
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());

		}
		Iterator iterator = vec.iterator();
		while (iterator.hasNext()) {
			Object str = iterator.next();
			System.out.println(str);
		}
		// Iterator ��ü�� �̿��Ͽ� List�� �ִ� ����Ʈ�� ������� ������ �� �ִ�.
	}
}
