package ex08_18;

class Rectangle implements Transformable {
	int x, y, width, height;

	Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

	}

	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moveBy(int xOffset, int yOffset) {
		this.x += xOffset;
		this.y += yOffset;
	}

}
