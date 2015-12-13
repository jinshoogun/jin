package ex06_01;

import java.util.Scanner;

public class ArrayTest06 {
	public static void main(String args[]){
		String[] names = new String[] {"홍길동", "전우치", "홍길동","세종대왕", "김길동"};
		Scanner sc = new Scanner (System.in);
		int index = -1; // 몇번 방에 들어있는지 확인하는 변수로 초기값 -1은 인덱스와 겹치지 않게
		
		System.out.println();
		System.out.println("검색할 이름을 입력하세요.");
		System.out.println("이름:");
		String inputname = sc.next();
		
		for (int i = 0; i < names.length; i++){
			if (inputname.equals(names[i])){
				index = i;
			}
		}
		if (index != -1) {
			System.out.println(inputname + "은 배열의 " + index + "방에서 찾았습니다.");
		} else 
			System.out.println(inputname + "은 배열방에서 찾지 못했습니다.");
	}

}
