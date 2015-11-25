<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<html>
<head>
<title>게시판</title>
<script language="JavaScript" src="script.js"></script>
</head>

<%
  int o_num = Integer.parseInt(request.getParameter("o_num"));
  String o_pageNum = request.getParameter("o_pageNum");
  try{
      DAO dbPro = DAO.getInstance();
      DTO article =  dbPro.updateOnebyOneGetArticle(o_num);
%>

<body>  
<center><b>글수정</b>
<br>
<form method="post" name="writeform" action="updatePro.jsp?o_pageNum=<%=o_pageNum%>" onsubmit="return writeSave()">
<table width="400" border="1" cellspacing="0" cellpadding="0"  align="center">
  <tr>
    <td  width="70"  align="center">이 름</td>
    <td align="left" width="330">
       <input type="text" size="10" maxlength="10" name="o_writer" value="<%=article.getO_writer()%>">
	   <input type="hidden" name="o_num" value="<%=article.getO_num()%>"></td>
  </tr>
  <tr>
    <td  width="70" align="center" >제 목</td>
    <td align="left" width="330">
       <input type="text" size="40" maxlength="50" name="o_subject" value="<%=article.getO_subject()%>"></td>
  </tr>
  <tr>
    <td  width="70" align="center" >내 용</td>
    <td align="left" width="330">
     <textarea name="o_content" rows="13" cols="40"><%=article.getO_content()%></textarea></td>
  </tr>
  <tr>
    <td  width="70" align="center" >비밀번호</td>
    <td align="left" width="330" >
     <input type="password" size="8" maxlength="12" name="o_password2">
     
	 </td>
  </tr>
  <tr>      
   <td colspan=2 align="center"> 
     <input type="submit" value="글수정" >  
     <input type="reset" value="다시작성">
     <input type="button" value="목록보기" 
       onclick="document.location.href='list.jsp?o_pageNum=<%=o_pageNum%>'">
   </td>
 </tr>
 </table>
</form>
<%
}catch(Exception e){}%>      
      
</body>
</html>      
