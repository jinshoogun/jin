<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB2.bean.eDAO" %>
<%@ page import = "java.sql.Timestamp" %>
<%@ include file="../test2/noticemainform.jsp"  %>



<jsp:useBean id="article" scope="page" class="DATADB2.bean.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
 
 <%
 		
		String cmtenum = request.getParameter("cmte_ref");
 		String pageNum = request.getParameter("pageNum");
 		
 		eDAO dbpro = eDAO.getInstance();

 		dbpro.insertComment(article);
 %>
<meta http-equiv="Refresh" content="0;url=content.jsp?e_num=<%=cmtenum %>&pageNum=<%=pageNum%>" >