package ex07_15;

public class Accumulator {
	int total = 0;  
	static int grandTotal = 0;       //���� �ʵ带 �����ϴ� ���� (��, ������Ʈ �ٸ� �������� ���� ������ �ȴ�.)
	void accumulate(int amount) {
		total +=amount;
		grandTotal += amount;        // ���� �ʵ忡�� amount �Ķ��Ƽ ���� ���ϴ� ���Թ�
	}

	static int getGrandTotal(){
		return grandTotal;
	}
}
