<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
        <%@ include file="../test2/mainform5.jsp"%>
<%
  int p_num = Integer.parseInt(request.getParameter("p_num"));
  String p_pageNum = request.getParameter("p_pageNum");

%>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">

<script language="JavaScript">      
<!--      
  function deleteSave(){	
	if(document.delForm.passwd.value==''){
	alert("��й�ȣ�� �Է��Ͻʽÿ�.");
	document.delForm.passwd.focus();
	return false;
 }
}    
// -->      
</script>
</head>

<body>
<center><b>�ۻ���</b>
<br>
<form method="POST" name="delForm"  action="deletePro.jsp?p_pageNum=<%=p_pageNum%>" 
   onsubmit="return deleteSave()"> 
 <table border="1" align="center" cellspacing="0" cellpadding="0" width="360">
  <tr height="30">
     <td align=center>
       <b>��й�ȣ�� �Է��� �ּ���.</b></td>
  </tr>
  <tr height="30">
     <td align=center >��й�ȣ :   
       <input type="password" name="p_password" size="8" maxlength="12">
	   <input type="hidden" name="p_num" value="<%=p_num%>"></td>
 </tr>
 <tr height="30">
    <td align=center>
      <input type="submit" value="�ۻ���" >
      <input type="button" value="�۸��" 
       onclick="document.location.href='list.jsp?p_pageNum=<%=p_pageNum%>'">     
   </td>
 </tr>  
</table> 
</form>
</body>
</html> 
