package ex06_02;

public class Change {
	public static void main (String args[]){
		int a = 10, b= 0, imsi;
		System.out.println("바꾸기전 \t a = " + a + "\t" + "b= " + b);
		
		imsi = a; //imsi = 10(a);
		a = b;    // a   = 0(b);
		b = imsi; // b   = 10(imsi);
		System.out.println("바꾸기 후  \t a = " + a + "\t" + "b= " + b);
	}

}
