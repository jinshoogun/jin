package Q10_01_1;

public class MainClass3 {
	public static void main(String[] args) {

		IFunction aPhone = new APhone();
		IFunction bPhone = new BPhone();
		IFunction cPhone = new CPhone();

		// int[] iArr = {10, 20, 30};
		IFunction[] iFunctions = { aPhone, bPhone, cPhone };

		for (int i = 0; i < iFunctions.length; i++) {
			iFunctions[i].callSenderReceive();
			iFunctions[i].canLte();
			iFunctions[i].tvRemoteController();
			System.out.println("======================================");
		}

	}
}
