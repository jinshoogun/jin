package ex04_08;

public class Oper02 {
	public static void main(String[] args) {

		String a = "Apple";
		String b = "Banana";
		String c = a + ", " + b;
		System.out.println(c);

		String str = "결과값 : ";
		int n = 10;
		System.out.println(str + n);
		System.out.println("결과값 : " + n);

		System.out.println("num=" + 3 + 4); // 넘이 문자열부터 인식하니 뒤에는 문자열로
		System.out.println(3 + 4 + "=num"); // 3+4를 숫자부터 인식해서 더한 값으로 나온다
		System.out.println(3 + 4 + "=num" + 3 + 4);
		System.out.println("num=" + (3 + 4));

	}

}
