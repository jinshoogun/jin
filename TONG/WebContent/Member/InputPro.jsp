<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "java.sql.Timestamp" %>


<% request.setCharacterEncoding("EUC-KR"); %>

<jsp:useBean id="membership" class="DATADB.bean.DTO" >
   <jsp:setProperty name="membership" property="*" />
</jsp:useBean>

<%
	membership.setM_reg(new Timestamp(System.currentTimeMillis()));
	DAO manager = DAO.getInstance();
	manager.insertMembership(membership);
	
  response.sendRedirect("Insert.jsp");
  %>
  
  
