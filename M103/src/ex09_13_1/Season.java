package ex09_13_1;

enum Season {
	SPRING("��"), SUMMER("����"), FALL("����"), WINTER("�ܿ�");
	
	final private String name;
	private Season (String name){ 
		this.name = name;
		//System.out.println("������ " + name + "ȣ��");
	}
	String value (){
		return name;
	}

}
