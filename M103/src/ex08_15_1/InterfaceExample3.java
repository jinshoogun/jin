package ex08_15_1;

public class InterfaceExample3 {
	public static void main(String args[]) {
		Lendable arr[] = new Lendable[3]; //�������̽� Ÿ���� �迭
		// �迭�� ����Ÿ���� ��ü �ּ� ����
		arr[0] = new SeparateVolume("883��", "Ǫ���� ����", "����");
		arr[1] = new SeparateVolume("609.2", "����̼���", "���긮ġ");
		arr[2] = new AppCDInfo("02-17", "XML�� ���� �ڹ� ���α׷���");
		checkOutAll(arr, "������", "20060315");
		arr[0].checkIn();

	} static void checkOutAll(Lendable arr[], String borrower, String date) {
		for (int cnt = 0; cnt < arr.length; cnt++) {
			arr[cnt].checkOut(borrower, date);

		}
		}
      static void checkInAll(Lendable arr[], String borrower, String date) {
				for (int cnt = 0; cnt < arr.length; cnt++) {
					arr[cnt].checkIn();
				}
	}
}
