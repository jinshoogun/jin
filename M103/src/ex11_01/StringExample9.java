package ex11_01;

public class StringExample9 {
	public static void main (String []args){
		String message = "Java program creates many objects.";
		// �޼��� ���� ����
		int len = message.length();
		// ���ڼ��� ������ ���մϴ�. "������"�� ���̴� 3�̴�.
		// �迭ũ��� �迭�̸� .length�� ���մϴ�. ��) arr.length();
		// ���ڿ� ������ String.length()�� ���մϴ�. ��)message.length();
		// �ڷᱸ�������� �ڷᱸ��.size()�� ������ ���Ѵ�. ��) li.size();
		
		System.out.println("�� ���ڼ� = " + len); //len =34;
		System.out.println("====������ index ��ġ ã��===");
		// message �߿��� ' '�� ã��
		
		for (int n = 0; n <len; n++){
			char c= message.charAt(n); // i��° ���ڸ� �����Ѵ�.
			if (c == ' '){
				System.out.println("index = " + n);
			}
		}// for end 
	}

}
