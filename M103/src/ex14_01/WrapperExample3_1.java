package ex14_01;

public class WrapperExample3_1 {
	public static void main(String args[]){
		int total = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			//�Ķ���ͷ� ���� ���ڿ��� intŸ���� ������ �ٲپ����� �ջ��մϴ�.
			total += Integer.parseInt(args[cnt]);
		} 
		System.out.println(total);
		
		System.out.println("10���� : "+ total + "\t 2���� : " + Integer.toBinaryString(total));
		System.out.println("10���� : "+ total + "\t 8���� : " + Integer.toOctalString(total));
		System.out.println("10���� : "+ total + "\t 16���� : " + Integer.toHexString(total));
	}

}
