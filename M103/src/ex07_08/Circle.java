package ex07_08;

class Circle {
	/*private*/ double radius; //������ ���� : ��ü�� ������Ҹ� �ܺηκ��� ���ߴ� ����� ����
	Circle(double radius) {
		this.radius = radius;
	}

	double getArea() {
		double area;
		area = radius * radius * 3.14;
		return area;
	}
}
