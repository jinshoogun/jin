package Q09_30_1;

public class StoreNum2 extends HeadQuarterStore {

	public StoreNum2() {
		System.out.println("--------------------------------------");
		System.out.println("\t\t2호점");
		System.out.println("--------------------------------------");
	}

	@Override
	public void orderKimChijjige() {
		System.out.println("김치찌개는 5,000원 입니다.");
	}

	@Override
	public void orderBuDaejjige() {
		System.out.println("부대찌개는 5,000원 입니다.");
	}

	public void orderBiBimbap() {
		System.out.println("비빔밥은 5,000원 입니다.");
	}

	public void orderSunDaeguk() {
		System.out.println("순대국은 4,000원 입니다.");
	}

	public void orderGongGibap() {
		System.out.println("공기밥은 무료 입니다.");
	}

}
