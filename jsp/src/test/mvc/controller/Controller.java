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
import test.mvc.action.SuperAction;

public class Controller extends HttpServlet {
	
private Map actionMap = null;
	public void init(ServletConfig config) throws ServletException {
		String path = config.getInitParameter("propertiesPath");
		System.out.println(path);
		Properties p = new Properties();
		InputStream is = null;
		actionMap = new HashMap();
		try {
			is = new FileInputStream(path); // propertiesPath������ web.xml�� �б� ����
											// fileInputStream�� ���� �о���
			// (key,value)���� ����
			p.load(is); // propertiesŬ������ �ε�

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
		SuperAction sa = (SuperAction)actionMap.get(uri); 
 		String view = ""; 
 		try{ 
			view = sa.execute(request, response); 
			RequestDispatcher rd = request.getRequestDispatcher(view); 
 			rd.forward(request, response); 
 		} catch (Exception e){ 
			e.printStackTrace(); 
 		}	 
 	} 
 } 
