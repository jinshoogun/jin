<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATA.bean.DAO" %>
<%@ page import = "java.sql.Timestamp" %>
    <%@ include file="../test2/mainform5.jsp"%>

<% request.setCharacterEncoding("EUC-KR");%>

<jsp:useBean id="article" scope="page" class="DATA.bean.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
 
<%
	DAO dbPro = DAO.getInstance();
    dbPro.insertOneByOneArticle(article);
	
    response.sendRedirect("list.jsp");
%>
