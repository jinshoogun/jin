package DATADB2.bean;

import java.sql.Timestamp;

public class DTO {
	
    //member
	private String m_id;
	private String m_password; 
	private String m_name;
	private String m_email;
	private String m_sex;
	private String m_birth;
	private String m_phone;
	private Timestamp m_reg;
	
	//notice
	private int n_num; 
    private String n_writer;
    private String n_subject;
    private String n_content;
    private String n_password;
    private int n_readcount;
    private Timestamp n_reg_date;
    private int n_ref;
    private int n_re_step;	
    private int n_re_level;
    
    //event
    private int e_num; 
    private String e_writer;
    private String e_subject;
    private String e_content;
    private String e_password;
    private int e_readcount;
    private Timestamp e_reg_date;
    private int e_ref;
    private int e_re_step;	
    private int e_re_level;
    
  //comment event
    private int cmte_num;
    private String cmte_writer;
	private String cmte_content;
    private Timestamp cmte_reg_date;
    private int cmte_ref;
    
    
    
    
    public int getCmte_num() {
		return cmte_num;
	}
	public void setCmte_num(int cmte_num) {
		this.cmte_num = cmte_num;
	}
	public String getCmte_writer() {
		return cmte_writer;
	}
	public void setCmte_writer(String cmte_writer) {
		this.cmte_writer = cmte_writer;
	}
	public String getCmte_content() {
		return cmte_content;
	}
	public void setCmte_content(String cmte_content) {
		this.cmte_content = cmte_content;
	}
	public Timestamp getCmte_reg_date() {
		return cmte_reg_date;
	}
	public void setCmte_reg_date(Timestamp cmte_reg_date) {
		this.cmte_reg_date = cmte_reg_date;
	}
	public int getCmte_ref() {
		return cmte_ref;
	}
	public void setCmte_ref(int cmte_ref) {
		this.cmte_ref = cmte_ref;
	}
	public int getE_num() {
		return e_num;
	}
	public void setE_num(int e_num) {
		this.e_num = e_num;
	}
	public String getE_writer() {
		return e_writer;
	}
	public void setE_writer(String e_writer) {
		this.e_writer = e_writer;
	}
	public String getE_subject() {
		return e_subject;
	}
	public void setE_subject(String e_subject) {
		this.e_subject = e_subject;
	}
	public String getE_content() {
		return e_content;
	}
	public void setE_content(String e_content) {
		this.e_content = e_content;
	}
	public String getE_password() {
		return e_password;
	}
	public void setE_password(String e_password) {
		this.e_password = e_password;
	}
	public int getE_readcount() {
		return e_readcount;
	}
	public void setE_readcount(int e_readcount) {
		this.e_readcount = e_readcount;
	}
	public Timestamp getE_reg_date() {
		return e_reg_date;
	}
	public void setE_reg_date(Timestamp e_reg_date) {
		this.e_reg_date = e_reg_date;
	}
	public int getE_ref() {
		return e_ref;
	}
	public void setE_ref(int e_ref) {
		this.e_ref = e_ref;
	}
	public int getE_re_step() {
		return e_re_step;
	}
	public void setE_re_step(int e_re_step) {
		this.e_re_step = e_re_step;
	}
	public int getE_re_level() {
		return e_re_level;
	}
	public void setE_re_level(int e_re_level) {
		this.e_re_level = e_re_level;
	}
    
    
	public int getN_num() {
		return n_num;
	}
	public void setN_num(int n_num) {
		this.n_num = n_num;
	}
	public String getN_writer() {
		return n_writer;
	}
	public void setN_writer(String n_writer) {
		this.n_writer = n_writer;
	}
	public String getN_subject() {
		return n_subject;
	}
	public void setN_subject(String n_subject) {
		this.n_subject = n_subject;
	}
	public String getN_content() {
		return n_content;
	}
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	public String getN_password() {
		return n_password;
	}
	public void setN_password(String n_password) {
		this.n_password = n_password;
	}
	public Timestamp getN_reg_date() {
		return n_reg_date;
	}
	public void setN_reg_date(Timestamp n_reg_date) {
		this.n_reg_date = n_reg_date;
	}
	public int getN_readcount() {
		return n_readcount;
	}
	public void setN_readcount(int n_readcount) {
		this.n_readcount = n_readcount;
	}
	public int getN_ref() {
		return n_ref;
	}
	public void setN_ref(int n_ref) {
		this.n_ref = n_ref;
	}
	public int getN_re_step() {
		return n_re_step;
	}
	public void setN_re_step(int n_re_step) {
		this.n_re_step = n_re_step;
	}
	public int getN_re_level() {
		return n_re_level;
	}
	public void setN_re_level(int n_re_level) {
		this.n_re_level = n_re_level;
	}
	
	
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
	
	

	
}
