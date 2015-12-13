package ex14_01;

public class WrapperExample3_2 {
	public static void main(String args[]){
		int total = 0;
		for (int cnt = 0; cnt < args.length; cnt++) 
			//파라미터로 받은 문자열을 int타입의 값으로 바꾸어져서 합산합니다.
			total += Integer.parseInt(args[cnt]);
		
		
		//Wrapper 클래스의 생성자를 대신하는 정적 메소오오오드
		//박싱 - 기본형 타입의 값을 객체화
		//int -> Integer
		Integer obj1 = Integer.valueOf(10);
		Integer obj2 = Integer.valueOf(10);

		
		//똑같은 기본값을 가지고 valueOf메소드를 여러번 호출하면 같은 객체애 대한 참조값이 리턴이 된다.
		if(obj1 == obj2)
			System.out.println("obj1 == obj2");
		
		if (obj1.equals(obj2))
		    System.out.println("obj1.equals(obj2)");
		
		
		Integer obj3 = new Integer(10);
		Integer obj4 = new Integer(10);
		
		if(obj3 == obj4)
			System.out.println("obj3 == obj4");
		
		if (obj3.equals(obj4))
		    System.out.println("obj3.equals(obj4)");
	}

}
