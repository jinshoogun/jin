<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="article" scope="page" class="DATADB.bean.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
 
<%
	DAO dbPro = DAO.getInstance();
    dbPro.insertOneByOneArticle(article);
	
    response.sendRedirect("list.jsp");
%>
