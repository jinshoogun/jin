package ex15_02;

import java.util.LinkedList;

public class StackExample1 {
	public static void main(String args[]) {
		// LinkedList��ü ����
		LinkedList<Integer> stack = new LinkedList<Integer>();

		// ���ÿ� 3���� ������ �߰�
		stack.addLast(new Integer(12));
		stack.addLast(new Integer(59));
		stack.addLast(new Integer(7));
		System.out.println("stack.size() = " + stack.size());

		// isEmpty():LinkedList��ü �ȿ� �����Ͱ� ���� �� true,������ false
		while (!stack.isEmpty()) {
			// removeLast() : ������ �����͸� ���׿��� �����ϴ� �޼ҿ�������
			Integer num = stack.removeLast();
			System.out.println(num);

		}
		// true - ������� �Ǵ�
		System.out.println("��� �ֳ���? " + stack.isEmpty());
	}

}
