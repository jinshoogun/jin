package ex11_02;

public class StringBuilderExample1 {
	public static void main(String args[]){
		StringBuilder sb = new StringBuilder("���ع��� ��λ��� ������  ");
		
		System.out.println(sb);
		
		// ���� ���ڿ����� �߰���
		System.out.println(sb.append("�⵵�� �����ϻ� "));
		
		//index�� 19�� ���� "�ϴ����� �ϴ����� "�� ����
		System.out.println(sb.insert(19, "�ϴ����� �ϴ����� "));
		
		//index�� 24���� 27���� ���ڿ� ����
		System.out.println(sb.delete(24, 28));
		
		// index�� 9�� ���� ���� �Ѱ��� ����
		System.out.println(sb.deleteCharAt(9));
	}

}
