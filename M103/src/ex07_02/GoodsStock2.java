package ex07_02;

public class GoodsStock2 {
		String goodsCode;
		int stockNum;
		GoodsStock2(String code, int num){
			goodsCode = code;
			stockNum = num;
		}
		void addStock(int amount) {
			stockNum += amount;
		}
		int subtractStock (int amount){
			if (stockNum < amount){
				stockNum = 0;
				return 0;}
			stockNum -= amount;
			return amount;
		}
	}


