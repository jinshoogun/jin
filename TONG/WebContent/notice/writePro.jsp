<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB2.bean.nDAO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="article" scope="page" class="DATADB2.bean.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
 
<%
    article.setN_reg_date(new Timestamp(System.currentTimeMillis()) );

    nDAO dbPro = nDAO.getInstance();
    dbPro.insertArticle(article);

    response.sendRedirect("notice.jsp");
%>
