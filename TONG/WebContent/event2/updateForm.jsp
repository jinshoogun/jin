<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB2.bean.eDAO" %>
<%@ page import = "DATADB2.bean.DTO" %>
<%@ include file="../test2/noticemainform.jsp"  %>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>
</head>

<%
  int num = Integer.parseInt(request.getParameter("e_num"));
  String pageNum = request.getParameter("pageNum");
  try{
      eDAO dbPro = eDAO.getInstance();
      DTO article =  dbPro.updateGetArticle(num);

%>

<body  >  
<center><b>�ۼ���</b>
<br>
<form method="post" name="writeform" action="updatePro.jsp?pageNum=<%=pageNum%>" onsubmit="return writeSave()">
<table width="400" border="1" cellspacing="0" cellpadding="0"    align="center">
  <tr>
    <td  width="70"    align="center">�� ��</td>
    <td align="left" width="330">
       <input type="text" size="10" maxlength="10" name="e_writer" value="<%=article.getE_writer()%>">
	   <input type="hidden" name="e_num" value="<%=article.getE_num()%>"></td>
  </tr>
  <tr>
    <td  width="70"    align="center" >�� ��</td>
    <td align="left" width="330">
       <input type="text" size="40" maxlength="50" name="e_subject" value="<%=article.getE_subject()%>"></td>
  </tr>
  <tr>
    <td  width="70"    align="center" >�� ��</td>
    <td align="left" width="330">
     <textarea name="e_content" rows="13" cols="40"><%=article.getE_content()%></textarea></td>
  </tr>
  <tr>
    <td  width="70"    align="center" >��й�ȣ</td>
    <td align="left" width="330" >
     <input type="password" size="8" maxlength="12" name="e_password">
     
	 </td>
  </tr>
  <tr>      
   <td colspan=2   align="center"> 
     <input type="submit" value="�ۼ���" >  
     <input type="reset" value="�ٽ��ۼ�">
     <input type="button" value="��Ϻ���" 
       onclick="document.location.href='event.jsp?pageNum=<%=pageNum%>'">
   </td>
 </tr>
 </table>
</form>
<%
}catch(Exception e){}%>      
      
</body>
</html>      
