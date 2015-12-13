package Q09_18;

import java.util.Scanner;

public class Q3 {
	public static void main(String args[]) {
		int data[];
		data = new int[5];
		int i;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5개를 입력하세요.");
		for (i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}

		int max = data[0];
		int min = data[0];

		for (i = 1; i < data.length; i++) {
			max = max > data[i] ? max : data[i];
			min = min < data[i] ? min : data[i];
		}

		System.out.println("max = " + max); // 반복하는 과정을 보고 싶으면 본문을 for문 안에 넣어도
											// 됨.(확인용!)
		System.out.println("min = " + min); // 결과만 보고 싶으면 본문을 for 밖으로!
	}
}
