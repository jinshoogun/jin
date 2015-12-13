package ex06_01;

public class ArrayExample1 {
	public static void main (String args[]){
		int arr[], a;
		arr = new int[10];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = arr[0] + arr[1];
		for (a = 0; a < 3; a++)
			System.out.println(arr[a]);
		
	}

}
