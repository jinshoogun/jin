package ex09_15;
// 직접 만들 경우에 정상적인 다운 캐스팅 
//1. 강제적으로 업캐스팅 후
//2. 강제적으로 다운 캐스팅해야한다.

class Parent03 {
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child03 extends Parent03 {
	public void ParentPrn() {
		System.out.println("서브 클래스  - 상속받은 ParentPrn 메서드");
	}

	public void ChildPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

class RefTest03 {
	public static void main(String[] args) {
		Parent03 p = new Child03();
		// 서브 클래스로 인스턴스 선언 강제로 업캐스팅 시킨 뒤에 강제 형변화 다운 캐스팅해야 된다.
		
		p.parentPrn();
		// p.ChildPrn(); - 컴파일러 에러
		// 업캐스팅의 경우에는 상속해주지 않는 자식메소드가 접근하지 못하게 에러 발생하게 한다.
		// 업캐스팅은 참조 가능한 영역을 축소된다.

		Child03 c; // 서브클래스로 참조변수 선언
		// 서브 클래스 참조변수에 슈퍼클래스의 레퍼런스 값이 대입이 됨.
		
		c = (Child03) p; // 정상적인 다운 캐스팅 강제 형변환(명시적 형변환)으로 다운 캐스팅
		
		System.out.println("------다운 캐스팅 후--------");
		
		c.parentPrn(); // 상속받은 부모 메소드 접근가능
		
		c.ChildPrn(); // 자기 메소드 접근 가능 다운 캐스팅으로 참조 가능한 영역이 확대

	}
}
