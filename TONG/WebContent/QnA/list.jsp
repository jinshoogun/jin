<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATA.bean.DAO" %>
<%@ page import = "DATA.bean.DTO" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>
    <%@ include file="../test2/mainform5.jsp"%>

<%!
    int pageSize = 10; //한화면에 보여줄 글 갯수
    SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String pageReturn = "";
    %>
    <%
    String q_pageNum = request.getParameter("q_pageNum");
    if (q_pageNum == null) {
        q_pageNum = "1";
	}
	String skey = request.getParameter("skey");
	String sval = request.getParameter("sval");
	String sqry = "";
	if (skey != null && sval != null){
		pageReturn = "&skey="+skey+"&sval="+sval;
		sqry = " where "+skey+" like '%"+sval+"%' ";
	}else{
		skey = "m_id";
		sval = "";
	}

    int currentPage = Integer.parseInt(q_pageNum);
    int startRow = (currentPage - 1) * pageSize + 1; // ((currentPage - 1) * pageSize )+ 1; 와 같으뮤
    int endRow = currentPage * pageSize;
    int count = 0;
    int number=0;

    List articleList = null;
    DAO dbPro = DAO.getInstance();
    count = dbPro.getQnAArticleCount(sqry);
    if (count > 0) {
        articleList = dbPro.getArticles(startRow, endRow);
    }

	number=count-(currentPage-1)*pageSize;
	int pageSave = number;
%>
<html>
<head>
<title>QnA 게시판입니다.</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<input name ="pageSave" type="hidden" value="<%=pageSave%>">
<center><b>QnA 게시판입니다. (전체 글:<%=count%>)</b>

<table width="700">
<tr>
    <td align="right" b>
     <%if (session.getAttribute("m_id") !=null){%>
    <a href="writeForm.jsp">글쓰기</a>
    <%} else {%>

    <%}%>
    </td>
</table>

<%
    if (count == 0) {
%>
<table width="700" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td align="center">
    게시판에 저장된 글이 없습니다.
    </td>
</table>

<%  } else {    %>
<table border="1" width="800" cellpadding="0" cellspacing="0" align="center"> 
    <tr height="30"> 
      <td align="center"  width="50"  >번 호</td> 
      <td align="center"  width="350" >제   목</td> 
      <td align="center"  width="100" >작성자</td>
      <td align="center"  width="150" >작성일</td> 
      <td align="center"  width="50" >조 회</td> 
      
    </tr>
<%  
        for (int i = 0 ; i < articleList.size() ; i++) {
          DTO article = (DTO)articleList.get(i);
%>
   <tr height="30">
    <td align="center"  width="50" > <%=number--%></td>
    <td width="250">
	<%
	      int wid=0; 
	      if(article.getQ_re_level()>0){
	        wid=5*(article.getQ_re_level());
	%>
	  <width="<%=wid%>" height="16">---
	<%}else{%>
	  <width="<%=wid%>" height="16">
	<%}%>
      <a href="content.jsp?q_num=<%=article.getQ_num()%>&q_pageNum=<%=currentPage%>&pageSave=<%=pageSave%>">

           <%=article.getQ_subject()%></a></td>
    <td align="center"  width="100"><%=article.getQ_writer()%></a></td>
    <td align="center"  width="150"><%= sdf.format(article.getQ_reg_date())%></td>
    <td align="center"  width="50"><%=article.getQ_readcount()%></td>
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
        <a href="list.jsp?q_pageNum=<%= startPage - 10 %>">[이전]</a>
<%      }
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="list.jsp?q_pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="list.jsp?q_pageNum=<%= startPage + 10 %>">[다음]</a>
<%
        }
    }
%>
	
</center>
</body>
</html>