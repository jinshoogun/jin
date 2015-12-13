<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("EUC-KR"); %>

<jsp:useBean id="designer" class="DATADB.bean.DTO" >
   <jsp:setProperty name="designer" property="*" />
</jsp:useBean>

<%
	designer.setD_date(new Timestamp(System.currentTimeMillis()));
	DAO manager = DAO.getInstance();
	manager.insertDesigner(designer);
	
	 response.sendRedirect("Insert.jsp");
  %>
  
