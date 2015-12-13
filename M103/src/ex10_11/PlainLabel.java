package ex10_11;

// 컨트롤 + 1을 눌러 오버라이딩 메소드를 자동으로 생성이 된다.

public class PlainLabel implements Movable {
	int x, y;
	String str;

	PlainLabel(int x, int y, String str) {
		this.x = x;
		this.y = y;
		this.str = str;
	}

	public void moveTo(int x, int y) { // 고로 여기에 public 을 붙여서 적어야 합니다.
		this.x = x;
		this.y = y;
	}

}
