package Q09_30_1;

public class StoreNum1 extends HeadQuarterStore {

	public StoreNum1() {
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.println("\t\t1ȣ��");
		System.out.println("--------------------------------------");
	}

	@Override
	public void orderKimChijjige() {
		System.out.println("��ġ��� 4,500�� �Դϴ�.");
	}

	@Override
	public void orderBuDaejjige() {
		System.out.println("�δ���� 5,000�� �Դϴ�.");
	}

	@Override
	public void orderBiBimbap() {
		System.out.println("������� 6,000�� �Դϴ�.");
	}

	@Override
	public void orderSunDaeguk() {
		System.out.println("���뱹�� �Ǹ� ���� �ʽ��ϴ�.");
	}

	public void orderGongGibap() {
		System.out.println("������� 1,000�� �Դϴ�.");
	}
}
