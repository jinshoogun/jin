package ex07_00;

public class Saram5 {
	String name;
	double w;
	double ki;
	int age;
	
	Saram5 (String name, double w){
		name = name;
		
		this.name = name;
		this.w = w;
	}
	Saram5 (double w, String name){
		name = name;
		
		this.name = name;
		this.w = w;
	}
	public void eat(){
		System.out.println(name + "¹äÀ» ¸Ô´Â´Ù.");
	}
	
	public void walk(){
		System.out.println(name + "ÀÇ ¸ö¹«°Ô´Â " + w);
		
	}
	
	public void sesu(){
		System.out.println(name +"¼¼¼öÇÑ´Ù.");
	}
}
