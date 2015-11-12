<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="article" scope="page" class="DATADB.bean.DTO">
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

 