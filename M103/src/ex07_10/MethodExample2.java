package ex07_10;

public class MethodExample2 {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		Numbers obj = new Numbers(arr);
		int total = obj.getTotal();
		int average = obj.getAverage();
		int Max = obj.Max();
		int Min = obj.Min();
		System.out.println("�հ� = " + total);
		System.out.println("��� = " + average);
		System.out.println("�ִ밪 = " + Max);
		System.out.println("�ִ밪 = " + Min);
	}

}
