package test.interceptor;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor{ //인터셉터 인터페이스 구현
	public void destroy() {}// 
	public void init() {
		System.out.println("init");
	} //프로그램 최초 동작시 적용할때 한번 읽음 
	
	// struts life cycle
	public String intercept(ActionInvocation arg0) throws Exception{
		System.out.println("intercept11");
		arg0.invoke();
		System.out.println("intercept22");
		return "ok";
	}
}
