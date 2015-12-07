package Q09_18;

import java.util.Scanner;

public class Q3_1 {
	public static void main (String args[]){
		int data[];
		data = new int[5];
		int max, min, i;
		max = 0;
		min = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력하세요.");
		data[0] = sc.nextInt();
		data[1] = sc.nextInt();
		data[2] = sc.nextInt();
		data[3] = sc.nextInt();
		data[4] = sc.nextInt();
		
		if ((data[0] > data[1]) && (data[0] >data[2]) && (data[0] >data[3]) && (data[0] > data[4])) 
			    max = data[0];
		    else if ((data[1] > data[0]) && (data[1] >data[2]) && (data[1] >data[3]) && (data[1] > data[4]))
		    	max = data[1];
		    else if ((data[2] > data[0]) && (data[2] >data[1]) && (data[2] >data[3]) && (data[2] > data[4]))
		    	max = data[2]; 	
		    else if ((data[3] > data[0]) && (data[3] >data[1]) && (data[3] >data[2]) && (data[3] > data[4]))
		    	max = data[3];
		    else 
		    	max = data[4];
		if ((data[0] < data[1]) && (data[0] < data[2]) && (data[0] <data[3]) && (data[0] < data[4])) 
		    min = data[0];
	    else if ((data[1] < data[0]) && (data[1] <data[2]) && (data[1] <data[3]) && (data[1] < data[4]))
	    	min = data[1];
	    else if ((data[2] < data[0]) && (data[2] <data[1]) && (data[2] <data[3]) && (data[2] < data[4]))
	    	min = data[2]; 	
	    else if ((data[3] < data[0]) && (data[3] <data[1]) && (data[3] <data[2]) && (data[3] < data[4]))
	    	min = data[3];
	    else 
	    	min = data[4];
		
	
		
		System.out.println(max);
		System.out.println(min);
	}
}
