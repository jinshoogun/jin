package Q10_13;

import java.util.Scanner;

public class T1 {
	public static void main(String args[]) {
	    String a, b;
	    int max, min;
		Scanner sc = new Scanner(System.in);

		System.out.println("�� ���� �Է��ϼ��� ? ");
	    a = sc.next();
	    b = sc.next();
	    
		//�Ʒ� �� ������ �ϼ��Ͻÿ�.
	    max = max(Integer.parseInt(a), Integer.parseInt(b));
	    min = min(Integer.parseInt(a), Integer.parseInt(b));
	    
	    
		System.out.println("�ִ밪�� = " + max);
		System.out.println("�ּҰ��� = " + min);
	}

	public static int max(int a, int b) {
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		return max;
	}

	public static int min(int a, int b) {
		int min;
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		return min;
	}
}


