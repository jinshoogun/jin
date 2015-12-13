package ex13_04;

public class ObjectExample3 {
	public static void main(String args[]) {
		GoodsStock obj = new GoodsStock("57293", 100);
		String str = "재고정보  = " + obj;
		// 문자열과 GoodsStock 객체 변수를 +연산자로 연결하면 그 객체의 toString 메소드가 호출된 후 문자열이
		// 연결된다.

		System.out.println(str);
	}

}