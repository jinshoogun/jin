package ex14_01;
// Wrapper Ŭ������ ���ڿ� �Ƕ���͸� ���� �������� ��
// String -> int ��� �ΰ���
// 1. String - Integer - int �ٲٴ� ���
// 2. String - int (Integer.parseInt(args[cnt])

public class WrapperExample2_2 {
	public static void main(String args[]) {
		int total = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			System.out.println("args[" +cnt+"]"+"=" + args[cnt]);
		}
		//  ��� 1
		for (int cnt = 0; cnt < args.length; cnt++) {
		//  �Ķ���ͷ� ���� ���ڿ��� ������ Integer��ü�� �����մϴ�.
			Integer obj = new Integer(args[cnt]);
	    //  Integer ��ü�ȿ� �ִ� int���� �����ɴϴ�.
			total +=obj.intValue();
		}
		System.out.println("�� = "+ total);
		
		// ��� 2
		int total2 = 0;
		for (int cnt = 0; cnt < args.length; cnt++) {
			total2 += Integer.parseInt(args[cnt]);
		} //String -> int������ ��ȯ Integer.parseInt()�� ���
		System.out.println("�� = "+ total2);

	}
}
