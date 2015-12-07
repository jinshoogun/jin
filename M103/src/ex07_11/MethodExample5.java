package ex07_11;

public class MethodExample5 {
	public static void main(String args[]) {
		Account obj = new Account("777-777-77777777", "최대박", 10);
		try {
			int amount = obj.withdraw (100000000);
		    System.out.println("인출액 : " + amount);
		}
		catch (Exception e) { //구체적인 에러를 모를때 사용하는데 (광범위한걸로 확인)
			String msg = e.getMessage();
			System.out.println(msg);
		}

	}
}
