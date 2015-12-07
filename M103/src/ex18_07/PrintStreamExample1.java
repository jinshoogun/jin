package ex18_07;

import java.util.GregorianCalendar;

public class PrintStreamExample1 {
	public static void main(String args[]){
		System.out.println("       ***����ǥ***         ");
	    System.out.printf("%3s : %3d %3d %3d %5.1f %n", "������", 92, 87, 95, 91.3f);
	    System.out.printf("%3s : %3d %3d %3d %5.1f %n", "������", 100, 90, 88, 92.7f);
	    System.out.printf("%3s : %3d %3d %3d %5.1f %n", "�ֹ���", 75, 88, 85, 82.7f);
	    System.out.printf("�ۼ����� : %1$tY�� %1$tm�� %1$td�� %1$tH�� %1$tm�� ", new GregorianCalendar());
	    System.out.println();
	    System.out.printf("�ۼ����� : %1$ty�� %1$tm�� %1$td�� %1$ta���� %1$tp %1$tl�� %1$tm�� %1$tS��", new GregorianCalendar());
	}
}
//�⵵ : Y-4�ڸ� , y-2�ڸ�
// �� : m(01~12), B (��  January)
// �� : d - (1~31), e - (01~31)
// ���� : A - (Sunday), a - (sun)
// ����/���� : p
// �� : H(00~23), I(�빮��)  -(01~12) , k (0~23), l(�ҹ���)(1~12)
// �� : M(00-59)
// �� : S (00~59)
// mm/dd/yy ���� : D
// YYYY-mm-dd ���� :F
// HH:MM ���� : R
// HH:MM:SS ���� : T