package Q09_30;

public class StoreNum2 extends HeadQuarterStore {

	public StoreNum2() {
		System.out.println("");
		System.out.println("2ȣ��");
	}

	@Override
	public void orderKimChijjige() {
		System.out.println("��ġ��� 5,000�� �Դϴ�.");
	}

	@Override
	public void orderBuDaejjige() {
		System.out.println("�δ���� 5,000�� �Դϴ�.");
	}

	public void orderBiBimbap() {
		System.out.println("������� 5,000�� �Դϴ�.");
	}

	public void orderSunDaeguk() {
		System.out.println("���뱹�� 4,000�� �Դϴ�.");
	}

	public void orderGongGibap() {
		System.out.println("������� ���� �Դϴ�.");
	}

}
