package member1.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.ibatis.sqlmap.client.SqlMapClient;
import test.action.IbatisImpl;


public class logoutAction implements IbatisImpl, ServletRequestAware {
	private SqlMapClient sqlMap;
	private HttpServletRequest request;
	public String execute() throws Exception {
		try {
			HttpSession session = request.getSession();
			session.invalidate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

	public void setIbatis(SqlMapClient sqlMap) {
		this.sqlMap = sqlMap;
	}

	public void setServletRequest(HttpServletRequest hsr) {
		this.request = hsr;
	}
}
