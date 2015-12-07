package com.naver;

public class CastingEx {
	public static void main(String[] args) {
		int i1 = 10;
		double d1 = i1;

		System.out.println("d1 데이터는 " + d1 + "입니다.");

		// ERROR FIRE !!!!!! () insert

		double d2 = 10.0;
		int i2 = (int) d2;
		System.out.println("i2 데이터는 " + i2 + "입니다.");

	}

}
