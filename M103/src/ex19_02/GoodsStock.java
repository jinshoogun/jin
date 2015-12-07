package ex19_02;
// 직렬화 가능 클래스를 만드는 예 - implements java.io.Serialable 
public class GoodsStock implements java.io.Serializable {
	String code;
	int num;

	GoodsStock(String code, int num){
		this.code = code;
		this.num = num;
	}void addStock (int num) {
		this.num +=num;
	}int substractStock(int num) throws Exception {
		if (this.num < num)
			throw new Exception("재고가 부족합니다.");
		this.num -= num;
		return num;

	}
}
	
	