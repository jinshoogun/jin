package ex09_13_1;

import java.io.InputStream;
import java.util.Scanner;


public class EnumExample4 {
	public static void main(String args[]) {

		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.println("0~3까지 숫자를 입력하세요");
		int n = sc.nextInt();

		if (n < 0) 
			printSeason(Season.SPRING);
		if (n == 1) 
			printSeason(Season.SUMMER);
		if (n == 2) 
			printSeason(Season.FALL);
		if (n == 3) 
			printSeason(Season.WINTER);
	else if (n > 4 )
		System.out.println("잘못 작성하였습니다.");
	
	}
		static void printSeason(Season season) {
			System.out.println("계절은 " + season.value() + "입니다.");

		}
}
 


		

 