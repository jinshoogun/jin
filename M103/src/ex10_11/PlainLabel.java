package ex10_11;

// ��Ʈ�� + 1�� ���� �������̵� �޼ҵ带 �ڵ����� ������ �ȴ�.

public class PlainLabel implements Movable {
	int x, y;
	String str;

	PlainLabel(int x, int y, String str) {
		this.x = x;
		this.y = y;
		this.str = str;
	}

	public void moveTo(int x, int y) { // ��� ���⿡ public �� �ٿ��� ����� �մϴ�.
		this.x = x;
		this.y = y;
	}

}
