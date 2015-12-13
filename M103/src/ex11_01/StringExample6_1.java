package ex11_01;

public class StringExample6_1 {
	public static void main(String args[]) {
		String str = "123456-41234567";

		if ((str.substring(7, 8).equals("1")) || (str.substring(7, 8).equals("3")))
			System.out.println("남성");
		
		else if ((str.substring(7, 8).equals("2")) || (str.substring(7, 8).equals("4")))
			System.out.println("여성");
		
		else
			System.out.println("외국인");
	}
}
