<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="EUC-KR"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import ="test.bean.DTO" %>
<%@page import ="test.bean.DAO" %>
<%@page import="java.util.ArrayList"%>


<%DAO dao = new DAO();
ArrayList list = dao.select();
if(list != null){
	for(int i =0; i <list.size(); i++){
		DTO dto = (DTO)list.get(i);
		out.println(dto.getId());
		out.println(dto.getPw());
		out.println(dto.getAge());
		out.println(dto.getReg());
		out.println("<br />");
	}
}
%>