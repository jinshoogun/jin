package ex14_01;
// �⺻�� �� -> Wrapper ��ü���� �ڵ� (����) Boxing
//Wrapper��ü -> �⺻���� ������  �ڵ� (����) UnBoxing
public class WrapperExample6 {
	public static void main(String args[]) {
		int n01 = 10;
		int n02;
		Integer obj01; // obj01�� �ּҰ��� ���� ���� �ʴ�.

		// �ڽ�- �⺻�� Ÿ���� ���� ��üȭ
		// int -> Integer
		Integer obj02 = new Integer(20); // Integer ��ü����

		obj01 = n01; // ���� �ڽ� jdk 1.5 �̻� ����
		// obj01 = new Integer(n01); //�ڽ�

		n02 = obj02; // ���� ��ڽ�
		//n02 = obj02.intValue();; // ��ڽ�

		System.out.println(n01 + ", " + obj01);
		System.out.println(n02 + ", " + obj02);
		System.out.println(n01 + ", " + obj01.toString());
		System.out.println(n02 + ", " + obj02.toString());
	}

}
