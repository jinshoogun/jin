package ex08_14;

public class InterfaceExample1 {
	public static void main(String args[]) {
		SeparateVolume obj1 = new SeparateVolume("863��774��", "����", "�������� ��������");
		obj1.checkOut("�迵��", "20151001");
		obj1.checkIn();
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
		obj2.checkOut("�����", "20151001");
		obj2.checkIn();
	}

}
