package ex06_01;

import java.util.Scanner;

public class ArrayTest06 {
	public static void main(String args[]){
		String[] names = new String[] {"ȫ�浿", "����ġ", "ȫ�浿","�������", "��浿"};
		Scanner sc = new Scanner (System.in);
		int index = -1; // ��� �濡 ����ִ��� Ȯ���ϴ� ������ �ʱⰪ -1�� �ε����� ��ġ�� �ʰ�
		
		System.out.println();
		System.out.println("�˻��� �̸��� �Է��ϼ���.");
		System.out.println("�̸�:");
		String inputname = sc.next();
		
		for (int i = 0; i < names.length; i++){
			if (inputname.equals(names[i])){
				index = i;
			}
		}
		if (index != -1) {
			System.out.println(inputname + "�� �迭�� " + index + "�濡�� ã�ҽ��ϴ�.");
		} else 
			System.out.println(inputname + "�� �迭�濡�� ã�� ���߽��ϴ�.");
	}

}
