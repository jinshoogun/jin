package ex11_09;

import java.util.Random;

public class RandomExample4 {
	public static void main(String args[]){
		Random random = new Random(); //파라미터가 없는 생성자
		
		//0부터 100미만의 정수형 난수 발생!
		//고로 0~99까지의 정수형 난수가 발생!
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		
		// 1부터 45까지의 난수 발생
		System.out.println("1~45까지의 반수 발생 : " + (random.nextInt(45)+1));
	}
}
