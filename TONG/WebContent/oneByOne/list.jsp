<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>

<%!
    int pageSize = 10; //한화면에 보여줄 글 갯수
    SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>

<%
    String q_pageNum = request.getParameter("q_pageNum");
    if (q_pageNum == null) {
        q_pageNum = "1";
    }

    int currentPage = Integer.parseInt(q_pageNum);
    int startRow = (currentPage - 1) * pageSize + 1; // ((currentPage - 1) * pageSize )+ 1; 와 같으뮤
    int endRow = currentPage * pageSize;
    int count = 0;
    int number=0;

    List articleList = null;
    DAO dbPro = DAO.getInstance();
    count = dbPro.getArticleCount();
    if (count > 0) {
        articleList = dbPro.getArticles(startRow, endRow);
    }

	number=count-(currentPage-1)*pageSize;
%>
<html>
<head>
<title>1:1 상담글입니다.</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<center><b>1:1 상담글입니다. </b>
<br />
<br />
<%if (session.getAttribute("m_id") ==null){%>

<table width="800" border="1" cellpadding="0" cellspacing="0">
<tr height = "30">
    <td  width = "100" align = "center">글번호</td>
    <td width = "750" align = "center">제목</td>
    <td width = "125" align = "center">작성자</td>
    <td width = "125" align = "center">작성일</td>
    </tr>
</table>

<%}else {%>

    <%}%>
</center>
</body>
</html>