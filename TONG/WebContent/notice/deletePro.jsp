<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB2.bean.nDAO" %>
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

         alert("��й�ȣ�� ���� �ʽ��ϴ�");
         history.go(-1);

      </script>
<%
    }
 %>