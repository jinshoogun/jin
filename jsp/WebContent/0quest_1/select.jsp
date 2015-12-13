<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import ="obj430.bean.DTO" %>
<%@page import ="obj430.bean.DAO" %>
<%@page import="java.util.ArrayList"%>

<%DAO dao = new DAO();
ArrayList list = dao.select();
if(list != null){
	for(int i =0; i <list.size(); i++){
		DTO dto = (DTO)list.get(i);
		
		out.println(dto.getId());
		out.println(dto.getNa());
		out.println(dto.getPw());
		out.println(dto.getAdd());
		out.println(dto.getA());
		out.println(dto.getPhone());
		out.println(dto.getEmail());
		out.println(dto.getB());
		out.println(dto.getNick());
		out.println(dto.getIntru());
		out.println(dto.getReg());
		out.println(dto.getId());
		out.println("<br />");
	}
}
%>
