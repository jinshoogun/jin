package ex14_01;

// Wrapper��ü - �⺻�� ������ �ڵ� UnBoxing �ϴ� ��
// �⺻���� ���� ����� �ڸ��� Wrapper��ü�� ����ϸ� �� Wrapper ��ü�κ��� �⺻���� ���� �ڵ����� ����Ǿ� ���ȴ�.

public class WrapperExample4 {
	public static void main(String args[]) {
		// ���ڿ� "10"�� Wrapper ��ü Integer�� �ٲ�
		Integer obj = new Integer("10");

		// Integer ��ü�� intŸ���� ���� ���ϴ� ��ɹ�
		int sum = obj + 20; // �ڵ�(����) - UnBoxing
		// int sum = obj.intValue() + 20;

		System.out.println(sum);
	}

}
