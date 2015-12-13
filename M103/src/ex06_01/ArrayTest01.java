package ex06_01;

public class ArrayTest01 {
	public static void main (String args[]){
		int score[] = {95, 70, 80, 75, 100};
		int sum = 0;
		int i;
		for (i = 0; i < 5/*score.length*/; i++){
			System.out.println("score[" + i + "]" + "=" + score[i]);
		
	     //System.out.println("รัมก = " + (score[0] + score[1] + score[2] + score[3] + score[4]));	   
	    sum = sum + score [i];
		}
	    System.out.println("รัมก = " + sum);
	}
}

