package ex06_02;

import java.util.Scanner;

public class Method03_1 {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		int from = sc.nextInt();
		int to = sc.nextInt();
		int imsi;
		imsi = from;
		from = to;    
		to = imsi;
		
	}

}
