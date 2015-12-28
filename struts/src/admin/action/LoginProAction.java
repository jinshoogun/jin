package admin.action;

	import java.util.HashMap;
	import java.util.Map;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpSession;
	import org.apache.struts2.interceptor.ServletRequestAware;
	import com.ibatis.sqlmap.client.SqlMapClient;
	import admin.action.IbatisImpl;

	public class LoginProAction implements IbatisImpl, ServletRequestAware{
		private SqlMapClient sqlMap;
		private HttpServletRequest request;
		private String a_id;
		private String a_password;

		public String execute() throws Exception  {
			Map parameter = new HashMap();
			parameter.put("a_id", a_id);
			parameter.put("a_password", a_password);
			System.out.println(parameter);
			String checkId = (String) sqlMap.queryForObject("adminCheck", parameter);
			if (checkId != null) {
				HttpSession session = request.getSession();
				session.setAttribute("AdminId", a_id);
			}
			return "success";
		}
		public void setA_Id(String a_id) {
			this.a_id = a_id;
		}

		public void setA_Password(String a_password) {
			this.a_password = a_password;
		}

		public void setIbatis(SqlMapClient sqlMap) {
			this.sqlMap = sqlMap;
		}

		public void setServletRequest(HttpServletRequest hsr) {
			this.request = hsr;
			
		}
	}


