<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setCharacterEncoding("EUC-KR"); %>
<html>
<head>
<title>��ǰ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>
</head>

<% 

int num = 0;
	if(request.getParameter("num")!=null){
		num=Integer.parseInt(request.getParameter("num"));
	}

%>



   
<body>  
<p align="center"><strong>��ǰ���</strong></p>
<br>

<form name="ProductForm" method="post" enctype="multipart/form-data" action="ProductP.jsp" onsubmit="return writeSave()">
<table width="450" cellspacing="0" cellpadding="0" align="center">
   <tr>
    <td align="right" colspan="2" >
	    <a href="ProductBuy.jsp"> ������������ </a>   <%--Style.jsp �� �̵�  ��ĭ�ڷ� �̵� --%>
   </td>
   </tr>
   <tr>
  	<td>
  	���� </td>
  	<td>
	<input type="file" name="s_image" value="���ε�">

	</td>
  </tr>
  <tr>
    <td  width="100"   align="center" >��ǰ�̸�</td>
   <td  width="330">
       <input type="text" size="40" maxlength="20" name="s_name" ></td>  
  </tr>
<tr>
    <td  width="100"   align="center" >��ǰ���</td>
   <td  width="330">
       <input type="text" size="40" maxlength="20" name="s_stock" ></td>  
  </tr>
 
  <tr>
  <td>
  ��ǰ����
  </td>
  <td>
  <input type="text" size="10" maxlength="10" name="s_price">��
  </td>
  </tr>
  <tr>
  <td>
   ��ǰ����
  </td>
 <td>
<textarea name="s_derail" rows="13" cols="40"></textarea>
 </td>
  </tr>
<tr>      
 <td colspan=2  align="center"> 
  <input type="submit" value="�۾���" >  
  <input type="reset" value="�ٽ��ۼ�">
  <input type="button" value="���� ��Ϻ���" OnClick="window.location='ProductBuy.jsp'">
  <a href="/TONG/admin/main.jsp">����
</td></tr></table>    




</form>      
</body>
</html>      