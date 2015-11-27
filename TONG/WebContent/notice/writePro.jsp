<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "DATADB.bean.nDAO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="article" scope="page" class="DATADB.bean.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
 
<%
    article.setN_reg_date(new Timestamp(System.currentTimeMillis()) );

    nDAO dbPro = nDAO.getInstance();
    dbPro.insertArticle(article);

    response.sendRedirect("notice.jsp");
%>
