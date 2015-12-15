package test.interceptor;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import test.action.HelloAction;

public class TestInterceptor implements Interceptor{ //인터셉터 인터페이스 구현
	public void destroy() {}// 
	public void init() {
	}
	// struts life cycle
	public String intercept(ActionInvocation arg0) throws Exception{
		Object obj = arg0.getAction();
		//HelloAction ha  = (HelloAction)obj; //HelloAction 전용 인터셉터로 사용됨
		//ha.test(100);
		if (obj instanceof TestImpl){
			// 클래스와 변수가 상속여부를 확인을 하는지 보는 메소드 (boolean)
			// 클래스 명 오른쪽에 있는 클래스는 조상으로 생각하시오
			TestImpl t = (TestImpl)obj;
			t.test();
		}
		
		arg0.invoke();
		return "ok";
	}
}
