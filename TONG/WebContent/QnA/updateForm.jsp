<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<html>
<head>
<title>�Խ���</title>
<script language="JavaScript" src="script.js"></script>
</head>

<%
  int q_num = Integer.parseInt(request.getParameter("q_num"));
  String q_pageNum = request.getParameter("q_pageNum");
  try{
      DAO dbPro = DAO.getInstance();
      DTO article =  dbPro.updateGetArticle(q_num);
%>

<body>  
<center><b>�ۼ���</b>
<br>
<form method="post" name="writeform" action="updatePro.jsp?q_pageNum=<%=q_pageNum%>" onsubmit="return writeSave()">
<table width="400" border="1" cellspacing="0" cellpadding="0"  align="center">
  <tr>
    <td  width="70"  align="center">�� ��</td>
    <td align="left" width="330">
       <input type="text" size="10" maxlength="10" name="q_writer" value="<%=article.getQ_writer()%>">
	   <input type="hidden" name="q_num" value="<%=article.getQ_num()%>"></td>
  </tr>
  <tr>
    <td  width="70" align="center" >�� ��</td>
    <td align="left" width="330">
       <input type="text" size="40" maxlength="50" name="q_subject" value="<%=article.getQ_subject()%>"></td>
  </tr>
  <tr>
    <td  width="70" align="center" >�� ��</td>
    <td align="left" width="330">
     <textarea name="q_content" rows="13" cols="40"><%=article.getQ_content()%></textarea></td>
  </tr>
  <tr>
    <td  width="70" align="center" >��й�ȣ</td>
    <td align="left" width="330" >
     <input type="password" size="8" maxlength="12" name="q_password2">
     
	 </td>
  </tr>
  <tr>      
   <td colspan=2 align="center"> 
     <input type="submit" value="�ۼ���" >  
     <input type="reset" value="�ٽ��ۼ�">
     <input type="button" value="��Ϻ���" 
       onclick="document.location.href='list.jsp?q_pageNum=<%=q_pageNum%>'">
   </td>
 </tr>
 </table>
</form>
<%
}catch(Exception e){}%>      
      
</body>
</html>      
