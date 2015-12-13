package E100;

public class Carmanager {
	public static void main(String args[]) {

		Car dogCar = new Car();
		Car cowCar = new Car();
		cowCar.Speedup();
		dogCar.Speedup();
		dogCar.Speedup();
		System.out.println(dogCar.getCurrentSpeed());
		dogCar.breakdown();
		System.out.println(dogCar.getCurrentSpeed());

	}
}
