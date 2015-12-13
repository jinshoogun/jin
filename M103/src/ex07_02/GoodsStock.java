package ex07_02;

public class GoodsStock {
		String goodsCode;
		int stockNum;
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


