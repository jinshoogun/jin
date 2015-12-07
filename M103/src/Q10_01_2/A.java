package Q10_01_2;

public class A implements IFunction {

	String call;
	String lte;
	String tv;

	A(String call, String lte, String tv) {
		this.call = call;
		this.lte = lte;
		this.tv = tv;
	}

	public void callSenderReceive() {
		System.out.print("AÆù" + "\t");
		System.out.print(call + "\t");
	}

	public void canLte() {
		System.out.print(lte + "\t");
	}

	public void tvRemoteController() {
		System.out.println(tv);
	}
}
