package test.bean;
import java.sql.Timestamp;

public class DTO {
	private String id;
	private String pw;
	private String age;// 변수로 직접 접근하기 않기 위해 은닉화(private)
	private Timestamp reg;

	public void setId(String id) {//set하고변수 첫문자는 대문자
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setReg(Timestamp reg) {
		this.reg = reg;
	}

	public String getId(){ //리턴 타입이 있어야 해서 String을 사용
		return id;
	}
	
	public String getPw(){
		return pw;
	}
	
	public String getAge(){
		return age;
	}
	
	public Timestamp getReg(){
		return reg;
	}
}
