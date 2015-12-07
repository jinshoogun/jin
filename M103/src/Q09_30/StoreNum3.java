package Q09_30;

public class StoreNum3 extends HeadQuarterStore {

	public StoreNum3() {
		System.out.println("");
		System.out.println("3호점");
	}

	@Override
	public void orderKimChijjige() {
		System.out.println("김치찌개는 6,000원 입니다.");
	}

	@Override
	public void orderBuDaejjige() {
		System.out.println("부대찌개는 7,000원 입니다.");
	}

	public void orderBiBimbap() {
		System.out.println("비빔밥은 7,000원 입니다.");
	}

	public void orderSunDaeguk() {
		System.out.println("순대국은 6,000원 입니다.");
	}

	public void orderGongGibap() {
		System.out.println("공기밥은 1,000원 입니다.");
	}
}
