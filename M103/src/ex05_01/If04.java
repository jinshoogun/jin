package ex05_01;

import java.util.Scanner;

public class If04 {
	public static void main(String args[]) {
		int s;
		System.out.println("점수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt(); // s =95

		if (s >= 95) {
			System.out.println("A+학점.");
		} else if (s >= 90) {
			System.out.println("A학점.");
		} else if (s >= 85) {
			System.out.println("B+학점.");
		} else if (s >= 80) {
			System.out.println("B학점.");
		} else if (s >= 75) {
			System.out.println("C+학점.");
		} else if (s >= 70) {
			System.out.println("C학점.");
		} else if (s >= 65) {
			System.out.println("D+학점.");
		} else if (s >= 60) {
			System.out.println("D학점.");					
		} else
			System.out.println("F학점.");

	}

}
