package test.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ch11.logon.LogonDBBean;
import ch11.logon.LogonDataBean;

public class InputProAction implements CommandAction {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		try {
	   
		
	   LogonDBBean manager = LogonDBBean.getInstance();
	 
	   LogonDataBean member = new LogonDataBean();
	   String id =  request.getParameter("id");
	   String passwd =  request.getParameter("passwd");
	   String name =   request.getParameter("name");
	   String jumin1 =  request.getParameter("Jumin1");
	   String jumin2 =  request.getParameter("Jumin2");
	   String email =  request.getParameter("Email");
	   String blog =  request.getParameter("blog");
	   
		member.setId(id);
		member.setPasswd(passwd);
		member.setName(name);
		member.setJumin1(jumin1);
		member.setJumin2(jumin2);
		member.setEmail(email);
		member.setBlog(blog);
		
	    manager.insertMember(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "/member1/inputPro.jsp";
	}
	
}
