package Q10_01_1;

public class MainClass1 {
	public static void main(String[] args) {
		APhone obj1 = new APhone();
		BPhone obj2 = new BPhone();
		CPhone obj3 = new CPhone();

		System.out.println("===A��===");
		obj1.callSenderReceive();
		obj1.canLte();
		obj1.tvRemoteController();

		System.out.println("===B��===");
		obj2.callSenderReceive();
		obj2.canLte();
		obj2.tvRemoteController();

		System.out.println("===C��===");
		obj3.callSenderReceive();
		obj3.canLte();
		obj3.tvRemoteController();

	}

}
