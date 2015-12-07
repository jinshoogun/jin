package Q09_18;


public class Q2_1 {
	public static void main (String args[]){
		int data[] = {20, 30, 40, 80, 10};
		int max, min, i;
		max = 0;
		min = 0;
		
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
