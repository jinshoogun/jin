package ex05_03;

public class WhileExample1 {
	public static void main(String args[]){
		int cnt = 0;
		while (cnt<10) {
		 System.out.println(cnt);
		 cnt++;
		 // 오류일때 처음에 초기값 체크 코딩 마지막에 마지막 값으로 체크
		}
		System.out.println("Done.");
		System.out.println("반복문 후 cnt = " + cnt);
	}

}
