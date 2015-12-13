package Q10_01_1;

public class BPhone implements IFunction {

	@Override
	public void callSenderReceive() {
		System.out.println("송/수신 가능합니다.");
	}

	@Override
	public void canLte() {
		System.out.println("4G 가능 합니다.");

	}

	@Override
	public void tvRemoteController() {
		System.out.println("TV 리모콘 기능 탑재 되었습니다.");
	}

}
