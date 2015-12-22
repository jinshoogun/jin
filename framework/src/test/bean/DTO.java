package test.bean;

import java.sql.Timestamp;
import java.util.Date;

public class DTO {

	private String id;
	private String pw;
	private int age;
	private Timestamp reg;
	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public DTO() {
	}

	public DTO(String id, Date date) {
		this.id = id;
		this.date = date;
	}
	public DTO(Date date){
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Timestamp getReg() {
		return reg;
	}

	public void setReg(Timestamp reg) {
		this.reg = reg;
	}
}
