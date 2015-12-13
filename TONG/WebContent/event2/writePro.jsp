<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB2.bean.eDAO" %>
<%@ page import = "java.sql.Timestamp" %>
<%@ include file="../test2/noticemainform.jsp"  %>


<jsp:useBean id="article" scope="page" class="DATADB2.bean.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
 
<%
    article.setE_reg_date(new Timestamp(System.currentTimeMillis()) );

    eDAO dbPro = eDAO.getInstance();
    dbPro.insertArticle(article);

    response.sendRedirect("event.jsp");
%>
