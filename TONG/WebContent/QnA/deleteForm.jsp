<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
    <%@ include file="../test2/mainform5.jsp"%>
<%
  int q_num = Integer.parseInt(request.getParameter("q_num"));
  String q_pageNum = request.getParameter("q_pageNum");

%>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">

<script language="JavaScript">      
<!--      
  function deleteSave(){	
	if(document.delForm.passwd.value==''){
	alert("비밀번호를 입력하십시요.");
	document.delForm.passwd.focus();
	return false;
 }
}    
// -->      
</script>
</head>

<body>
<center><b>글삭제</b>
<br>
<form method="POST" name="delForm"  action="deletePro.jsp?q_pageNum=<%=q_pageNum%>" 
   onsubmit="return deleteSave()"> 
 <table border="1" align="center" cellspacing="0" cellpadding="0" width="360">
  <tr height="30">
     <td align=center>
       <b>비밀번호를 입력해 주세요.</b></td>
  </tr>
  <tr height="30">
     <td align=center >비밀번호 :   
       <input type="password" name="q_password2" size="8" maxlength="12">
	   <input type="hidden" name="q_num" value="<%=q_num%>"></td>
 </tr>
 <tr height="30">
    <td align=center >
      <input type="submit" value="글삭제" >
      <input type="button" value="글목록" 
       onclick="document.location.href='list.jsp?q_pageNum=<%=q_pageNum%>'">     
   </td>
 </tr>  
</table> 
</form>
</body>
</html> 
