package ex07_02;

public class ClassExample2 {
	public static void main (String args[]){
		GoodsStock2 obj;
		obj = new GoodsStock2("52135", 200);
		System.out.println("상품코드 :" + obj.goodsCode);
		System.out.println("재고수량 :" + obj.stockNum);
		obj.addStock(1000);
		System.out.println("상품코드 :" + obj.goodsCode);
		System.out.println("상품코드 :" + obj.stockNum);
		obj.subtractStock(200);
		System.out.println("상품코드 :" + obj.goodsCode);
		System.out.println("상품코드 :" + obj.stockNum);
		int value = obj.subtractStock(1200);
		System.out.println("상품코드 :" + obj.goodsCode);
		System.out.println("상품코드 :" + obj.stockNum);
		System.out.println("돌려받은 값 : " + value);
		
		
	}

}
