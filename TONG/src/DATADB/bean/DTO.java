package DATADB.bean;

import java.sql.Timestamp;

public class DTO {

	// -------------- 일반회원 ----------------------
	private String m_id;
	private String m_password;
	private String m_name;
	private String m_email;
	private String m_sex;
	private String m_birth;
	private String m_phone;
	private Timestamp m_reg;
	private int m_num;

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getM_sex() {
		return m_sex;
	}

	public void setM_sex(String m_sex) {
		this.m_sex = m_sex;
	}

	public String getM_birth() {
		return m_birth;
	}

	public void setM_birth(String m_birth) {
		this.m_birth = m_birth;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	public Timestamp getM_reg() {
		return m_reg;
	}

	public void setM_reg(Timestamp m_reg) {
		this.m_reg = m_reg;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	// -----------------디자이너 회원----------------------------

	private int d_num;
	private String d_id;
	private String d_password;
	private String d_name;
	private String d_nickname;
	private String d_email;
	private String d_sex;
	private String d_birth;
	private String d_phone;
	private String d_store;
	private Timestamp d_date;

	public int getD_num() {
		return d_num;
	}

	public void setD_num(int d_num) {
		this.d_num = d_num;
	}

	public String getD_id() {
		return d_id;
	}

	public void setD_id(String d_id) {
		this.d_id = d_id;
	}

	public String getD_password() {
		return d_password;
	}

	public void setD_password(String d_password) {
		this.d_password = d_password;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getD_nickname() {
		return d_nickname;
	}

	public void setD_nickname(String d_nickname) {
		this.d_nickname = d_nickname;
	}

	public String getD_email() {
		return d_email;
	}

	public void setD_email(String d_email) {
		this.d_email = d_email;
	}

	public String getD_sex() {
		return d_sex;
	}

	public void setD_sex(String d_sex) {
		this.d_sex = d_sex;
	}

	public String getD_birth() {
		return d_birth;
	}

	public void setD_birth(String d_birth) {
		this.d_birth = d_birth;
	}

	public String getD_phone() {
		return d_phone;
	}

	public void setD_phone(String d_phone) {
		this.d_phone = d_phone;
	}

	public String getD_store() {
		return d_store;
	}

	public void setD_store(String d_store) {
		this.d_store = d_store;
	}

	public Timestamp getD_date() {
		return d_date;
	}

	public void setD_date(Timestamp d_date) {
		this.d_date = d_date;
	}

}
