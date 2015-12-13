<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATA.bean.DAO" %>
<%@ page import = "DATA.bean.DTO" %>
<%@ page import = "java.sql.Timestamp" %>
        <%@ include file="../test2/mainform5.jsp"%>
<% request.setCharacterEncoding("euc-kr");%>

<%
  int s_num = Integer.parseInt(request.getParameter("s_num"));
  String s_pageNum = request.getParameter("s_pageNum");
  String s_password = request.getParameter("s_password");

  DAO dbPro = DAO.getInstance();
  int check = dbPro.deleteStyleNewsArticle(s_num, s_password);

  if(check==1){
%>
	  <meta http-equiv="Refresh" content="0;url=list.jsp?s_pageNum=<%=s_pageNum%>" >
<% }else{%>
       <script language="JavaScript">         
         alert("비밀번호가 맞지 않습니다");
         history.go(-1);
      </script>
<%
    }
 %>