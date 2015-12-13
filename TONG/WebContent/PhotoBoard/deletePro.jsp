<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "PhotoBoard.DAO" %>
<%@ page import = "java.sql.Timestamp" %>


<%
  int p_num = Integer.parseInt(request.getParameter("p_num"));
  String p_pageNum = request.getParameter("p_pageNum");
  String p_password = request.getParameter("p_password");

  DAO dbPro = DAO.getInstance();
  int check = dbPro.deleteArticle(p_num, p_password);

  if(check==1){
%>
	  <meta http-equiv="Refresh" content="0;url=list.jsp?p_pageNum=<%=p_pageNum%>" >
<% }else{%>
       <script language="JavaScript">           
         alert("비밀번호가 맞지 않습니다");
         history.go(-1);

      </script>
<%
    }
 %>