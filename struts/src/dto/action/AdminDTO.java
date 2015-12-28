package dto.action;

import java.sql.Timestamp;

public class AdminDTO {
	private String a_id;
	private String a_password;
	private String a_email;
	private String a_phone;
	private Timestamp a_reg;

	public String getA_id() {
		return a_id;
	}

	public void setA_id(String a_id) {
		this.a_id = a_id;
	}

	public String getA_password() {
		return a_password;
	}

	public void setA_password(String a_password) {
		this.a_password = a_password;
	}

	public String getA_email() {
		return a_email;
	}

	public void setA_email(String a_email) {
		this.a_email = a_email;
	}

	public String getA_phone() {
		return a_phone;
	}

	public void setA_phone(String a_phone) {
		this.a_phone = a_phone;
	}

	public Timestamp getA_reg() {
		return a_reg;
	}

	public void setA_reg(Timestamp a_reg) {
		this.a_reg = a_reg;
	}

}
