<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>

<%
  int o_num = Integer.parseInt(request.getParameter("o_num"));
  String o_pageNum = request.getParameter("o_pageNum");

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
<form method="POST" name="delForm"  action="deletePro.jsp?o_pageNum=<%=o_pageNum%>" 
   onsubmit="return deleteSave()"> 
 <table border="1" align="center" cellspacing="0" cellpadding="0" width="360">
  <tr height="30">
     <td align=center>
       <b>비밀번호를 입력해 주세요.</b></td>
  </tr>
  <tr height="30">
     <td align=center >비밀번호 :   
       <input type="password" name="o_password2" size="8" maxlength="12">
	   <input type="hidden" name="o_num" value="<%=o_num%>"></td>
 </tr>
 <tr height="30">
    <td align=center >
      <input type="submit" value="글삭제" >
      <input type="button" value="글목록" 
       onclick="document.location.href='list.jsp?o_pageNum=<%=o_pageNum%>'">     
   </td>
 </tr>  
</table> 
</form>
</body>
</html> 
