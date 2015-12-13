<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB2.bean.nDAO" %>
<%@ page import = "DATADB2.bean.DTO" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ include file="../test2/noticemainform.jsp"  %>

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

    int currentPage = Integer.parseInt(pageNum);
    int startRow = (currentPage - 1) * pageSize + 1;
    int endRow = currentPage * pageSize;
    int count = 0;
    int number=0;

    List articleList = null;
    nDAO dbPro = nDAO.getInstance();
    count = dbPro.getArticleCount();
    if (count > 0) {
        articleList = dbPro.getArticles(startRow, endRow);
    }

	number=count-(currentPage-1)*pageSize;
%>
<html>
<head>
<title>News & Events</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body  >
<center><b>NOTICES (전체 글:<%=count%>)</b>
<table width="700">
<tr>
    <td align="right"  >
    <%if(session.getAttribute("a_id")!=null) 
    
    {%>
    
    <a href="writeForm.jsp">글쓰기</a>
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
    게시판에 저장된 글이 없습니다.
    </td>
</table>

<%  } else {    %>
<table border="1" width="700" cellpadding="0" cellspacing="0" align="center"> 
    <tr height="30"  > 
      <td align="center"  width="50"  >번 호</td> 
      <td align="center"  width="250" >제   목</td> 
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
    
	<%
	      int wid=0; 
	      if(article.getN_re_level()>0){
	        wid=5*(article.getN_re_level());
	%>
	  <td  width="250"  width="<%=wid%>" height="16">
	
	<%}else{%>
	   <td width="250"  width="<%=wid%>" height="16">
	<%}%>
           
      <a href="content.jsp?n_num=<%=article.getN_num()%>&pageNum=<%=currentPage%>">
           <%=article.getN_subject()%></a> </td>
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
        <a href="notice.jsp?pageNum=<%= startPage - 10 %>">[이전]</a>
<%      }
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="notice.jsp?pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="notice.jsp?pageNum=<%= startPage + 10 %>">[다음]</a>
<%
        }
    }
%>
</center>
</body>
</html>