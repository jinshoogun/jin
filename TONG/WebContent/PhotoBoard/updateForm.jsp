<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "PhotoBoard.DAO" %>
<%@ page import = "PhotoBoard.DTO" %>
        <%@ include file="../test2/mainform5.jsp"%>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>
</head>

<%
  int p_num = Integer.parseInt(request.getParameter("p_num"));
  String p_pageNum = request.getParameter("p_pageNum");
  try{
      DAO dbPro = DAO.getInstance();
      DTO article =  dbPro.updateGetArticle(p_num);

%>

<body>  
<center><b>�ۼ���</b>
<br>
<form method="post" name="writeform" action="updatePro.jsp?p_pageNum=<%=p_pageNum%>" onsubmit="return writeSave()">
<table width="400" border="1" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td  width="70" align="center">�� ��</td>
    <td align="left" width="330">
       <input type="text" size="10" maxlength="10" name="p_writer" value="<%=article.getP_writer()%>">
	   <input type="hidden" name="p_num" value="<%=article.getP_num()%>"></td>
  </tr>
  <tr>
    <td  width="70" align="center" >�� ��</td>
    <td align="left" width="330">
       <input type="text" size="40" maxlength="50" name="p_subject" value="<%=article.getP_subject()%>"></td>

  </tr>
  <tr>
    <td  width="70"align="center" >�� ��</td>
    <td align="left" width="330">
     <textarea name="p_content" rows="13" cols="40"><%=article.getP_content()%></textarea></td>
  </tr>
  <tr>
    <td  width="70" align="center" >��й�ȣ</td>
    <td align="left" width="330" >
     <input type="password" size="8" maxlength="12" name="p_password">
     
	 </td>
  </tr>
  <tr>      
   <td colspan=2 align="center"> 
     <input type="submit" value="�ۼ���" >  
     <input type="reset" value="�ٽ��ۼ�">
     <input type="button" value="��Ϻ���" 
       onclick="document.location.href='list.jsp?p_pageNum=<%=p_pageNum%>'">
   </td>
 </tr>
 </table>
</form>
<%
}catch(Exception e){}%>      
      
</body>
</html>      
