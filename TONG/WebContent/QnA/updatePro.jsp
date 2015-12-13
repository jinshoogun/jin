<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATA.bean.DAO" %>
<%@ page import = "DATA.bean.DTO" %>
<%@ page import = "java.sql.Timestamp" %>
    <%@ include file="../test2/mainform5.jsp"%>



<jsp:useBean id="article" scope="page" class="DATA.bean.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
<%
 
    String q_pageNum = request.getParameter("q_pageNum");

	DAO dbPro = DAO.getInstance();
    int check = dbPro.updateArticle(article);
    if(check==1){
%>
	  <meta http-equiv="Refresh" content="0;url=list.jsp?q_pageNum=<%=q_pageNum%>">
<% }else{%>
      <script language="JavaScript">      
           
        alert("비밀번호가 맞지 않습니다");
        history.go(-1);
      
     </script>
<%
    }
 %>  

 