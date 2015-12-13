package ex15_02;

import java.util.Date;
import java.util.Stack;

// ���ʸ� ������
//Stack Ŭ����
//1. LIFO (Last In First Out) ���� ���������� �Էµ� �ڷᰡ ���� ���� ��µǴ� ����
//2. �������� �ڷ����� Data�� ��� ������ �� �ִ�.

public class StackExample2 {
	public static void main(String args[]) {
		// Stack ��ü ����
		Stack s= new Stack();
		// true - ������� �Ǵ�
		System.out.println("��� �־���? " + s.empty());
		
		// Stack�� ���� ����
		s.push("���ƿ�");
		Date d = new Date();
		s.push(d);
		s.push(new Integer(10));
		s.push("������");
		
		System.out.println("��� �־���? " + s.empty());
		
		//�ⱸ��(�� �������� ����� )�� �ִ� �ڷḦ �������� �ʰ� ���ؿ��� �޼ҿ������� (false)
		System.out.println("�� �������� �ִ� ������ : " + s.peek()); 
		
//		//Stack ���� ��� pop�� �����͸� �����鼭 �����͸� �����Ѵ�.
//		System.out.println("������ ��� : "+ s.pop()); //������(��� ���� ����������� �Ѵ�) ���
//		System.out.println("������ ��� : "+ s.pop()); // 10 ���
//		System.out.println("������ ��� : "+ s.pop()); // ��� ���� ��¥�ð��� ���
//		System.out.println("������ ��� : "+ s.pop()); // ���ƿ� ���
//
//		System.out.println("��� �־���? " + s.empty()); //��� �ִ��� �Ǵ� - true
		
		
		while(!s.empty()){
			Object num = s.pop();
			System.out.println(num);
		}
		System.out.println("��� �־���? " + s.empty());
	}

}
