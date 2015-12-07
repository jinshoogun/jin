package ex14_01;

public class WrapperExample3_1 {
	public static void main(String args[]){
		int total = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			//파라미터로 받은 문자열을 int타입의 값으로 바꾸어져서 합산합니다.
			total += Integer.parseInt(args[cnt]);
		} 
		System.out.println(total);
		
		System.out.println("10진수 : "+ total + "\t 2진수 : " + Integer.toBinaryString(total));
		System.out.println("10진수 : "+ total + "\t 8진수 : " + Integer.toOctalString(total));
		System.out.println("10진수 : "+ total + "\t 16진수 : " + Integer.toHexString(total));
	}

}
