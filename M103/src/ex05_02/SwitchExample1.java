package ex05_02;

public class SwitchExample1 {
	public static void main (String args[]){		
		int num = 1;
		switch (num){
		case 1:
			System.out.println("Good Morning! Java.");
		    break; // 스위치문 강제 종료시 사용합니다 안쓰면 아래 스위치문 전부다 실행
		case 2:
			System.out.println("Good Aftermoon! Java.");
		    break;
		case 3:
			System.out.println("Good Evenning! Java.");
		    break;	
		default:
			System.out.println("Hello! Java.");
		    break;    
		}
		System.out.println("Done.");
		
	}

}
