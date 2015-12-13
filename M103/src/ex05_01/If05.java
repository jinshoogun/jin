package ex05_01;

import java.util.Scanner;

public class If05 {
	public static void main(String args[]){
		int n1, n2, max, min;
		 System.out.println("2개의 정수(숫자)를 입력하세요.");
		 Scanner sc = new Scanner(System.in);
	     n1 = sc.nextInt();
	     n2 = sc.nextInt();
	     
	     if(n1 > n2){
	    	 max = n1;
	    	 min = n2; 
	     } else {
	    	 max = n2;
	    	 min = n1;
	     }
	     System.out.println("max = "+max);
	     System.out.println("min = "+min);	 
	}

}
