package ex10_10;

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	protected int getX() { // �߸��� �޼ҵ�
		return x;
	}

	protected int getY() { // �߸��� �޼ҵ�
		return y;
	}

	int getZ() {
		return z;
	}

}
