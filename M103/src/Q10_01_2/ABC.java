package Q10_01_2;

public class ABC {
	public static void main(String args[]) {
		IFunction arr[] = new IFunction[3];

		arr[0] = new A("가능", "3G", "기본 미탑재");
		arr[1] = new B("가능", "4G", " 기본 탑재 ");
		arr[2] = new C("가능", "4G", "기본 미탑재");
		System.out.println("         " + "전화 송/수신" + "\t" + "4G" + "\t" + "TV리모컨 기능");
		all(arr);
	}

	static void all(IFunction arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i].callSenderReceive();
			arr[i].canLte();
			arr[i].tvRemoteController();
		}
	}
}
