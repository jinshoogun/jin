<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "DATADB.bean.nDAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>

<%!
    int pageSize = 10;
    SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>

<%
    String pageNum = request.getParameter("pageNum");
    if (pageNum == null) {
        pageNum = "1";
    }
	String skey = request.getParameter("skey");
	String sval = request.getParameter("sval");
	String sqry = "";
	String pageReturn = "";
	if (skey != null && sval != null){
		pageReturn = "&skey="+skey+"&sval="+sval;
		sqry = " where "+skey+" like '%"+sval+"%' ";
	}else{
		skey = "a_id";
		sval = "";
	}

    int currentPage = Integer.parseInt(pageNum);
    int startRow = (currentPage - 1) * pageSize + 1;
    int endRow = currentPage * pageSize;
    int count = 0;
    int number=0;

    List articleList = null;
    nDAO dbPro = nDAO.getInstance();
    count = dbPro.getArticleCount(sqry);
    if (count > 0) {
        articleList = dbPro.getArticles(startRow, endRow, sqry);
    }

	number=count-(currentPage-1)*pageSize;
	int pageSave = number;
%>
<html>
<head>
<title>News & Events</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body  >
<center><b>NOTICES (��ü ��:<%=count%>)</b>
<table width="700">
<tr>
    <td align="right"  >
    <%if(session.getAttribute("a_id")!=null) 
    
    {%>
    <a href="writeForm.jsp">�۾���</a>
    <%} else { %>
    <%}%>
    </td>
</table>

<%
    if (count == 0) {
%>
<table width="700" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td align="center">
    �Խ��ǿ� ����� ���� �����ϴ�.
    </td>
</table>

<%  } else {    %>
<table border="1" width="700" cellpadding="0" cellspacing="0" align="center"> 
    <tr height="30"  > 
      <td align="center"  width="50"  >�� ȣ</td> 
      <td align="center"  width="250" >��   ��</td> 
      <td align="center"  width="100" >�ۼ���</td>
      <td align="center"  width="150" >�ۼ���</td> 
      <td align="center"  width="50" >�� ȸ</td>    
    </tr>
<%  
        for (int i = 0 ; i < articleList.size() ; i++) {
          DTO article = (DTO)articleList.get(i);
%>
   <tr height="30">
    <td align="center"  width="50" > <%=number--%></td>
    <td  width="250" >
	<%
	      int wid=0; 
	      if(article.getN_re_level()>0){
	        wid=5*(article.getN_re_level());
	%>
	  <img src="images/level.gif" width="<%=wid%>" height="16">
	  <img src="images/re.gif">
	<%}else{%>
	  <img src="images/level.gif" width="<%=wid%>" height="16">
	<%}%>
           
      <a href="content.jsp?n_num=<%=article.getN_num()%>&pageNum=<%=currentPage%>">
           <%=article.getN_subject()%></a> 
          <% if(article.getN_readcount()>=20){%>
         <img src="images/hot.gif" border="0"  height="16"><%}%> </td>
    <td align="center"  width="100"> 
       <a align="center"  width="100"><%=article.getN_writer()%></a></td>
    <td align="center"  width="150"><%= sdf.format(article.getN_reg_date())%></td>
    <td align="center"  width="50"><%=article.getN_readcount()%></td>
  </tr>
     <%}%>
</table>
<%}%>
<%
    if (count > 0) {
        int pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		 
        int startPage = (int)(currentPage/10)*10+1;
		int pageBlock=10;
        int endPage = startPage + pageBlock-1;
        if (endPage > pageCount) endPage = pageCount;
        
        if (startPage > 10) {    %>
        <a href="notice.jsp?pageNum=<%= startPage - 10 %>">[����]</a>
<%      }
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="notice.jsp?pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="notice.jsp?pageNum=<%= startPage + 10 %>">[����]</a>
<%
        }
    }
%>	<form method="get" action="notice.jsp" name="searchForm">
	<table>
		<tr>
		<td align="right">
		<select name="skey">
			<OPTION value="n_writer" <%=(skey.equals("n_writer"))?"selected":""%>>���̵�</OPTION>
			<OPTION value="n_subject" <%=(skey.equals("n_subject"))?"selected":""%>>����</OPTION>
			<OPTION value="n_content" <%=(skey.equals("n_content"))?"selected":""%>>�۳���</OPTION>
		</select>
		<input type=text name="sval" value="<%=sval%>">
		<input type=submit value="�˻�">
		<%=(!sval.equals(""))?"<a href=\"notice.jsp\">�������</a>":""%>
		    <td align="right"><input type="button" value="����"
				onclick="window.location='main.jsp'"></td>
		</tr>
	</table>
</center>
</body>
</html>