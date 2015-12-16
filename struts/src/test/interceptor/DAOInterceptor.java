package test.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import test.action.DAO;

public class DAOInterceptor implements Interceptor {
	private DAO dao = null;

	public void destroy() {
	}

	public void init() {
		dao = new DAO();
	}

	public String intercept(ActionInvocation arg0) throws Exception {
		Object obj = arg0.getAction();
		if (obj instanceof DAOImpl) {
			DAOImpl im = (DAOImpl) obj;
			im.setDAO(dao);
		}
		return arg0.invoke();
	}
}