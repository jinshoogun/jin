package ex09_15;

class Parent { 
	public int su = 10;

	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드" + "su = " + su);
	}
}

class Child extends Parent {
	// public int su = 20;
	public void ChildPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드" + "su = " + su);
	}

	// 주석을 풀기전과 출력 결과 차이는?
	public void parentPrn() {
		System.out.println("서브 클래스 : ParentPrn 메서드" + "su = " + su);
	}
}

class RefTest01 {// 클래스 파일 명은 메인 메소드가 있는 클래스 명으로 사용하십시요.
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("----Child c = new Child ();--");
		c.parentPrn();
		c.ChildPrn();

		Parent p;
		p = c;
		// 임시적으로 업캐스팅이 일어남, p = (Parent)c;
		// 두 문장 같은 의미 Parent p = new Child();

		System.out.println("----Parent p = new Child (); 업캐스팅 후--");
		p.parentPrn(); // 업캐스팅 후에 부모로부터 상속받은 메서드만 호출할 수 있다.
		// p.ChildPrn(); 컴파일 에러가 발생하게된다.

	}
}
