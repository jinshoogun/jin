<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>
</head>

<% 

request.setCharacterEncoding("EUC-KR");
int num = 0;
  try{
	if(request.getParameter("num")!=null){
		num=Integer.parseInt(request.getParameter("num"));
	}

%>



   
<body>  
<center><b>�����̳� ���</b>
<br>

<form name="designer_update" method="post" enctype="multipart/form-data" action="designer_updatePro.jsp" onsubmit="return writeSave()">
<table width="450" border="1" cellspacing="0" cellpadding="0" align="center">
   <tr>
    <td align="right" colspan="2" >
	    <a href="Style.jsp"> Styleȭ������ </a>   <%--Style.jsp �� �̵�  ��ĭ�ڷ� �̵� --%>
   </td>
   </tr>
   <tr>
  	<td>
  	���� </td>
  	<td>
	<input type="file" name="Style_Photo" value="���ε�">

	</td>
  </tr>
  <tr>
    <td  width="100"   align="center" >�̿��</td>
   <td  width="330">
       <input type="text" size="40" maxlength="20" name="Style_Storename" ></td>  <%--�̿�Ǹ� �Է� --%>
  </tr>
  <tr>
    <td  width="70"  align="center">����</td>
    <td  width="330">
      ���� <input type="radio"  name="Style_Area" value="gangnam" >
      ���� <input type="radio"  name="Style_Area" value="gangbook" ></td> <%--�������� --%>
  </tr>
  <tr>
    <td  width="70"  align="center">����</td>
    <td  width="330">
      ���� <input type="radio"  name="Style_Sex" value="man" >
      ���� <input type="radio"  name="Style_Sex" value="woman" ></td>
  </tr> <%--�������� --%>
 
  <tr>
    <td  width="70"  align="center">��Ÿ��</td>
    <td  width="330">
      ĿƮ <input type="radio"  name="Style_Style" value="cut" >
      �ĸ� <input type="radio"  name="Style_Style" value="perm" >
      ���� <input type="radio"  name="Style_Style" value="dye" >
      ���� <input type="radio"  name="Style_Style" value="magic" ></td>
  </tr>  <%--��Ÿ�� ����--%>
  <tr>
  <td>
  ����
  </td>
  <td>
  <input type="text" size="10" maxlength="10" name="Style_Price">��
  </td>
  </tr>
  <tr>
  <td>
   �ڱ�Ұ�
  </td>
 <td>
<textarea name="Style_Myself" rows="13" cols="40"></textarea>
 </td>
  </tr>
<tr>      
 <td colspan=2  align="center"> 
  <input type="submit" value="�۾���" >  
  <input type="reset" value="�ٽ��ۼ�">
  <input type="button" value="��Ϻ���" OnClick="window.location='Style.jsp'">
</td></tr></table>    



 <%
  }catch(Exception e){}
%>     
</form>      
</body>
</html>      