package ex10_09.geometry.common;

public class Polygon {
	protected int x[]; // �������� X��ǥ
	protected int y[]; // �������� Y��ǥ
	protected Polygon(int vertexNum){
		x = new int [vertexNum];
		y = new int [vertexNum];
	}
	protected void setPoint (int index, int x, int y){
		// �������� ��ǥ�� �����Ѵ�.
		this.x[index] = x;
		this.y[index] = y;
	}

}
