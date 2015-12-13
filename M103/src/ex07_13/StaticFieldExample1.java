package ex07_13;

public class StaticFieldExample1 {
	public static void main (String args[]){
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();		
		obj1.accumulate(10);
		obj2.accumulate(20);
		System.out.println("obj1. total =" + obj1.total);
		System.out.println("obj1. total =" + Accumulator.grandTotal);
		System.out.println("obj2. total =" + obj2.total);
		System.out.println("obj2. total =" + Accumulator.grandTotal);		
	}

}
