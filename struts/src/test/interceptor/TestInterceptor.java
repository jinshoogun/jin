package test.interceptor;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor{ //���ͼ��� �������̽� ����
	public void destroy() {}// 
	public void init() {
		System.out.println("init");
	} //���α׷� ���� ���۽� �����Ҷ� �ѹ� ���� 
	
	// struts life cycle
	public String intercept(ActionInvocation arg0) throws Exception{
		System.out.println("intercept11");
		arg0.invoke();
		System.out.println("intercept22");
		return "ok";
	}
}
