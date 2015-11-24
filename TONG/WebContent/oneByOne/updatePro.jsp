<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="article" scope="page" class="DATADB.bean.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
<%
 
    String o_pageNum = request.getParameter("o_pageNum");

	DAO dbPro = DAO.getInstance();
    int check = dbPro.updateOnebyOneArticle(article);
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

 