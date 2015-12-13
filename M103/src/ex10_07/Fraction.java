package ex10_07;

class Fraction {
	
	private int numerator; //분자
	private int denominater; //분모
	Fraction (int numerator, int denominater){ // 생성자
		this.numerator = numerator;
		this.denominater = denominater;
	
	}

	 double getDouble(){ // 분수의 어림값을 double타입으로 변경
		return (double) numerator /  denominater;
		
	}
	
	int getInt(){ // 분수의 어림값을 int 타입으로 변경
		return (int) getDouble();
	}
}
