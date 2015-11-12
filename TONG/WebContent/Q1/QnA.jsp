<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<%@ page import = "java.text.SimpleDateFormat" %>

<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<%
   int Q_num = Integer.parseInt(request.getParameter("Q_num"));
   String Q_pageNum = request.getParameter("Q_pageNum");

   SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");

   try{
      DAO dbPro = DAO.getInstance();
      DTO article =  dbPro.getArticle(Q_num);
  
	  int Q_ref=article.getQ_ref();
	  int Q_re_step=article.getQ_re_step();
	  int Q_re_level=article.getQ_re_level();
	  
%>
<body>  
<center><b>글내용 보기</b>
<br>
<form>
<table width="500" border="1" cellspacing="0" cellpadding="0" align="center">  
  <tr height="30">
    <td align="center" width="125">글번호</td>
    <td align="center" width="125" align="center">
	     <%=article.getQ_num()%></td>
    <td align="center" width="125">조회수</td>
    <td align="center" width="125" align="center">
	     <%=article.getQ_readcount()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="125" >작성자</td>
    <td align="center" width="125" align="center">
	     <%=article.getQ_writer()%></td>
    <td align="center" width="125"  >작성일</td>
    <td align="center" width="125" align="center">
	     <%= sdf.format(article.getQ_reg_date())%></td>
  </tr>
  <tr height="30">
    <td align="center" width="125" >글제목</td>
    <td align="center" width="375" align="center" colspan="3">
	     <%=article.getQ_subject()%></td>
  </tr>
  <tr>
    <td align="center" width="125" >글내용</td>
    <td align="left" width="375" colspan="3"><pre><%=article.getQ_content()%></pre></td>
  </tr>
  <tr height="30">      
    <td colspan="4"  align="right" > 
    <%if(session.getAttribute("memId")!=null){ %>
    	<%
    		String id = (String)session.getAttribute("memId");
    		if(id.equals(article.getQ_writer())){
    	%> 
	  <input type="button" value="글수정" 
       onclick="document.location.href='updateForm.jsp?num=<%=article.getQ_num()%>&pageNum=<%=Q_pageNum%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
	  <input type="button" value="글삭제" 
       onclick="document.location.href='deleteForm.jsp?num=<%=article.getQ_num()%>&pageNum=<%=Q_pageNum%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
	   <%} 
	   	if(id.equals("admin")){
	   		%>
	   	
      <input type="button" value="답글쓰기" 
       onclick="document.location.href='writeForm.jsp?num=<%=Q_num%>&ref=<%=Q_ref%>&re_step=<%=Q_re_step%>&re_level=<%=Q_re_level%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
	   <%} %>
	   <%} %>
       <input type="button" value="글목록" 
       onclick="document.location.href='list.jsp?pageNum=<%=Q_pageNum%>'">
    </td>
  </tr>
</table>    
<%
 }catch(Exception e){} 
 %>
</form>      
</body>
</html>      
