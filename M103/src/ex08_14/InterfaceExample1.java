package ex08_14;

public class InterfaceExample1 {
	public static void main(String args[]) {
		SeparateVolume obj1 = new SeparateVolume("863ㅂ774개", "개미", "베르나르 베르베르");
		obj1.checkOut("김영숙", "20151001");
		obj1.checkIn();
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
		obj2.checkOut("박희경", "20151001");
		obj2.checkIn();
	}

}
