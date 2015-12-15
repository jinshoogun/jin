package test.interceptor;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import test.action.HelloAction;

public class TestInterceptor implements Interceptor{ //���ͼ��� �������̽� ����
	public void destroy() {}// 
	public void init() {
	}
	// struts life cycle
	public String intercept(ActionInvocation arg0) throws Exception{
		Object obj = arg0.getAction();
		//HelloAction ha  = (HelloAction)obj; //HelloAction ���� ���ͼ��ͷ� ����
		//ha.test(100);
		if (obj instanceof TestImpl){
			// Ŭ������ ������ ��ӿ��θ� Ȯ���� �ϴ��� ���� �޼ҵ� (boolean)
			// Ŭ���� �� �����ʿ� �ִ� Ŭ������ �������� �����Ͻÿ�
			TestImpl t = (TestImpl)obj;
			t.test();
		}
		
		arg0.invoke();
		return "ok";
	}
}
