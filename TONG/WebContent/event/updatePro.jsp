<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%@ page import = "DATADB2.bean.eDAO" %>
<%@ page import = "java.sql.Timestamp" %>


<jsp:useBean id="article" scope="page" class="DATADB2.bean.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
<%
 
    String pageNum = request.getParameter("pageNum");

	eDAO dbPro = eDAO.getInstance();
    int check = dbPro.updateArticle(article);

    if(check==1){
%>
	  <meta http-equiv="Refresh" content="0;url=event.jsp?pageNum=<%=pageNum%>" >
<% }else{%>
      <script language="JavaScript">      
     
        alert("비밀번호가 맞지 않습니다");
        history.go(-1);

     </script>
<%
    }
 %>  

 