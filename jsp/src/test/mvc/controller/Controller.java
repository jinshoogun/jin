package test.mvc.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import test.mvc.action.FormAction;
import test.mvc.action.TestAction;

public class Controller extends HttpServlet {
	// public void service(HttpServletRequest request, HttpServletResponse
	// response)throws ServletException{
	// try{
	// PrintWriter pw = response.getWriter();
	// pw.println("<html>");
	// pw.println("<body>");
	// pw.println("<h2>Hello Servlet MVC</h2>");
	// pw.println("</body>");
	// pw.println("</html>");
	// }catch (Exception e){
	// e.printStackTrace();
	// }
	// }
	// public void doPost(HttpServletRequest Request, HttpServletResponse
	// response)throws ServletException{
	// }
	// public void doGet (HttpServletRequest Request, HttpServletResponse
	// response)throws ServletException{
	//
	// }
	// }

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
      String uri = request.getRequestURI(); //ex)jsp/form.naver = >URI
      //http://localhost:8080/ |jsp/form.naver| = >URI
      String view;
      try {
      if (uri.equals("/jsp/form.naver")){
    	  FormAction fa = new FormAction();
    	  view = fa.execute(request, response);
      }else {
    	  TestAction ta = new TestAction();
    	  view = ta.execute(request, response);
      }
          RequestDispatcher rd = request.getRequestDispatcher(view);
		//RequestDispatcher rd = request.getRequestDispatcher("/12_07/test.jsp");
//		request.setAttribute("msg", "hello");
//		request.setAttribute("num", 10000);
		
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}