package Q09_22;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		int result1, result2;
		int num1 = 0, num2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요.");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
	
		result1 = max1(num1, num2);
		result2 = min1(num1, num2);
		System.out.println("최대값은 = " + result1);
		System.out.println("최소값은 = " + result2);}
		
		static int max1(int num1, int num2) {
			int max1 = num1 > num2 ? num1 : num2;
			return max1;
		}

		static int min1 (int num1, int num2) {
			int min1 = num1 < num2 ? num1 :num2;
			return min1; //return 중도 불러준 호출문으로 돌아간다 break처럼
 		}
	}

