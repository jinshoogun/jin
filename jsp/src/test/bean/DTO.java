package test.bean;
import java.sql.Timestamp;

public class DTO {
	private String id;
	private String pw;
	private String age;// ������ ���� �����ϱ� �ʱ� ���� ����ȭ(private)
	private Timestamp reg;

	public void setId(String id) {//set�ϰ��� ù���ڴ� �빮��
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

	public String getId(){ //���� Ÿ���� �־�� �ؼ� String�� ���
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
