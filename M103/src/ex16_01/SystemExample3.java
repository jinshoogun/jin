package ex16_01;
//err 필드 사용예

//err : 표준에러 출력 필드 - 에러메세지를 모니터로 보내는 출력
// out필드는 일반데이터 출력 용도로 err필드는 에러메세지 출력용도로 사용
// 두필드를 사용해서 결과가 뒤섞어서 나온다.

public class SystemExample3 {
	public static void main(String args[]) {
		int arr1[] = { 77, 82, 99, 100, -27, 0, 42, -35, 60, 72 };
		int arr2[] = { 7, 0, 3, 0, -1, 2, 11, 5, 0, 9 };

		for (int cnt = 0; cnt < arr1.length; cnt++) {
			try {
				int result = arr1[cnt] / arr2[cnt];
				// 나눗셈의 정성작인 결과는 out필드를 통해 출력합니다.
				System.out.printf("%d / %d = %d %n", arr1[cnt], arr2[cnt], result);
			} catch (java.lang.ArithmeticException e) {
				// 나숫셈 중 발생한 에러에 대한 메세지는 err필드롤 통해 출력한다.
				System.err.println("잘못된 연산입니다. (index= " + cnt + ")");
			}
		}
	}
}
