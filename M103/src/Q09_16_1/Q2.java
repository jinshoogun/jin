package Q09_16_1;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]){
		int num, result;
        System.out.println("점수를 입력하세요.");
	    Scanner sc = new Scanner(System.in);
	    num = sc.nextInt();
		
	    result = num / 5;
	    
	    switch (result){
		case 20 :
			 System.out.println("A+");
		     break; 
		case 19 :
			 System.out.println("A+");
		     break; 
		case 18 :
			 System.out.println("A");
		     break; 		     
		case 17 :
			 System.out.println("B+");
		     break; 
		case 16 :
			 System.out.println("B");
		     break; 
		case 15 :
			 System.out.println("C+");
		     break;   
		case 14 :
			 System.out.println("C");
		     break; 
		case 13 :
			 System.out.println("D+");
		     break; 
		case 12 :
			 System.out.println("D");
		     break; 
		default :
			 System.out.println("F");
			 break;     
	  }	    
   }
}

