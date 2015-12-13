package ex07_06;

public class SubscriberInfo {
	String name, id, password;
	String phoneNo, address;

	SubscriberInfo(String name, String id, String password){
		this.name  = name;
		this.id = id;
		this.password = password;
	}
	SubscriberInfo(String name, String id, String password, String phoneNo, String address){
	    this(name, id, password);
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	void changerPassword(String password){
		this.password = password; 
	}
	void setPhoneNo(String phoneNo){
		this.phoneNo = phoneNo;
	}
	void setAddress(String address){
		this.address = address;
	}
		
	}


