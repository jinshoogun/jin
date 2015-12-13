package test.mvc.controller;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import test.mvc.action.CommandAction;

public class ControllerAction extends HttpServlet{
	
private Map actionMap = null;
	public void init(ServletConfig config) throws ServletException {
		String path = config.getInitParameter("propertiesPath");
		System.out.println(path);
		Properties p = new Properties();
		InputStream is = null;
		actionMap = new HashMap();
		try {
			is = new FileInputStream(path); // propertiesPath값구함 web.xml을 읽기 위해
											// fileInputStream을 통해 읽어짐
			// (key,value)값을 읽음
			p.load(is); // properties클래스에 로딩

			Iterator iter = p.keySet().iterator();
			while (iter.hasNext()) {
				String name = (String) iter.next();
				String value = p.getProperty(name);
				Class cName = Class.forName(value);
				Object obj = cName.newInstance();
				System.out.println(obj);
				
				actionMap.put(name, obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		
		String uri = request.getRequestURI(); 
		System.out.println(uri);
		CommandAction com = (CommandAction)actionMap.get(uri); 
 		String view = ""; 
 		try{
 			view = com.execute(request, response); 
 			System.out.println(view);
 			RequestDispatcher rd = request.getRequestDispatcher(view); 
 			rd.forward(request, response); 
 		} catch (Exception e){ 
 			e.printStackTrace(); 
 		}	 
 	} 
 } 
