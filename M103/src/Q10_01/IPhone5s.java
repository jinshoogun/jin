package Q10_01;

public class IPhone5s implements PhoneFunction{
	IPhone5s() {

		System.out.println("");
		System.out.println("This iPhone5s Specs..");
	
	}
	
	public void callSenderReceive() {
   	 System.out.println("전화 송수신 : 가능");
   	 
	}
    public void canLte() {
   	 System.out.println("LTE 사용 : 가능 ");
   	 
	}
    public void tvRemoteController() {
   	 System.out.println("TV 리모컨 사용 : 불가능 ");
   	 
	}

}


