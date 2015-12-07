package ex11_01;
// 똑같은 문자열 리티럴이 하나의 string 객체로 만들어져 공유되어 참조값이 같다.
public class StringExample2 {
	public static void main(String args[]) {
		String str1 = "자바";
		String str2 = "자바";
		
		
		if (str1 == str2)
			System.out.println("str1 == str2은 같음.");
		else
			System.out.println("str1 == str2은 다름.");
		}
	}

