<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<html>
<%@ include file="../test2/mainform5.jsp"  %>

   
<body >  
<center><b>�۾���</b>
<br>
<form method="post" action="storenamepro.jsp" name="storename" onSubmit="return checkIt()">
<table  align="center">
   <tr>
    <td  align="center">��������</td>
    <td  width="330">
       <input type="text" size="40" maxlength="30" name="storename" ></td>
  </tr>
<tr>      
 <td align="center"> 
  <input type="submit" value="Ȯ��" >  
</td></tr></table>    
    
</form>      
</body>
</html>   