package obj140.bean;

import java.sql.Timestamp;

public class DTO {

	private String id;
	private String pw;
	private String add;
	private String phfirst;
	private String phsec;
	private String phthr;
	private String mailId;
	private String domain;
	private String domain1;
	private String a;
	private String b;
	private String nick;
	private String intru;
	private String na;
	private Timestamp reg;
	private String phone = phfirst +" - "+ phsec + " - " + phthr;
	private String email = mailId + "@" + domain;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMailId() {
		return mailId;
	}

	
	public void setId(String id) {
	
			if (id.length() > 5)
				this.id = id;
	}

	public void setNa(String na) {
		
			if (na.length() > 1)
				this.na = na;
	}

	public void setPw(String pw) {
		
			if (pw.length() > 5)
				this.pw = pw;
	}

	public void setAdd(String add) {
		
			this.add = add;
	}

	public void setPhfirst(String phfirst) {
	
			this.phfirst = phfirst;
	}

	public void setPhsec(String phsec) {
		
			if (phsec.length() == 3 || phsec.length() == 4)
				this.phsec = phsec;

	}

	public void setPhthr(String phthr) {
		
			if (phthr.length() == 4)
				this.phthr = phthr;

	}

	public void setMailId(String mailId) {
			if (mailId.length() > 5)
				this.mailId = mailId;
		
	}

	public void setDomain(String domain) {
		
			this.domain = domain;
		
	}

	public void setDomain1(String domain1) {
		
			if (!domain1.equals("직접입력"))
				domain = domain1;
			this.domain1 = domain1;
	
	}

	public void setA(String a) {
		
			this.a = a;
	
	}

	public void setB(String b) {
	
			this.b = b;

	}

	public void setNick(String nick) {
	
			if (nick.length() > 1)
			this.nick = nick;
		
	}

	public void setIntru(String intru) {
			this.intru = intru;
		
	}
	public void setReg(Timestamp reg) {
		this.reg = reg;
	}

	public String getId() {
		return id;
	}
	public String getNa() {
		return na;
	}

	public String getPw() {
		return pw;
	}

	public String getAdd() {
		return add;
	}

	public String getPhfirst() {
		return phfirst;
	}

	public String getPhsec() {
		return phsec;
	}

	public String getPhthr() {
		return phthr;
	}

	public String getmailId() {
		return mailId;
	}

	public String getDomain() {
		return domain;
	}

	public String getDomain1() {
		return domain1;
	}

	public String getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public String getNick() {
		return nick;
	}

	public String getIntru() {
		return intru;
	}
	public Timestamp getReg(){
		return reg;
	}

}
