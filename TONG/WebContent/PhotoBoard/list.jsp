
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "PhotoBoard.DAO" %>
<%@ page import = "PhotoBoard.DTO" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>
        <%@ include file="../test2/mainform5.jsp"%>
<%!
    int pageSize = 10; //한화면에 보여줄 글 갯수
    SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>

<%
    String p_pageNum = request.getParameter("p_pageNum");
    if (p_pageNum == null) {
        p_pageNum = "1";
    }
 	String skey = request.getParameter("skey");
 	String sval = request.getParameter("sval");
 	String sqry = "";
 	String pageReturn = "";
 	if (skey != null && sval != null){
 		pageReturn = "&skey="+skey+"&sval="+sval;
 		sqry = " where "+skey+" like '%"+sval+"%' ";
 	}else{
 		skey = "m_id";
 		sval = "";
 	}

    int currentPage = Integer.parseInt(p_pageNum);
    int startRow = (currentPage - 1) * pageSize + 1; // ((currentPage - 1) * pageSize )+ 1; 와 같으뮤
    int endRow = currentPage * pageSize;
    int count = 0;
    int number=0;

    List articleList = null;
    DAO dbPro = DAO.getInstance();
    count = (dbPro.getPhotoBoardArticleCount(sqry));
    if (count > 0) {
        articleList = dbPro.getPhotoBoardArticles(startRow, endRow , sqry);
    }

   number=count-(currentPage-1)*pageSize;
   int pageSave = number;
%>
<html>
<head>
<title>게시판입니다.</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<input name ="pageSave" type="hidden" value="<%=pageSave%>">
<center><b>고객후기 게시판 (전체 글:<%=count%>)</b>

<table width="700">
<tr>
    <td align="right">
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
   <%
         int wid=0; 
         if(article.getP_re_level()>0){
           wid=5*(article.getP_re_level());
   %>
     <td  width="250" width="<%=wid%>" height="16">
     <img src="images/re.gif">
   <%}else{%>
     <td  width="250" width="<%=wid%>" height="16">
   <%}%>
      <a href="content.jsp?p_num=<%=article.getP_num()%>&p_pageNum=<%=currentPage%>">

           <%=article.getP_subject()%></a></td>
    <td align="center"  width="100"><%=article.getP_writer()%></a></td>
    <td align="center"  width="150"><%= sdf.format(article.getP_reg_date())%></td>
    <td align="center"  width="50"><%=article.getP_readcount()%></td>
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
        <a href="list.jsp?p_pageNum=<%= startPage - 10 %>">[이전]</a>
<%      }
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="list.jsp?p_pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="list.jsp?p_pageNum=<%= startPage + 10 %>">[다음]</a>
<%
        }
    }
%>
	<form method="get" action="list.jsp" name="searchForm">
	<table>
		<tr>
		<td align="right">
		<select name="skey">
			<OPTION value="p_writer" <%=(skey.equals("p_writer"))?"selected":""%>>아이디</OPTION>
			<OPTION value="p_subject" <%=(skey.equals("p_subject"))?"selected":""%>>제목</OPTION>
			<OPTION value="p_content" <%=(skey.equals("p_content"))?"selected":""%>>글내용</OPTION>
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
</html>