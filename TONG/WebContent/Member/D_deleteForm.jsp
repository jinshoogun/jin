<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<% request.setCharacterEncoding("EUC-KR"); %>
<html>
<head></head><title>�����̳� ȸ��Ż��</title>
<img  src="C:\Users\�ҿ�\Desktop\JAVA\TONG\WebContent\Image\Tong1.jpg" width="150"
		height="100">

<script language="javascript"></script>

</head>
<body onload="begin()" bgcolor="white">  

 <% // <body onload="begin()" - focus()�� Ŀ���μ�, ó�������Ҷ� password�̸��� ���� text�� Ŀ���� ��ġ�� �ִ�.%>
 
 
<form name="myform" action="D_deletePro.jsp" method="post" onSubmit="return checkIt()" >
                                                       <% // submit�� "ȸ��Ż��" ��ư�� Ŭ���Ͽ�����, form
                                                           //�ױ׿� ���� <deletePro.jsp>�� �̵�
                                                           //�̰͵� ���������� checkIt()�Լ� ���� ����ȴ�.%>

<table cellSpacing=1 cellPadding=1 width="260" bprder=1 align="center" >
<tr height="30" >
<td colspan="2" align="middle" bgcolor="white">
<font size="+1" ><b>ȸ��Ż��</b></font></td></tr>

<tr height="30">
<td width="110" bgcolor="white" align=center>��й�ȣ</td>
<td width="150" align=center>
<input type=password name="d_password" size="15" maxlength="12"></td></tr>
<tr height="30">
<td colspan="2" align="middle" bgcolor="white" >
<input type=submit value="ȸ��Ż��">
<input type="button" value="���" onclick="javascript:window.location='D_Main.jsp'"></td></tr>
</table>
</form>
</body>
</html>