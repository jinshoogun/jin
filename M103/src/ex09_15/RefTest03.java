package ex09_15;
// ���� ���� ��쿡 �������� �ٿ� ĳ���� 
//1. ���������� ��ĳ���� ��
//2. ���������� �ٿ� ĳ�����ؾ��Ѵ�.

class Parent03 {
	public void parentPrn() {
		System.out.println("���� Ŭ���� : ParentPrn �޼���");
	}
}

class Child03 extends Parent03 {
	public void ParentPrn() {
		System.out.println("���� Ŭ����  - ��ӹ��� ParentPrn �޼���");
	}

	public void ChildPrn() {
		System.out.println("���� Ŭ���� : ChildPrn �޼���");
	}
}

class RefTest03 {
	public static void main(String[] args) {
		Parent03 p = new Child03();
		// ���� Ŭ������ �ν��Ͻ� ���� ������ ��ĳ���� ��Ų �ڿ� ���� ����ȭ �ٿ� ĳ�����ؾ� �ȴ�.
		
		p.parentPrn();
		// p.ChildPrn(); - �����Ϸ� ����
		// ��ĳ������ ��쿡�� ��������� �ʴ� �ڽĸ޼ҵ尡 �������� ���ϰ� ���� �߻��ϰ� �Ѵ�.
		// ��ĳ������ ���� ������ ������ ��ҵȴ�.

		Child03 c; // ����Ŭ������ �������� ����
		// ���� Ŭ���� ���������� ����Ŭ������ ���۷��� ���� ������ ��.
		
		c = (Child03) p; // �������� �ٿ� ĳ���� ���� ����ȯ(����� ����ȯ)���� �ٿ� ĳ����
		
		System.out.println("------�ٿ� ĳ���� ��--------");
		
		c.parentPrn(); // ��ӹ��� �θ� �޼ҵ� ���ٰ���
		
		c.ChildPrn(); // �ڱ� �޼ҵ� ���� ���� �ٿ� ĳ�������� ���� ������ ������ Ȯ��

	}
}
