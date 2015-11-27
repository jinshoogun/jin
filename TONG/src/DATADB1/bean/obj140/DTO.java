package DATADB1.bean.obj140;

import java.sql.Timestamp;

public class DTO {
	private int q_num;
	private String q_writer;
	private String q_subject;
	private String q_content;
	private String q_password2; // 게시판 비번
	private Timestamp q_reg_date;
	private int q_readcount;
	private int q_ref;
	private int q_re_step;
	private int q_re_level;
	public int getQ_num() {
		return q_num;
	}
	public void setQ_num(int q_num) {
		this.q_num = q_num;
	}
	public String getQ_writer() {
		return q_writer;
	}
	public void setQ_writer(String q_writer) {
		this.q_writer = q_writer;
	}
	public String getQ_subject() {
		return q_subject;
	}
	public void setQ_subject(String q_subject) {
		this.q_subject = q_subject;
	}
	public String getQ_content() {
		return q_content;
	}
	public void setQ_content(String q_content) {
		this.q_content = q_content;
	}
	public String getQ_password2() {
		return q_password2;
	}
	public void setQ_password2(String q_password2) {
		this.q_password2 = q_password2;
	}
	public Timestamp getQ_reg_date() {
		return q_reg_date;
	}
	public void setQ_reg_date(Timestamp q_reg_date) {
		this.q_reg_date = q_reg_date;
	}
	public int getQ_readcount() {
		return q_readcount;
	}
	public void setQ_readcount(int q_readcount) {
		this.q_readcount = q_readcount;
	}
	public int getQ_ref() {
		return q_ref;
	}
	public void setQ_ref(int q_ref) {
		this.q_ref = q_ref;
	}
	public int getQ_re_step() {
		return q_re_step;
	}
	public void setQ_re_step(int q_re_step) {
		this.q_re_step = q_re_step;
	}
	public int getQ_re_level() {
		return q_re_level;
	}
	public void setQ_re_level(int q_re_level) {
		this.q_re_level = q_re_level;
	}



}