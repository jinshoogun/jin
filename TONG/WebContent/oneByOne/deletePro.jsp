<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<%
  int q_num = Integer.parseInt(request.getParameter("q_num"));
  String q_pageNum = request.getParameter("q_pageNum");
  String q_password2 = request.getParameter("q_password2");

  DAO dbPro = DAO.getInstance();
  int check = dbPro.deleteArticle(q_num, q_password2);

  if(check==1){
%>
	  <meta http-equiv="Refresh" content="0;url=list.jsp?q_pageNum=<%=q_pageNum%>" >
<% }else{%>
       <script language="JavaScript">      
       <!--      
         alert("비밀번호가 맞지 않습니다");
         history.go(-1);
       -->
      </script>
<%
    }
 %>