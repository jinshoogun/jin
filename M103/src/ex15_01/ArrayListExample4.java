package ex15_01;

import java.util.ArrayList;
import java.util.List;

// ���׸� ���

public class ArrayListExample4 {
	public static void main(String args[]){
		List <String> list = new ArrayList<String>(); 
		//ArrayList ��ü ����
		
		// list�� 3�� ������ �߰�
		list.add("����");
		list.add("����");       
		list.add("������");   
		
		int num = list.size(); //list�ȿ� �ִ� �������� ���� ���ϴ� �޼ҼҼҿ��˵�
		
		//list�� �ִ� �������� ����ŭ �ݺ��ϸ鼭 �����͸� �����ͼ� ���
		for (int cnt = 0; cnt <num; cnt++){
			//get(index)�޼ҼҼҼҿ������带 ����Ͽ� index ��ġ�� �ִ� �ڷḦ ������ �´�
			String str = list.get(cnt);
			System.out.println(str);
		}
	}
}
