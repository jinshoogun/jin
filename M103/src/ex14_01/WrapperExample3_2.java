package ex14_01;

public class WrapperExample3_2 {
	public static void main(String args[]){
		int total = 0;
		for (int cnt = 0; cnt < args.length; cnt++) 
			//�Ķ���ͷ� ���� ���ڿ��� intŸ���� ������ �ٲپ����� �ջ��մϴ�.
			total += Integer.parseInt(args[cnt]);
		
		
		//Wrapper Ŭ������ �����ڸ� ����ϴ� ���� �޼ҿ�������
		//�ڽ� - �⺻�� Ÿ���� ���� ��üȭ
		//int -> Integer
		Integer obj1 = Integer.valueOf(10);
		Integer obj2 = Integer.valueOf(10);

		
		//�Ȱ��� �⺻���� ������ valueOf�޼ҵ带 ������ ȣ���ϸ� ���� ��ü�� ���� �������� ������ �ȴ�.
		if(obj1 == obj2)
			System.out.println("obj1 == obj2");
		
		if (obj1.equals(obj2))
		    System.out.println("obj1.equals(obj2)");
		
		
		Integer obj3 = new Integer(10);
		Integer obj4 = new Integer(10);
		
		if(obj3 == obj4)
			System.out.println("obj3 == obj4");
		
		if (obj3.equals(obj4))
		    System.out.println("obj3.equals(obj4)");
	}

}
