package Q10_15_01;

import java.util.Scanner;

public class ThreadSleep_calendar3_main {
	public static void main(String[] args) {
		Thread thr = new ThreadSleep_calendar3();
		Scanner sc = new Scanner(System.in);
		System.out.println("출력시간 설정   ex) 20초  = 20");
		System.out.print("출력시간 설정  = ");
		int time = sc.nextInt();
		thr.start();
		try {
			Thread.sleep(time * 1000);
			System.out.println("출력 끝");
			thr.stop();
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}
	}
}
