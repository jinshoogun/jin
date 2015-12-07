package ex13_10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectExample9 {
	public static void main(String args[]) {
		Rectangle obj = new Rectangle(10, 20);
		Class cls = obj.getClass(); // 객체가 속하는 클래스의 정보를 리턴합니다.
		String name = cls.getName();
		System.out.println("클래스 이름 : " + name);

		Class superCls = cls.getSuperclass(); // 슈퍼클래스의 정보를 리턴하는 메소오오오드
		String superName = superCls.getName(); // 슈퍼클래스의 이름을 리턴하는 메소오오오드
		System.out.println("슈퍼클래스 이름 : " + superName);

		// 클래스에 선언되어 있는 정보를 가져오는 메소오오드
		Field field[] = cls.getDeclaredFields();
		System.out.println("필드 : ");
		for (int cnt = 0; cnt < field.length; cnt++)
			System.out.println("   " + field[cnt]);

		// 클래스에 선언되어 있는 메소드 정보를 가져오는 메소드
		Method method[] = cls.getDeclaredMethods();
		System.out.println("메서드 : ");
		for (int cnt = 0; cnt < method.length; cnt++)
			System.out.println("   " + method[cnt]);
	}
}
