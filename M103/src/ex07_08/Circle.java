package ex07_08;

class Circle {
	/*private*/ double radius; //정보의 은닉 : 객체의 구성요소를 외부로부터 감추는 기술을 말함
	Circle(double radius) {
		this.radius = radius;
	}

	double getArea() {
		double area;
		area = radius * radius * 3.14;
		return area;
	}
}
