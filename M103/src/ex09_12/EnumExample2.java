package ex09_12;

class EnumExample2 {
	public static void main(String args[]){
		
		printday("MONDAY");
		printday("TUESDAY");
		printday("FRIDAY");
		//printday("FRIDAY2"); - 열거형에 FRIDAY2는 없다고 해서 (내용 검사도 하뮤)
	}
	
	static void printday(String name){
		Day day = Day.valueOf(name); //valueOf = ~~~중의 값, values  = 모든 값
		System.out.println(day);
	}

}
