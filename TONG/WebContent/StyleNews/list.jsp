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
    int startRow = (currentPage - 1) * pageSize + 1; // ((currentPage - 1) * pageSize )+ 1; 와 같으뮤
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
<title>QnA 게시판입니다.</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<input name ="pageSave" type="hidden" value="<%=pageSave%>">
<center><b>스타일 뉴스 게시판입니다. (전체 글:<%=count%>)</b>

<table width="700">
<tr>
    <td align="right">
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
 글이 없습니다.
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
        <a href="list.jsp?s_pageNum=<%= startPage - 10 %>">[이전]</a>
<%      }
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="list.jsp?s_pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="list.jsp?s_pageNum=<%= startPage + 10 %>">[다음]</a>
<%
        }
    }
%>
	<form method="get" action="list.jsp" name="searchForm">
	<table>
		<tr>
		<td align="right">
		<select name="skey">
			<OPTION value="s_writer" <%=(skey.equals("s_writer"))?"selected":""%>>아이디</OPTION>
			<OPTION value="s_subject" <%=(skey.equals("s_subject"))?"selected":""%>>제목</OPTION>
			<OPTION value="s_content" <%=(skey.equals("s_content"))?"selected":""%>>글내용</OPTION>
		</select>
		<input type=text name="sval" value="<%=sval%>">
		<input type=submit value="검색">
		<%=(!sval.equals(""))?"<a href=\"list.jsp\">원래대로</a>":""%>
		    <td align="right"><input type="button" value="이전"
				onclick="window.location='main.jsp'"></td>
		</tr>
	</table>
</center>
</body>