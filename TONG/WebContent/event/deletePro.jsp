<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%@ page import = "DATADB2.bean.eDAO" %>
<%@ page import = "java.sql.Timestamp" %>


<%
  int num = Integer.parseInt(request.getParameter("e_num"));
  String pageNum = request.getParameter("pageNum");
  String passwd = request.getParameter("e_password");

  eDAO dbPro = eDAO.getInstance();
  int check = dbPro.deleteArticle(num, passwd);

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