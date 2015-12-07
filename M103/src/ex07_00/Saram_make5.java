package ex07_00;

public class Saram_make5 {
	public static void main (String args[]){
		Saram5 s = new Saram5( 52.9, "±èÅÂÈñ");
		//s.name = "±èÅÂÈñ";
		s.age = 36;
		//s.w = 52.9;
		s.ki = 172.6;
		s.eat();
		s.walk();
		
		Saram5 s1 = new Saram5(70, "ÁÖ¿ø");
		s1.name = "±èÁÖ¿ø";
		s1.age = 30;
		//s1.w = 70;
		s1.ki = 178;
		s1.eat();
        s1.walk();
        s1.sesu();
	}
}
