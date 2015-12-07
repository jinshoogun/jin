package ex13_05;

public class GoodsStock {
	String goodsCode;
	int stockNum;

	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	//오버라이딩
	public String toString(){
		String str = "상품코드 : " + goodsCode + " 재고수량 : " + stockNum;
		return str;
	}
}
