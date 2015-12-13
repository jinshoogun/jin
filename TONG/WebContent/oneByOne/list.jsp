<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="DATA.bean.DAO"%>
<%@ page import="DATA.bean.DTO"%>
<%@ page import="java.util.List"%>
<%@ page import="java.text.SimpleDateFormat"%>
    <%@ include file="../test2/mainform5.jsp"%>
<%
request.setCharacterEncoding("EUC-KR"); %>
<%!int pageSize = 10; //한화면에 보여줄 글 갯수
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");%>

<%
    String O_pageNum = request.getParameter("O_pageNum");
    if (O_pageNum == null) {
        O_pageNum = "1";
    }

    int currentPage = Integer.parseInt(O_pageNum);
    int startRow = (currentPage - 1) * pageSize + 1; // ((currentPage - 1) * pageSize )+ 1; 와 같으뮤
    int endRow = currentPage * pageSize;
    int count = 0;
    int admincount = 0;
    int number = 0;
    int adminNumber = 0;
    String m_id = (String)session.getAttribute("m_id");
	String a_id = (String)session.getAttribute("a_id");

    List articleList = null;
    List adminArticleList = null;
    DAO dbPro = DAO.getInstance();
    count = dbPro.getOneByOneMyArticleCount(m_id);
    admincount = dbPro.getOneByOneAdminArticleCount();
    if (count > 0) {
        articleList = dbPro.getOnebyOneMyArticles(startRow, endRow, m_id);
    }
    if (admincount > 0){
        adminArticleList = dbPro.getOnebyOneAdminArticles(startRow, endRow);
    }

	number = count-(currentPage-1)*pageSize;
	adminNumber = admincount-(currentPage-1)*pageSize;
%>
<html>
<head>
<title>1:1 상담글입니다.</title>
</head>

<body>
	<center>
		<b>1:1 상담글입니다. </b> <br /> <br />

<%if (session.getAttribute("m_id") != null){%>
		<table width="800">
			<tr>
				<td align="right"><a href="writeForm.jsp">글쓰기</a></td>
			</tr>
		</table>
		<table width="800" border="1" cellpadding="0" cellspacing="0">
		<table width="800" border="1" cellpadding="0" cellspacing="0">
			<tr height="40">
				<td width="100" align="center">글번호</td>
				<td width="650" align="center">제목</td>
				<td width="120" align="center">작성자</td>
				<td width="180" align="center">작성일</td>
				<td width="100" align="center">조회수</td>
 <%if (count == 0) {%>
			
			<tr height="40">
				<td align="center" colspan="5">작성된 글이 없습니다.</td>
		</table>
 <%} else { %>
  <%for (int i = 0 ; i < articleList.size() ; i++) {
          DTO article = (DTO)articleList.get(i);%>
		<tr height="30">
			<td align="center" width="50"><%=number--%></td>
			<td width="650"><a
				href="content.jsp?o_num=<%=article.getO_num()%>&o_pageNum=<%=currentPage%>">
					<%=article.getO_subject()%></a> 
			<td align="center" width="120"><%=article.getO_writer()%></a></td>
			<td align="center" width="180"><%= sdf.format(article.getO_reg_date())%></td>
            <td align="center" width="100"><%=article.getO_readcount()%></td>
			<%
	      int wid=0; 
	      if(article.getO_re_level()>0){
	        wid=5*(article.getO_re_level());} %></td>
			<%}%>
		</tr>
		</table>
		<%}%>
		<%}else if (session.getAttribute("a_id") != null){%>
				<table width="800">
			<tr>
				<td align="right"><a href="writeForm.jsp">글쓰기</a></td>
			</tr>
		</table>
		<table width="800" border="1" cellpadding="0" cellspacing="0">
			<tr height="40">
				<td width="100" align="center">글번호</td>
				<td width="650" align="center">제목</td>
				<td width="120" align="center">작성자</td>
				<td width="180" align="center">작성일</td>
				<td width="100" align="center">조회수</td>
					<%
    if (admincount == 0) {
%>
			<tr height="40">
				<td align="center" colspan="5">작성된 글이 없습니다.</td>
		</table>
		<% } else { %>
				<%for (int i = 0 ; i < adminArticleList.size() ; i++) {
                   DTO article = (DTO)adminArticleList.get(i);%>
		<tr height="30">
			<td align="center" width="50"><%=number--%></td>
			<td width="650"><a
				href="content.jsp?o_num=<%=article.getO_num()%>&o_pageNum=<%=currentPage%>">
					<%=article.getO_subject()%></a> 
			<td align="center" width="120"><%=article.getO_writer()%></a></td>
			<td align="center" width="180"><%= sdf.format(article.getO_reg_date())%></td>
            <td align="center" width="100"><%=article.getO_readcount()%></td>

				<%
	      int wid=0; 
	      if(article.getO_re_level()>0){
	        wid=5*(article.getO_re_level());} %></td>
		
		<%}%>
			</tr>
		</table>
		<%}} else {%>

		<table width="800" border="1" cellpadding="0" cellspacing="0">
			<tr height="40">
		
				<td width="100" align="center">글번호</td>
				<td width="700" align="center">제목</td>
				<td width="125" align="center">작성자</td>
				<td width="175" align="center">작성일</td>
				</tr>
				<tr><td colspan = "4" height = "50" align="center">로그인이 필요합니다.</td></tr>
				</table>
				<%} %>
	</center>
</body>
</html>