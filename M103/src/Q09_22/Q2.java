package Q09_22;

import java.util.Scanner;

public class Q2 {
	public static void main(String args[]) {
		int result1, result2;
		int num1 = 0, num2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("���� 2���� �Է��ϼ���.");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
	
		result1 = max1(num1, num2);
		result2 = min1(num1, num2);
		System.out.println("�ִ밪�� = " + result1);
		System.out.println("�ּҰ��� = " + result2);}
		
		static int max1(int num1, int num2) {
			int max1 = num1 > num2 ? num1 : num2;
			return max1;
		}

		static int min1 (int num1, int num2) {
			int min1 = num1 < num2 ? num1 :num2;
			return min1; //return �ߵ� �ҷ��� ȣ�⹮���� ���ư��� breakó��
 		}
	}

