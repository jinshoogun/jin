package Q10_01;

public class IPhone4 implements PhoneFunction{
	IPhone4() {

		System.out.println("");
		System.out.println("This iPhone4 Specs..");
	
	}
	
	public void callSenderReceive() {
   	 System.out.println("전화 송수신 : 가능");
   	 
	}
    public void canLte() {
   	 System.out.println("LTE 사용 : 불가능 ");
   	 
	}
    public void tvRemoteController() {
   	 System.out.println("TV 리모컨 사용 : 불가능 ");
   	 
	}

}


