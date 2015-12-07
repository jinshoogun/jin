<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATA.bean.DAO" %>
<%@ page import = "DATA.bean.DTO" %>
        <%@ include file="../test2/mainform5.jsp"%>
<html>
<head>
<title>게시판</title>
<script language="JavaScript" src="script.js"></script>
</head>

<%
  int s_num = Integer.parseInt(request.getParameter("s_num"));
  String s_pageNum = request.getParameter("s_pageNum");
  try{
      DAO dbPro = DAO.getInstance();
      DTO article =  dbPro.updateGetArticle(s_num);
%>

<body>  
<center><b>글수정</b>
<br>
<form method="post" name="writeform" action="updatePro.jsp?s_pageNum=<%=s_pageNum%>" onsubmit="return writeSave()">
<table width="400" border="1" cellspacing="0" cellpadding="0"  align="center">
  <tr>
    <td  width="70"  align="center">이 름</td>
    <td align="left" width="330">
       <input type="hidden" size="10" maxlength="10" name="s_writer" value="<%=article.getS_writer()%>"><%=article.getS_writer()%>
	   <input type="hidden" name="s_num" value="<%=article.getS_num()%>"></td>
  </tr>
  <tr>
    <td  width="70" align="center" >제 목</td>
    <td align="left" width="330">
       <input type="text" size="40" maxlength="50" name="s_subject" value="<%=article.getS_subject()%>"></td>
  </tr>
  <tr>
    <td  width="70" align="center" >내 용</td>
    <td align="left" width="330">
     <textarea name="s_content" rows="13" cols="40"><%=article.getS_content()%></textarea></td>
  </tr>
  <tr>
    <td  width="70" align="center" >비밀번호</td>
    <td align="left" width="330" >
     <input type="password" size="8" maxlength="12" name="s_password">
     
	 </td>
  </tr>
  <tr>      
   <td colspan=2 align="center"> 
     <input type="submit" value="글수정" >  
     <input type="reset" value="다시작성">
     <input type="button" value="목록보기" 
       onclick="document.location.href='list.jsp?s_pageNum=<%=s_pageNum%>'">
   </td>
 </tr>
 </table>
</form>
<%
}catch(Exception e){}%>      
      
</body>
</html>      
