package ex07_02;

public class ClassExample2 {
	public static void main (String args[]){
		GoodsStock2 obj;
		obj = new GoodsStock2("52135", 200);
		System.out.println("��ǰ�ڵ� :" + obj.goodsCode);
		System.out.println("������ :" + obj.stockNum);
		obj.addStock(1000);
		System.out.println("��ǰ�ڵ� :" + obj.goodsCode);
		System.out.println("��ǰ�ڵ� :" + obj.stockNum);
		obj.subtractStock(200);
		System.out.println("��ǰ�ڵ� :" + obj.goodsCode);
		System.out.println("��ǰ�ڵ� :" + obj.stockNum);
		int value = obj.subtractStock(1200);
		System.out.println("��ǰ�ڵ� :" + obj.goodsCode);
		System.out.println("��ǰ�ڵ� :" + obj.stockNum);
		System.out.println("�������� �� : " + value);
		
		
	}

}
