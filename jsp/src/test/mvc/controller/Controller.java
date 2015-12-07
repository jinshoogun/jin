package test.mvc.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
      if (uri.equals("/jsp/form.naver")){
    	  view = "/12_07/form.jsp";
      }else {
    	  String id = request.getParameter("id");
    	  String pw = request.getParameter("pw");
    	  //DAO
    	  HttpSession session = request.getSession(); 
    	  //jsp�� ���� ����� ���� ��ü�� �ٷ� ������ �ǳ� Controll�󿡼��� �ٷ� ���� ���� �Ұ��� �ϹǷ� HttpSession�� ���� ����
    	  request.setAttribute("memId", "1");
    	  session.setAttribute("memId", "2");
    	  // �ߺ��� �������� ���� ���� ������ �켱������ ����Ѵ�.
    	  request.setAttribute("pw", pw);
    	  view = "/12_07/test.jsp";
      }
      
          RequestDispatcher rd = request.getRequestDispatcher(view);
		//RequestDispatcher rd = request.getRequestDispatcher("/12_07/test.jsp");
//		request.setAttribute("msg", "hello");
//		request.setAttribute("num", 10000);
		try {
			rd.forward(request, response);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}