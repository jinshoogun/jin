package ex10_09.geometry.shape;

public class Square extends ex10_09.geometry.common.Polygon {
	public Square(int x, int y, int sideLength) {
		super(4);                       // ����Ŭ������ protect ������ ȣ��
		setPoint(0, x, y);              // ����Ŭ������ protect ������ ȣ��
		setPoint(1, x + sideLength, y);
		setPoint(2, x + sideLength, y + sideLength);
		setPoint(3, x , y + sideLength);
	}

	public int getX(int index) {
		return x[index];
	}

	public int getY(int index) {
		return y[index];
	}
}