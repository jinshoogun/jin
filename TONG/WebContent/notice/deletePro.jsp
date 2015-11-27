<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "DATADB.bean.nDAO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<%
  int n_num = Integer.parseInt(request.getParameter("n_num"));
  String pageNum = request.getParameter("pageNum");
  String n_password = request.getParameter("n_password");

  nDAO dbPro = nDAO.getInstance();
  int check = dbPro.deleteArticle(n_num, n_password);

  if(check==1){
%>
	  <meta http-equiv="Refresh" content="0;url=notice.jsp?pageNum=<%=pageNum%>" >
<% }else{%>
       <script language="JavaScript">      

         alert("비밀번호가 맞지 않습니다");
         history.go(-1);

      </script>
<%
    }
 %>