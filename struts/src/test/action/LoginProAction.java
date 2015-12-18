package test.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.ibatis.sqlmap.client.SqlMapClient;

public class LoginProAction implements IbatisImpl, ServletRequestAware {
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

	public void setServletRequest(HttpServletRequest arg0) {
		this.request = arg0;

	}

}
