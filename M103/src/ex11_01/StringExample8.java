package ex11_01;

public class StringExample8 {
	public static void main(String args[]){
		String message = "Java program creates many objects.";
		String message2 = "Java programaaaaaaa creates many objects.";			
		// index�� ���ϴ� �޼ҵ�, �������� �ִ� ��� ���� ���� ������ index�� ���Ѵ�.
		int index1 = message.indexOf('a');
		
		// �����ε� �޼ҵ�, �ƽ�Ű �ڵ� 97�� �ҹ��� 'a'
		int index2 = message.indexOf(97);
		
		//�ƽ�ũ �ڵ� 65�� �빮�� 'A'
		int index3 = message.indexOf(65);
		
		System.out.println("a�� ��ġ�� " + index1);
		System.out.println("a�� ��ġ�� " + index2);

		
		int index23 = message.indexOf(65);
		// 'A'�� �������� index ���� -1�� ��ȯ�Ѵ�.
		System.out.println("a�� ��ġ�� " + index23);
		
		// index��ȣ 13��°���� a�� ã��
		int index33 = message2.indexOf('a', 13); // int���� ���ǳ� indexOf�� char�ϸ� �ڵ����� �ƽ�Ű�ڵ尪���� ��ȯ��.
		System.out.println("13������ a�� ��ġ�� " + index33);
		
		//av�� �����ϴ� index ���ϱ�
		int index4 = message.indexOf("av");
		System.out.println("av�� ���۵Ǵ� index�� " + index4);
		
		//index ��ȣ 12��°���� man���� ���۵Ǵ� index ã��
		int index5 = message.indexOf("man", 1);
		System.out.println("12������ man ��ġ�� " + index5);
		
		//java�� ���۵Ǵ� index ���ϱ�
		int index6 = message.indexOf("java");
		System.out.println("Java�� ��ġ�� " + index6);
	}

}
