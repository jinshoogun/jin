<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATA.bean.DAO" %>
<%@ page import = "DATA.bean.DTO" %>
<%@ page import = "java.sql.Timestamp" %>
    <%@ include file="../test2/mainform5.jsp"%>

<% request.setCharacterEncoding("EUC-KR");%>

<jsp:useBean id="article" scope="page" class="DATA.bean.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
<%
 
    String o_pageNum = request.getParameter("o_pageNum");

	DAO dbPro = DAO.getInstance();
    int check = dbPro.updateOnebyOneArticle(article);
    System.out.println(check);
    if(check==1){
%>
	  <meta http-equiv="Refresh" content="0;url=list.jsp?o_pageNum=<%=o_pageNum%>">
<% }else{%>
      <script language="JavaScript">      
           
        alert("비밀번호가 맞지 않습니다");
        history.go(-1);
      
     </script>
<%
    }
 %>  

 