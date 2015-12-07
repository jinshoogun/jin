<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file ="../test2/mainform5.jsp" %>
<%
request.setCharacterEncoding("EUC-KR"); %>
<html>
<head>
<title>회원가입</title>
<body>
	
	<tr>
		<center><td >
			<input name="confirm" type="submit" value="일반회원가입"
			        onclick="javascript:window.location='InputForm.jsp'">
			</td>
		<td>
			
				<input name="cancel" type="button" value="디자이너회원가입"
					onclick="javascript:window.location='D_inputForm.jsp'"></center>
					</td>
					</tr>
					</body></html>