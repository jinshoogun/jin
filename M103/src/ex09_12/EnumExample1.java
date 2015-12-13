package ex09_12;

public class EnumExample1 {
	public static void main(String args[]) {
		Day days[] = Day.values();
		int cnt;

		// 1단계
		System.out.println(days[0]);
		System.out.println(days[1]);
		System.out.println(days[2]);
		System.out.println(days[3]);
		System.out.println(days[4]);
		System.out.println(days[5]);
		System.out.println(days[6]);

		// 2단계
		for (cnt = 0; cnt < days.length; cnt++)
			System.out.println(days[cnt]);

		// 3단계
		for (Day k : days)
			System.out.println(k);
	}
}
