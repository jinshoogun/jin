package Q09_21;

public class Q3 {
	public static void main(String args[]) {
		int[][] score = new int[5][3];
		String name[] = { "강호동", "이승기", "유재석", "하하", "이광수" };
		String sub_name[] = { "국어", "수학", "영어" };
		int r, c;

		score[0][0] = 85;
		score[0][1] = 60;
		score[0][2] = 70;
		score[1][0] = 90;
		score[1][1] = 95;
		score[1][2] = 80;
		score[2][0] = 75;
		score[2][1] = 80;
		score[2][2] = 100;
		score[3][0] = 80;
		score[3][1] = 70;
		score[3][2] = 95;
		score[4][0] = 100;
		score[4][1] = 65;
		score[4][2] = 80;

		int[] subject = new int[3]; // 과목총점 저장
		int[] student = new int[5]; // 학생의 총점 저장
		subject[0] = 0;
		student[0] = 0;
		// subject와 student의 초기값 0으로 설정됨

		System.out.println("<각 과목별 총점 구하기>");
		for (r = 0; r < 3; r++) {
			for (c = 0; c < 5; c++) {
				subject[r] += score[c][r]; //  subject[r] = subject[r] + score[r][c]
			}
			System.out.println(sub_name[r] + "의 총점 =" + subject[r]);
		}
		System.out.println(" ");
		System.out.println("<학생별 총점 구하기>");

		for (c = 0; c < 5; c++) {
			for (r = 0; r < 3; r++) {
				student[c] += score[c][r]; //  student[c] = student[c] + score[r][c]
			}
			System.out.println(name[c] + "의 총점 =" + student[c]);
		}
	}
}
