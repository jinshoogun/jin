package ex17_07;
//calcThread가 계산된 파이 값을 공유 영역에 쓰기도 전에 PrintThread가 공유영역의 데이터를 읽어갔기때문에 result 필드가 가지고 있던
// 기본값 0.0이 출력이 되었다.
public class MultithreadExample4 {
	public static void main(String args[]){
		CalcThread thread1 = new CalcThread();
		PrintThread thread2 = new PrintThread();
		SharedArea obj = new SharedArea();
		thread1.sharedArea = obj;
		thread2.sharedArea = obj;
		
		thread1.start();
		thread2.start();
		
		
	}

}
