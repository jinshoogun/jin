package ex14_01;

// �⺻�� �� -> Wrapper ��ü���� �ڵ� (����) Boxing


public class WrapperExample5 {
	public static void main(String args[]) {
		printDouble(new Double (123.45));
		printDouble(123.45);
	}
	
	// �ڵ� (����) Boxing
	static void printDouble (Double obj){
		//DoubleŸ���� ���� ������ DoubleŸ�� �Ķ���͸� �޴� �޼ҵ带 ȣ���Ѵ�.
		System.out.println("obj = " + obj);
		System.out.println("obj.toString = " + obj.toString());
	}

}
