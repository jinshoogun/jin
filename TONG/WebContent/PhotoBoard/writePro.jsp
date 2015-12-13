<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "PhotoBoard.DAO" %>
<%@ page import = "PhotoBoard.DTO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="article" scope="page" class="PhotoBoard.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>

<%
    article.setP_reg_date(new Timestamp(System.currentTimeMillis()) );

    DAO dbPro = DAO.getInstance();
    dbPro.insertArticle(article);


    response.sendRedirect("list.jsp");
%>
