package Q09_16;

import java.util.Scanner;

public class Q1 {
	public static void main(String args[]){
		int num, result;
        System.out.println("점수를 입력하세요.");
	    Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
		
	    result = num / 10;
	    
	    switch (result){
		case 10 :
		case 9 :	
			 System.out.println("A");
		     break; 
		case 8 :
			 System.out.println("B");
		     break; 
		case 7 :
			 System.out.println("C");
		     break; 
		case 6 :
			 System.out.println("D");
		     break; 
		default :
			 System.out.println("F");
			 break;     
	  }	    
   }
}