package ex11_09;

import java.util.Random;

public class RandomExample4 {
	public static void main(String args[]){
		Random random = new Random(); //�Ķ���Ͱ� ���� ������
		
		//0���� 100�̸��� ������ ���� �߻�!
		//��� 0~99������ ������ ������ �߻�!
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		
		// 1���� 45������ ���� �߻�
		System.out.println("1~45������ �ݼ� �߻� : " + (random.nextInt(45)+1));
	}
}
