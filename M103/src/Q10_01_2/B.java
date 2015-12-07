package Q10_01_2;

public class B implements IFunction {
	String call;
	String lte;
	String tv;

	B(String call, String lte, String tv) {
		this.call = call;
		this.lte = lte;
		this.tv = tv;
	}

	public void callSenderReceive() {
		System.out.print("B?è∞" + "\t");
		System.out.print(call + "\t");
	}

	public void canLte() {
		System.out.print(lte + "\t");
	}

	public void tvRemoteController() {
		System.out.println(tv);
	}
}