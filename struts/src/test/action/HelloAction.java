package test.action;

import com.opensymphony.xwork2.Action;
import test.interceptor.TestImpl;

public class HelloAction implements Action, TestImpl {
	public String execute() { // �ڹ��� main �޼ҿ�������
		// test �޼ҿ��带 ȣ���ϰ� ���� ���? web.xml action name="hello"
		// class="test.action.HelloAction" method ="test">�� �߰� �۾� �ǽ��ϸ� �˴ϴ�.
		// System.out.println("execute"); - ��Ʈ�ѷ��� ���ư��� ������ ���ͼ��͸� ������ �� �����̴�
		System.out.println("execute");
		return "success"; // return�� �־�� �ǰ� �⺻�� success�� �Ǿ�� �մϴ�.
		// ��ΰ� ���ۼ� struts.xml���� �ۼ�
		// return �̸��� �ٲٰ� ���� ���? web.xml <result name = "ok">�� �߰� �۾� �ǽ��ϸ� �˴ϴ�.
	}

	public void test() {
		System.out.println("test");
	}
}