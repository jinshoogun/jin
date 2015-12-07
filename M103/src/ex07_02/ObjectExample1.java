package ex07_02;

public class ObjectExample1 {
	public static void main(String args[]){
		StringBuffer obj;
		obj = new StringBuffer("Hey, Java");
		obj.deleteCharAt(1); // 두번째 배열 문자 삭제
		obj.deleteCharAt(1);
		obj.insert(1, 'i'); // 두번째 배열의 이름추가
		System.out.println(obj);
	}

}
