package ex19_10;
// 기존 사격형 클래스에 메소드를 추가한 경우
// 에러 발생 : 직렬화 할 때 사용한 클래스와 역직렬화할때 사용한 클래스의 버전 다르기 때문에
public class Rectangle implements java.io.Serializable {
	public int width, height;

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	int getArea() {
		return width * height;
	}

}
// 실행방법
// 1. 아래 getArea 메소드의 주석을 달고 실행하는 경우 에러가 없음
// ObjectOutputExample7.java를 실행
// ObjectInputExample7.java를 실행


// 2. 아래 메소드의 주석을 푼후 - 에러 발생
// ObjectInputExample7.java를 실행

// ex19_10.Rectangle;
// local class incompatible: // 클래스가 호환이 되지 않는다.
// 스트림을 통해 읽어들인 파일 안에서 기록되어 있는 버전 번호
// stream classesc serialVersionUID = 3385310283108755664,
// 역 직렬화 프로그램이 사용한 클래스의 버전 번호
// local class serialVersionUID = 897037298772490158

// 이런 버젼 번호는 자바의 직렬화 매커니즘과 역직렬화 매커니즘의 실행이 딜때 자동으로 부여되는데 직렬화 기능 클래스의 내용이 그대로 하면 같은 번호가 
// 부여되고 클래스의 구성요소가 하나라도 바뀌면 완전히 다른 버젼번호가 부여된다.

// int getArea(){
// return width*height;
// }