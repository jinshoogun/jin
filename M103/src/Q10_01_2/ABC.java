package Q10_01_2;

public class ABC {
	public static void main(String args[]) {
		IFunction arr[] = new IFunction[3];

		arr[0] = new A("����", "3G", "�⺻ ��ž��");
		arr[1] = new B("����", "4G", " �⺻ ž�� ");
		arr[2] = new C("����", "4G", "�⺻ ��ž��");
		System.out.println("         " + "��ȭ ��/����" + "\t" + "4G" + "\t" + "TV������ ���");
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
