package Q10_15_01;

import java.util.Scanner;

public class ThreadSleep_calendar3_main {
	public static void main(String[] args) {
		Thread thr = new ThreadSleep_calendar3();
		Scanner sc = new Scanner(System.in);
		System.out.println("��½ð� ����   ex) 20��  = 20");
		System.out.print("��½ð� ����  = ");
		int time = sc.nextInt();
		thr.start();
		try {
			Thread.sleep(time * 1000);
			System.out.println("��� ��");
			thr.stop();
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}
	}
}
