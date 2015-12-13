<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "PhotoBoard.DAO" %>
<%@ page import = "PhotoBoard.DTO" %>
<%@ page import = "java.text.SimpleDateFormat" %>
        <%@ include file="../test2/mainform5.jsp"%>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<%
   int p_num = Integer.parseInt(request.getParameter("p_num"));
   String p_pageNum = request.getParameter("p_pageNum");

   SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");

   try{
      DAO dbPro = DAO.getInstance();
      DTO article =  dbPro.getArticle(p_num);
  
	  int p_ref=article.getP_ref();
	  int p_re_step=article.getP_re_step();
	  int p_re_level=article.getP_re_level();
	  int back = (int)(p_num - 1);
	  int forward = (int)(p_num + 1);
%>
<body>  
<center><b>글내용 보기</b>
       <td align="right"><input  type="button" value="이전글" onclick="document.location.href='content.jsp?p_num=<%=back%>&p_pageNum=<%=p_pageNum%>'">
       <input  type="button" value="다음글" onclick="document.location.href='content.jsp?p_num=<%=forward%>&p_pageNum=<%=p_pageNum%>'"></td>
<br>
<form>
<table width="700" border="1" cellspacing="0" cellpadding="0" align="center">
  <tr height="30">
    <td align="center" width="150" >&nbsp;&nbsp;글번호</td>
    <td align="center" width="150" align="center"><%=article.getP_num()%></td>
    <td align="center" width="150" >조회수</td>
    <td align="center" width="150" align="center"><%=article.getP_readcount()%></td>
    <td align="center" width="150" >작성자</td>
    <td align="center" width="150" align="center"><%=article.getP_writer()%></td>
    </table>
    <table width="700" border="1" cellspacing="0" cellpadding="0" align="center">
  </tr>
    <tr height="30">
    <td align="center" width="125" >글제목</td>
    <td align="center" width="375" align="center" colspan="3">
	     <%=article.getP_subject()%></td>
  </tr>
  <tr>
    <td align="center" width="125" >글내용</td>
    <td align="left" width="150" height = "100" colspan="3"><textarea rows="30%" cols="80%" readonly><%=article.getP_content()%></textarea></td>
  </tr>
  </tr>
  <tr height="30">      
    <td colspan="4" align="right" > 
    <%if(session.getAttribute("m_id")!=null){ %>
    	<%
    		String id = (String)session.getAttribute("m_id");
    		if(id.equals(article.getP_writer())){
    	%> 
	  <input type="button" value="글수정" 
       onclick="document.location.href='updateForm.jsp?p_num=<%=article.getP_num()%>&p_pageNum=<%=p_pageNum%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
	  <input type="button" value="글삭제" 
       onclick="document.location.href='deleteForm.jsp?p_num=<%=article.getP_num()%>&p_pageNum=<%=p_pageNum%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
	   
	   <input type="button" value="답글쓰기" 
       onclick="document.location.href='writeForm.jsp?p_num=<%=p_num%>&p_ref=<%=p_ref%>&p_re_step=<%=p_re_step%>&p_re_level=<%=p_re_level%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
	   
       <%} if(!id.equals(article.getP_writer()))
           {
           %> 
	   	
       <input type="button" value="답글쓰기" 
       onclick="document.location.href='writeForm.jsp?p_num=<%=p_num%>&p_ref=<%=p_ref%>&p_re_step=<%=p_re_step%>&p_re_level=<%=p_re_level%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
      
      <input type="button" value="글목록" 
       onclick="document.location.href='list.jsp?p_pageNum=<%=p_pageNum%>'">
       
       <input type="button" value="이전글" onclick="document.location.href='content.jsp?p_num=<%=back%>&p_pageNum=<%=p_pageNum%>'">
       <input type="button" value="다음글" onclick="document.location.href='content.jsp?p_num=<%=forward%>&p_pageNum=<%=p_pageNum%>'">
       
       <%} } else if (session.getAttribute("a_id") !=null){ %>
       
       <input type="button" value="글수정" 
       onclick="document.location.href='updateForm.jsp?p_num=<%=article.getP_num()%>&p_pageNum=<%=p_pageNum%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
	  <input type="button" value="글삭제" 
       onclick="document.location.href='deleteForm.jsp?p_num=<%=article.getP_num()%>&p_pageNum=<%=p_pageNum%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
      
             <input type="button" value="답글쓰기" 
       onclick="document.location.href='writeForm.jsp?p_num=<%=p_num%>&p_ref=<%=p_ref%>&p_re_step=<%=p_re_step%>&p_re_level=<%=p_re_level%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
      
      <input type="button" value="글목록" 
       onclick="document.location.href='list.jsp?p_pageNum=<%=p_pageNum%>'">
       
       <input type="button" value="이전글" onclick="document.location.href='content.jsp?p_num=<%=back%>&p_pageNum=<%=p_pageNum%>'">
       <input type="button" value="다음글" onclick="document.location.href='content.jsp?p_num=<%=forward%>&p_pageNum=<%=p_pageNum%>'">
    
    <% }else if(session.getAttribute("m_id") ==null){ %>
       <input type="button" value="글목록" 
       onclick="document.location.href='list.jsp?p_pageNum=<%=p_pageNum%>'">
       
       <input type="button" value="이전글" onclick="document.location.href='content.jsp?p_num=<%=back%>&p_pageNum=<%=p_pageNum%>'">
       <input type="button" value="다음글" onclick="document.location.href='content.jsp?p_num=<%=forward%>&p_pageNum=<%=p_pageNum%>'">

    </td>
  </tr>
</table>    
<%} else {
      
      }
 }catch(Exception e){} 
 %>
</form>      
</body>
</html>      
