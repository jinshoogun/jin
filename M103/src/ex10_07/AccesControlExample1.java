package ex10_07;

public class AccesControlExample1 {
	public static void main (String args[]){
		Fraction obj = new Fraction(100, 3);
		System.out.println("100/3 =" + obj.getDouble());
		System.out.println("obj.getInt()" + obj.getInt());
	}

}
