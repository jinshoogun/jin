package ex14_01;

public class WrapperExample3_3 {
	public static void main(String args[]) {
		int total = 0;
		for (int cnt = 0; cnt < args.length; cnt++)
			total += Integer.parseInt(args[cnt]);
		System.out.println(total);
		System.out.println("정수형의 최대값 : " + Integer.MAX_VALUE);
		System.out.println("정수형의 최소값 : " + Integer.MIN_VALUE);
	}

}
