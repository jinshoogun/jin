package ex05_03;

public class Do_While01 {
	public static void main(String args[]){
		int cnt = 1;
		do {
		   System.out.println(cnt);
		   cnt = cnt + 2;
		} while (cnt<=10);
		System.out.println("1~10 Ȧ�� ��� �Ϸ�.");
		System.out.println();
         int cnt1 = 2;
	     do {
		   System.out.println(cnt1);
		   cnt1 = cnt1 + 2;
		} while (cnt1<=10);
		System.out.println("1~10 ¦�� ��� �Ϸ�.");
		System.out.println();
		
		int sum = 0;
		cnt = 1;
		do {sum = sum + cnt; 
			cnt = cnt+1 ;
	   
		} while (cnt <= 10) ;

		    System.out.println(sum);
			System.out.println("1~10���� ���� ��� �Ϸ�.");
			System.out.println();
	
			
		sum = 0;
		cnt = 1;
		do {sum = sum + cnt; 
			cnt = cnt+2 ;
		   
			} while (cnt <= 10) ;

			    System.out.println(sum);
				System.out.println("1~10���� Ȧ�� ���� ��� �Ϸ�.");
				System.out.println();		
	
		sum = 0;
		cnt = 2;
		do {sum = sum + cnt; 
			cnt = cnt+2 ;
		   } while (cnt <= 10) ;

					    System.out.println(sum);
						System.out.println("1~10���� ¦�� ���� ��� �Ϸ�.");
						System.out.println();				
	}
	
	
}
