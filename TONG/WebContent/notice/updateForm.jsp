<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "DATADB.bean.nDAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>
</head>

<%
  int n_num = Integer.parseInt(request.getParameter("n_num"));
  String pageNum = request.getParameter("pageNum");
  try{
      nDAO dbPro = nDAO.getInstance();
      DTO article =  dbPro.updateGetArticle(n_num);

%>

<body  >  
<center><b>�ۼ���</b>
<br>
<form method="post" name="writeform" action="updatePro.jsp?pageNum=<%=pageNum%>" onsubmit="return writeSave()">
<table width="400" border="1" cellspacing="0" cellpadding="0"    align="center">
  <tr>
    <td  width="70"    align="center">�� ��</td>
    <td align="left" width="330">
       <input type="text" size="10" maxlength="10" name="n_writer" value="<%=article.getN_writer()%>">
	   <input type="hidden" name="n_num" value="<%=article.getN_num()%>"></td>
  </tr>
  <tr>
    <td  width="70"    align="center" >�� ��</td>
    <td align="left" width="330">
       <input type="text" size="40" maxlength="50" name="n_subject" value="<%=article.getN_subject()%>"></td>
  </tr>
  <tr>
    <td  width="70"    align="center" >�� ��</td>
    <td align="left" width="330">
     <textarea name="n_content" rows="13" cols="40"><%=article.getN_content()%></textarea></td>
  </tr>
  <tr>
    <td  width="70"    align="center" >��й�ȣ</td>
    <td align="left" width="330" >
     <input type="password" size="8" maxlength="12" name="n_password">
     
	 </td>
  </tr>
  <tr>      
   <td colspan=2   align="center"> 
     <input type="submit" value="�ۼ���" >  
     <input type="reset" value="�ٽ��ۼ�">
     <input type="button" value="��Ϻ���" 
       onclick="document.location.href='notice.jsp?pageNum=<%=pageNum%>'">
   </td>
 </tr>
 </table>
</form>
<%
}catch(Exception e){}%>      
      
</body>
</html>      
