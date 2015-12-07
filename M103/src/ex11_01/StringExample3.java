package ex11_01;
// String 생성자는 각각 별도의 String 객체를 생성하기 때문에 객체 변수의 주소값이 다르다.
// 7,8번 명령문은 str1과 str2 그리고 new에 명명한  "자바" 객체도 있으므로 3개! 

public class StringExample3 {
	public static void main(String args[]) {
		String str1 = new String("자바");
		String str2 = new String("자바");

		if (str1 == str2)
			System.out.println("str1 == str2은 같음.");
		else
			System.out.println("str1 == str2은 다름.");
	}
}
