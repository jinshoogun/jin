package E100;

public class Car {
	public Car() {
	}

	int Speed;
	int distance;
	String Color;

	public void Speedup() {
		Speed = Speed + 5;
	}

	public void breakdown() {
		Speed = Speed - 10;
	}

	public int getCurrentSpeed() {
		return Speed;

	}
}
