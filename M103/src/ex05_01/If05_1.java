package ex05_01;

import java.util.Scanner;

public class If05_1 {
	public static void main(String args[]) {
		int n1, n2, n3, max, min;
		System.out.println("3개의 정수(숫자)를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		if ((n1 > n2) && (n1 >n3)) 
		    max = n1;
	    else if ((n2 > n1) && (n2 >n3))
	               max = n2;
	    else 
	    	 max = n3;
		    
	     if ((n1 < n2) && (n1 <n3)) 
		    min = n1;
	     else if((n1 > n2) && (n2 <n3))
                    min = n2;
          else
            	min = n3;
		    
	   System.out.println("max = " + max);
	   System.out.println("min = " + min);
	}
}
