package ex09_12;

class EnumExample2 {
	public static void main(String args[]){
		
		printday("MONDAY");
		printday("TUESDAY");
		printday("FRIDAY");
		//printday("FRIDAY2"); - �������� FRIDAY2�� ���ٰ� �ؼ� (���� �˻絵 �Ϲ�)
	}
	
	static void printday(String name){
		Day day = Day.valueOf(name); //valueOf = ~~~���� ��, values  = ��� ��
		System.out.println(day);
	}

}
