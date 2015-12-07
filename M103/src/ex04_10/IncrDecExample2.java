package ex04_10;

public class IncrDecExample2 {
	public static void main(String args[]) {
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		int result1 = num1++;
		// int result1 = num1;
		// num1 = num1 + 1 ; (¾ÆÁ÷ ¾ÈµÊ)
		int result2 = num2--;
		// int result2 = num2;
		// num1 = num2 - 1 ;
		int result3 = ++num3;
		// num1 = num3 + 1 ;
		// int result3 = num3;(¾ÆÁ÷ ¾ÈµÊ)
		int result4 = --num4;
		// num1 = num4 + 1 ;
		// int result4 = num4;

		System.out.println("result1 = " + result1);
		// int result1 = num1;
		// num1 = num1 + 1 ; (¾ÆÁ÷ ¾ÈµÊ)
		System.out.println("result2 = " + result2);
		// int result2 = num2;
		// num1 = num2 - 1 ;
		System.out.println("result3 = " + result3);
		// num1 = num3 + 1 ;
		// int result3 = num3;(¾ÆÁ÷ ¾ÈµÊ)
		System.out.println("result4 = " + result4);
		// num1 = num4 + 1 ;
		// int result4 = num4;

		System.out.println();

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);

		System.out.println();

		int num5 = 1, num6 = 2, num7 = 3, num8 = 4;
		int result5 = num5++;

		// int result1 = num1;
		// num1 = num1 + 1 ;
		int result6 = num6--;
		// int result2 = num2;
		// num1 = num2 - 1 ;
		int result7 = ++num7;
		// num1 = num3 + 1 ;
		// int result3 = num3;
		int result8 = --num8;
		// num1 = num4 + 1 ;
		// int result4 = num4;

		System.out.println("result5 = " + result5);
		System.out.println("result6 = " + result6);
		System.out.println("result7 = " + result7);
		System.out.println("result8 = " + result8);
	}

}
