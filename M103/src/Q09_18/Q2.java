package Q09_18;

public class Q2  {
	public static void main (String args[]){
		int[] data = {20, 30, 40, 80, 10};
		int max, min, i;
		max = 0;
		min = 0;
		
		
		max = data[0] > data[1] ? data[0] : data[1]; 
		for ( i = 1; i < data.length; i++ ){
			max = max > data[i] ? max : data[i];
		}
	    min = data[0] < data[1] ? data[0] : data[1]; 
	    for ( i = 1; i < data.length; i++ ){
		min = min < data[i] ? min : data[i];
		}
		
		System.out.println("max = "+ max);
		System.out.println("min = "+ min);
	}
}


