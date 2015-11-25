<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<%
  int o_num = Integer.parseInt(request.getParameter("o_num"));
  String o_pageNum = request.getParameter("o_pageNum");
  String o_password2 = request.getParameter("o_password2");

  DAO dbPro = DAO.getInstance();
  int check = dbPro.OnebyOnedeleteArticle(o_num, o_password2);

  if(check==1){
%>
	  <meta http-equiv="Refresh" content="0;url=list.jsp?o_pageNum=<%=o_pageNum%>" >
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