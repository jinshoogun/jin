<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "DATADB.bean.nDAO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="article" scope="page" class="DATADB.bean.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>
<%
 
    String pageNum = request.getParameter("pageNum");

	nDAO dbPro = nDAO.getInstance();
    int check = dbPro.updateArticle(article);

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

 