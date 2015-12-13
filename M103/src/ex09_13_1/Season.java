package ex09_13_1;

enum Season {
	SPRING("봄"), SUMMER("여름"), FALL("가을"), WINTER("겨울");
	
	final private String name;
	private Season (String name){ 
		this.name = name;
		//System.out.println("생성자 " + name + "호출");
	}
	String value (){
		return name;
	}

}
