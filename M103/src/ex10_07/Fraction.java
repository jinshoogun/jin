package ex10_07;

class Fraction {
	
	private int numerator; //����
	private int denominater; //�и�
	Fraction (int numerator, int denominater){ // ������
		this.numerator = numerator;
		this.denominater = denominater;
	
	}

	 double getDouble(){ // �м��� ����� doubleŸ������ ����
		return (double) numerator /  denominater;
		
	}
	
	int getInt(){ // �м��� ����� int Ÿ������ ����
		return (int) getDouble();
	}
}
