package ex11_07;

public class MathExample3 {
	public static void main(String args[]) {
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());

		int num;
		// 0부터 9까지의 정수 범위에 속하는 난수를 만들기
		// 공식 : (정수화)((상한값 - 하한값+1)*난수발생장치 + 하한값)

		num = (int) (Math.random() * 10);
		System.out.println(num);
	}
}
