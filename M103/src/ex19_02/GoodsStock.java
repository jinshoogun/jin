package ex19_02;
// ����ȭ ���� Ŭ������ ����� �� - implements java.io.Serialable 
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
			throw new Exception("��� �����մϴ�.");
		this.num -= num;
		return num;

	}
}
	
	