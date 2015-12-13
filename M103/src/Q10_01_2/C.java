package Q10_01_2;

public class C implements IFunction {
	String call;
	String lte;
	String tv;

	C(String call, String lte, String tv) {
		this.call = call;
		this.lte = lte;
		this.tv = tv;
	}

	public void callSenderReceive() {
		System.out.print("CÆù" + "\t");
		System.out.print(call + "\t");
	}

	public void canLte() {
		System.out.print(lte + "\t");
	}

	public void tvRemoteController() {
		System.out.println(tv);
	}
}
