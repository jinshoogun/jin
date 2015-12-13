package ex04_11;

public class EqualityExample1 {
	public static void main(String args[]) {
		long num1 = 5000000000000000000l;
		long num2 = 2000000000000000000l + 3000000000000000000l;

		if (num1 == num2)
			System.out.println(num1 + "과 " + num2 + "의 값은 동일합니다.");

		if (num1 != num2)
			System.out.println(num1 + "과 " + num2 + "의 값은 동일하지 않습니다.");

		if ((num1 != num2) == false)
			System.out.println("다르다고 하면 구라쟁이!");

	}

}
