<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file ="../test2/mainform5.jsp" %>
<%
request.setCharacterEncoding("EUC-KR"); %>
<html>
<head>
<title>ȸ������</title>
<body>
	
	<tr>
		<center><td >
			<input name="confirm" type="submit" value="�Ϲ�ȸ������"
			        onclick="javascript:window.location='InputForm.jsp'">
			</td>
		<td>
			
				<input name="cancel" type="button" value="�����̳�ȸ������"
					onclick="javascript:window.location='D_inputForm.jsp'"></center>
					</td>
					</tr>
					</body></html>