package ex09_15;

class Parent { 
	public int su = 10;

	public void parentPrn() {
		System.out.println("���� Ŭ���� : ParentPrn �޼���" + "su = " + su);
	}
}

class Child extends Parent {
	// public int su = 20;
	public void ChildPrn() {
		System.out.println("���� Ŭ���� : ChildPrn �޼���" + "su = " + su);
	}

	// �ּ��� Ǯ������ ��� ��� ���̴�?
	public void parentPrn() {
		System.out.println("���� Ŭ���� : ParentPrn �޼���" + "su = " + su);
	}
}

class RefTest01 {// Ŭ���� ���� ���� ���� �޼ҵ尡 �ִ� Ŭ���� ������ ����Ͻʽÿ�.
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("----Child c = new Child ();--");
		c.parentPrn();
		c.ChildPrn();

		Parent p;
		p = c;
		// �ӽ������� ��ĳ������ �Ͼ, p = (Parent)c;
		// �� ���� ���� �ǹ� Parent p = new Child();

		System.out.println("----Parent p = new Child (); ��ĳ���� ��--");
		p.parentPrn(); // ��ĳ���� �Ŀ� �θ�κ��� ��ӹ��� �޼��常 ȣ���� �� �ִ�.
		// p.ChildPrn(); ������ ������ �߻��ϰԵȴ�.

	}
}
