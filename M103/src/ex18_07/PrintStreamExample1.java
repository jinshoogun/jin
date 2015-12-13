package ex18_07;

import java.util.GregorianCalendar;

public class PrintStreamExample1 {
	public static void main(String args[]){
		System.out.println("       ***성적표***         ");
	    System.out.printf("%3s : %3d %3d %3d %5.1f %n", "김지영", 92, 87, 95, 91.3f);
	    System.out.printf("%3s : %3d %3d %3d %5.1f %n", "박현식", 100, 90, 88, 92.7f);
	    System.out.printf("%3s : %3d %3d %3d %5.1f %n", "최민재", 75, 88, 85, 82.7f);
	    System.out.printf("작성일자 : %1$tY년 %1$tm월 %1$td일 %1$tH시 %1$tm분 ", new GregorianCalendar());
	    System.out.println();
	    System.out.printf("작성일자 : %1$ty년 %1$tm월 %1$td일 %1$ta요일 %1$tp %1$tl시 %1$tm분 %1$tS초", new GregorianCalendar());
	}
}
//년도 : Y-4자리 , y-2자리
// 월 : m(01~12), B (예  January)
// 일 : d - (1~31), e - (01~31)
// 요일 : A - (Sunday), a - (sun)
// 오전/오후 : p
// 시 : H(00~23), I(대문자)  -(01~12) , k (0~23), l(소문자)(1~12)
// 분 : M(00-59)
// 초 : S (00~59)
// mm/dd/yy 포맷 : D
// YYYY-mm-dd 포맷 :F
// HH:MM 포맷 : R
// HH:MM:SS 포맷 : T