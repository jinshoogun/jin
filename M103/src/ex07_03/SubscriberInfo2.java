package ex07_03;

public class SubscriberInfo2 {
	String name, id, password;
	String phoneNo, address;
	SubscriberInfo2(){
	}
	
	SubscriberInfo2(String name, String id, String password){
		this.name  = name;
		this.id = id;
		this.password = password;
		
	}
	SubscriberInfo2(String name, String id, String password, String phoneNo, String address){
		this.name  = name;
		this.id = id;
		this.password = password;
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


