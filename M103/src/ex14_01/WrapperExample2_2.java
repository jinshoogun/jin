package ex14_01;
// Wrapper 클래스의 문자열 피라미터를 받은 생성자의 예
// String -> int 방법 두가지
// 1. String - Integer - int 바꾸는 방법
// 2. String - int (Integer.parseInt(args[cnt])

public class WrapperExample2_2 {
	public static void main(String args[]) {
		int total = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			System.out.println("args[" +cnt+"]"+"=" + args[cnt]);
		}
		//  방법 1
		for (int cnt = 0; cnt < args.length; cnt++) {
		//  파라미터로 받은 문자열을 가지고 Integer객체를 생성합니다.
			Integer obj = new Integer(args[cnt]);
	    //  Integer 객체안에 있는 int값을 가져옵니다.
			total +=obj.intValue();
		}
		System.out.println("합 = "+ total);
		
		// 방법 2
		int total2 = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			total2 += Integer.parseInt(args[cnt]);
		} //String -> int형으로 변환 Integer.parseInt()를 사용
		System.out.println("합 = "+ total2);

	}
}
