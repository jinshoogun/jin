package ex12_01;

//checked exception에 해당 - 컴파일 에러 발생
// 해결책 : try-catch 문으로 처리
public class ExceptionExample1 {
	public static void main(String args[]){
		int sum = 1+ -2;
		try {
			if (sum < 0)
				throw new Exception("에러 발생");
			System.out.println(sum);
			} catch (Exception e) {
				
				String str = e.getMessage();
				System.err.println(str);//err라고 적으면 빨갱이가 되뮤
			}
		
		
	}

}
