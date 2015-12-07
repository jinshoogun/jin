package Q09_30_1;

public class StoreNum1 extends HeadQuarterStore {

	public StoreNum1() {
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println("\t\t1호점");
		System.out.println("--------------------------------------");
	}

	@Override
	public void orderKimChijjige() {
		System.out.println("김치찌개는 4,500원 입니다.");
	}

	@Override
	public void orderBuDaejjige() {
		System.out.println("부대찌개는 5,000원 입니다.");
	}

	@Override
	public void orderBiBimbap() {
		System.out.println("비빔밥은 6,000원 입니다.");
	}

	@Override
	public void orderSunDaeguk() {
		System.out.println("순대국은 판매 하지 않습니다.");
	}

	public void orderGongGibap() {
		System.out.println("공기밥은 1,000원 입니다.");
	}
}
