package ex07_15;

public class Accumulator {
	int total = 0;  
	static int grandTotal = 0;       //정적 필드를 선언하는 선언문 (단, 스테이트 다른 영역에서 따로 저장이 된다.)
	void accumulate(int amount) {
		total +=amount;
		grandTotal += amount;        // 정적 필드에서 amount 파라미티 값을 더하는 대입문
	}

	static int getGrandTotal(){
		return grandTotal;
	}
}
