<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATA.bean.DAO" %>
<%@ page import = "DATA.bean.DTO" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>
        <%@ include file="../test2/mainform5.jsp"%>
<%!
    int pageSize = 10; //��ȭ�鿡 ������ �� ����
    SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>

<%
    String s_pageNum = request.getParameter("s_pageNum");
    if (s_pageNum == null) {
        s_pageNum = "1";
    }
	String skey = request.getParameter("skey");
	String sval = request.getParameter("sval");
	String sqry = "";
	String pageReturn = "";
	if (skey != null && sval != null){
		pageReturn = "&skey="+skey+"&sval="+sval;
		sqry = " where "+skey+" like '%"+sval+"%' ";
	}else{
		skey = "d_id";
		sval = "";
	}
    int currentPage = Integer.parseInt(s_pageNum);
    int startRow = (currentPage - 1) * pageSize + 1; // ((currentPage - 1) * pageSize )+ 1; �� ������
    int endRow = currentPage * pageSize;
    int count = 0;
    int number=0;
    
    List articleList = null;
    DAO dbPro = DAO.getInstance();
    count = dbPro.getStyleNewsArticleCount(sqry);
    if (count > 0) {
        articleList = dbPro.getStyleNewsArticles(startRow, endRow, sqry);
    }

	number=count-(currentPage-1)*pageSize;
	int pageSave = number;
%>
<html>
<head>
<title>QnA �Խ����Դϴ�.</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<input name ="pageSave" type="hidden" value="<%=pageSave%>">
<center><b>��Ÿ�� ���� �Խ����Դϴ�. (��ü ��:<%=count%>)</b>

<table width="700">
<tr>
    <td align="right">
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
 ���� �����ϴ�.
    </td>
</table>

<%  } else {    %>
<table border="1" width="800" cellpadding="0" cellspacing="0" align="center"> 
    <tr height="30"> 
      <td align="center"  width="50"  >�� ȣ</td> 
      <td align="center"  width="350" >��   ��</td> 
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
      <a href="content.jsp?s_num=<%=article.getS_num()%>&s_pageNum=<%=currentPage%>&pageSave=<%=pageSave%>">

           <%=article.getS_subject()%></a> 
    <td align="center"  width="100"><%=article.getS_writer()%></a></td>
    <td align="center"  width="150"><%= sdf.format(article.getS_reg_date())%></td>
    <td align="center"  width="50"><%=article.getS_readcount()%></td>
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
        <a href="list.jsp?s_pageNum=<%= startPage - 10 %>">[����]</a>
<%      }
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="list.jsp?s_pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="list.jsp?s_pageNum=<%= startPage + 10 %>">[����]</a>
<%
        }
    }
%>
	<form method="get" action="list.jsp" name="searchForm">
	<table>
		<tr>
		<td align="right">
		<select name="skey">
			<OPTION value="s_writer" <%=(skey.equals("s_writer"))?"selected":""%>>���̵�</OPTION>
			<OPTION value="s_subject" <%=(skey.equals("s_subject"))?"selected":""%>>����</OPTION>
			<OPTION value="s_content" <%=(skey.equals("s_content"))?"selected":""%>>�۳���</OPTION>
		</select>
		<input type=text name="sval" value="<%=sval%>">
		<input type=submit value="�˻�">
		<%=(!sval.equals(""))?"<a href=\"list.jsp\">�������</a>":""%>
		    <td align="right"><input type="button" value="����"
				onclick="window.location='main.jsp'"></td>
		</tr>
	</table>
</center>
</body>