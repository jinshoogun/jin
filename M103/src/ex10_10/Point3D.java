package ex10_10;

class Point3D extends Point {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	protected int getX() { // 肋给等 皋家靛
		return x;
	}

	protected int getY() { // 肋给等 皋家靛
		return y;
	}

	int getZ() {
		return z;
	}

}
