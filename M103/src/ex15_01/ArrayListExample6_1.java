package ex15_01;
// ArrayList�� �����͸� ����/����/�����ϴ� ��
// indexOf(data) : �Ķ���Ϳ� ���� ���� ���� ù��° �����͸� ã�Ƽ� ����ġ�� �ε����� ����
// lastIndexOf(data) : �Ķ���Ϳ� ���� ���� ���������� ������� �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
// �Ķ���Ϳ� ���� ���� ���ٸ� -1�� ����
import java.util.ArrayList;
import java.util.List;

// ���׸� ���

public class ArrayListExample6_1 {
	public static void main(String args[]){
		ArrayList <String> list = new ArrayList<String>(); 
		
		list.add("�ӷ�");
		list.add("���");
		list.add("�޵�");       
		list.add("�ڵ�");   
		list.add("���");
		
		int index1 = list.indexOf("���");
		int index2 = list.lastIndexOf("���");
		System.out.println("ù��° ��� : " + index1);
		System.out.println("������ ��� : " + index2);		
	}
}
