<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
    <%@ page import = "Style.DAO"%>
    <%@ page import = "Style.DTO"%>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ include file="../test2/mainform5.jsp" %>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<%
request.setCharacterEncoding("EUC-KR");

   int num = Integer.parseInt(request.getParameter("num"));
   String pageNum = request.getParameter("pageNum");

   SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");

   try{
      DAO dbPro = DAO.getInstance();
      DTO article =  dbPro.getArticle(num);
  
	  int ref=article.getStyle_Ref();
%>
<body >  
<center><b>�۳��� ����</b>
<br>
<form>
<table width="500" border="1" cellspacing="0" cellpadding="0" align="center">  
  <tr height="30">
    <td align="center" width="125">�۹�ȣ</td>
    <td align="center" width="125" align="center">
	     <%=article.getNum()%></td>
	     
    <td align="center" width="125" >����</td>
    <td align="center" width="125" align="center">
	    <img width="250" height="150" src="/TONG/DesignerImage/<%=article.getStyle_Photo()%>"></td>
  </tr>
  <tr height="30">
    <td align="center" width="125">���� </td>
    <td align="center" width="125" align="center">
	     <%=article.getStyle_Storename()%></td>
	     
    <td align="center" width="125"   >����</td>
    <td align="center" width="125" align="center">
	     <%=article.getStyle_Area()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="125"  >����</td>
    <td align="center" width="375" align="center" colspan="3">
	     <%=article.getStyle_Sex()%></td>
  </tr>
   <tr height="30">
    <td align="center" width="125"  >�����̳ʾ��̵�</td>
    <td align="center" width="375" align="center" colspan="3">
	     <%=article.getStyle_storeid()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="125"  >��Ÿ��</td>
    <td align="center" width="375" align="center" colspan="3">
	     <%=article.getStyle_Style()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="125" >����</td>
    <td align="center" width="375" align="center" colspan="3">
	     <%=article.getStyle_Price()%></td>
  </tr>
  <tr>
    <td align="center" width="125"  >�ڱ�Ұ�</td>
    <td align="left" width="375" colspan="3"><pre><%=article.getStyle_Myself()%></pre></td>
  </tr>
  <tr height="30">      
    <td colspan="4"   align="right" > 
    
	  
       <input type="button" value="�۸��" 
       onclick="document.location.href='style.jsp?pageNum=<%=pageNum%>'">
       <input type="button" value="����" 
       onclick="document.location.href='../reserve/ReserveForm.jsp?num=<%=article.getNum()%>&pageNum=<%=pageNum%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
    </td>
  </tr>
</table>    
<%
 }catch(Exception e){} 
 %>
</form>      
</body>
</html>