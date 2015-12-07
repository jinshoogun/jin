package PhotoBoard;
import java.sql.Timestamp;

public class DTO{

	private int p_num; 
    private String p_writer;
    private String p_subject;
    private String p_content;
    private String p_password;
    private Timestamp p_reg_date;
    private int p_readcount;
    private int p_ref;
    public int getP_num() {
		return p_num;
	}
	public void setP_num(int p_num) {
		this.p_num = p_num;
	}
	public String getP_writer() {
		return p_writer;
	}
	public void setP_writer(String p_writer) {
		this.p_writer = p_writer;
	}
	public String getP_subject() {
		return p_subject;
	}
	public void setP_subject(String p_subject) {
		this.p_subject = p_subject;
	}
	public String getP_content() {
		return p_content;
	}
	public void setP_content(String p_content) {
		this.p_content = p_content;
	}
	public String getP_password() {
		return p_password;
	}
	public void setP_password(String p_password) {
		this.p_password = p_password;
	}
	public Timestamp getP_reg_date() {
		return p_reg_date;
	}
	public void setP_reg_date(Timestamp p_reg_date) {
		this.p_reg_date = p_reg_date;
	}
	public int getP_readcount() {
		return p_readcount;
	}
	public void setP_readcount(int p_readcount) {
		this.p_readcount = p_readcount;
	}
	public int getP_ref() {
		return p_ref;
	}
	public void setP_ref(int p_ref) {
		this.p_ref = p_ref;
	}
	public int getP_re_step() {
		return p_re_step;
	}
	public void setP_re_step(int p_re_step) {
		this.p_re_step = p_re_step;
	}
	public int getP_re_level() {
		return P_re_level;
	}
	public void setP_re_level(int p_re_level) {
		P_re_level = p_re_level;
	}
	private int p_re_step;	
    private int P_re_level;
    
}

