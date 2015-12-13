package ex07_10;

public class MethodExample3 {
	public static void main(String args[]){
		int arr[] = new int [0];
		Numbers obj = new Numbers(arr);
		int average = obj.getAverage();
		System.out.println("ЦђБе = "+ average);
	}

}
