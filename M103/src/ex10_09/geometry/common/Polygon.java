package ex10_09.geometry.common;

public class Polygon {
	protected int x[]; // 꼭지점의 X좌표
	protected int y[]; // 꼭지점의 Y좌표
	protected Polygon(int vertexNum){
		x = new int [vertexNum];
		y = new int [vertexNum];
	}
	protected void setPoint (int index, int x, int y){
		// 꼭지점의 좌표를 설정한다.
		this.x[index] = x;
		this.y[index] = y;
	}

}
