package member1.action;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.interceptor.ServletRequestAware;
import com.ibatis.sqlmap.client.SqlMapClient;
import test.action.IbatisImpl;

public class LoginProAction implements IbatisImpl, ServletRequestAware{
	private SqlMapClient sqlMap;
	private HttpServletRequest request;
	private String id;
	private String passwd;

	public String execute() throws Exception  {
		Map parameter = new HashMap();
		parameter.put("id", id);
		parameter.put("passwd", passwd);
		System.out.println(id);
		String checkId = (String) sqlMap.queryForObject("memberCheck", parameter);
		if (checkId != null) {
			HttpSession session = request.getSession();
			session.setAttribute("memId", id);
		}
		return "success";
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public void setIbatis(SqlMapClient sqlMap) {
		this.sqlMap = sqlMap;
	}

	public void setServletRequest(HttpServletRequest hsr) {
		this.request = hsr;
	}
}