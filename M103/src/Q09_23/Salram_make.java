package Q09_23;

public class Salram_make {
	public static void main (String args[]){
		Saram s = new Saram("�ƹ��� �����¾��� ", 56, "AB", false);
		s.name = "�ƹ��� �����¾��� ";
		s.ki = 168;
		s.age = 56;
		s.fm = false;
		s.blood = "AB";
        s.walk();
        s.age();
        s.blood();
        s.fm();

        
		Saram s1 = new Saram("��Ӵ� �������� ", 51, "B", true);
		s1.name = "��Ӵ� �������� ";
		s1.ki = 169;
		s1.age = 51;
		s1.fm = true;
		s1.blood = "B";
		s1.eat();
		s1.age();
		s1.blood();


		Saram s2 = new Saram("���� ��̼����� ", 31, "AB", true);
		s2.name = "���� ��̼����� ";
		s2.ki = 172;
		s2.age = 31;
		s2.fm = true;
		s2.blood = "AB";
        s2.sesu();
        s2.age();
        s2.blood();

	}

}
