<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATA.bean.DAO" %>
<%@ page import = "DATA.bean.DTO" %>
        <%@ include file="../test2/mainform5.jsp"%>
<%
  int s_num = Integer.parseInt(request.getParameter("s_num"));
  String s_pageNum = request.getParameter("s_pageNum");

%>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">

<script language="JavaScript">
  function deleteSave(){	
	if(document.delForm.passwd.value==''){
	alert("��й�ȣ�� �Է��Ͻʽÿ�.");
	document.delForm.passwd.focus();
	return false;
 }
}        
</script>
</head>

<body>
<center><b>�ۻ���</b>
<br>
<form method="POST" name="delForm"  action="deletePro.jsp?s_pageNum=<%=s_pageNum%>" 
   onsubmit="return deleteSave()"> 
 <table border="1" align="center" cellspacing="0" cellpadding="0" width="360">
  <tr height="30">
     <td align=center>
       <b>��й�ȣ�� �Է��� �ּ���.</b></td>
  </tr>
  <tr height="30">
     <td align=center >��й�ȣ :   
       <input type="password" name="s_password" size="8" maxlength="12">
	   <input type="hidden" name="s_num" value="<%=s_num%>"></td>
 </tr>
 <tr height="30">
    <td align=center >
      <input type="submit" value="�ۻ���" >
      <input type="button" value="�۸��" 
       onclick="document.location.href='list.jsp?s_pageNum=<%=s_pageNum%>'">     
   </td>
 </tr>  
</table> 
</form>
</body>
</html> 
