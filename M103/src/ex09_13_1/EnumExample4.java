package ex09_13_1;

import java.io.InputStream;
import java.util.Scanner;


public class EnumExample4 {
	public static void main(String args[]) {

		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		System.out.println("0~3���� ���ڸ� �Է��ϼ���");
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
		System.out.println("�߸� �ۼ��Ͽ����ϴ�.");
	
	}
		static void printSeason(Season season) {
			System.out.println("������ " + season.value() + "�Դϴ�.");

		}
}
 


		

 