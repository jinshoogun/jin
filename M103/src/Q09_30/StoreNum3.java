package Q09_30;

public class StoreNum3 extends HeadQuarterStore {

	public StoreNum3() {
		System.out.println("");
		System.out.println("3ȣ��");
	}

	@Override
	public void orderKimChijjige() {
		System.out.println("��ġ��� 6,000�� �Դϴ�.");
	}

	@Override
	public void orderBuDaejjige() {
		System.out.println("�δ���� 7,000�� �Դϴ�.");
	}

	public void orderBiBimbap() {
		System.out.println("������� 7,000�� �Դϴ�.");
	}

	public void orderSunDaeguk() {
		System.out.println("���뱹�� 6,000�� �Դϴ�.");
	}

	public void orderGongGibap() {
		System.out.println("������� 1,000�� �Դϴ�.");
	}
}
