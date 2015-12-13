package test.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ch11.logon.LogonDBBean;
import ch11.logon.LogonDataBean;

public class ModifyProAction implements CommandAction {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		try {
			request.setCharacterEncoding("euc-kr");

			LogonDBBean manager = LogonDBBean.getInstance();
			LogonDataBean member = new LogonDataBean();
			String id = request.getParameter("id");
			String passwd = request.getParameter("passwd");
			String name = request.getParameter("name");
			String jumin1 = request.getParameter("Jumin1");
			String jumin2 = request.getParameter("Jumin2");
			String email = request.getParameter("Email");
			String blog = request.getParameter("blog");

			member.setId(id);
			member.setPasswd(passwd);
			member.setName(name);
			member.setJumin1(jumin1);
			member.setJumin2(jumin2);
			member.setEmail(email);
			member.setBlog(blog);

			member.setId(id);

			manager.updateMember(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/member1/modifyPro.jsp";
	}
}
