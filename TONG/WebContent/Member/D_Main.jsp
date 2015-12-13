<%@ page contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>

<html>
<head>
<title>디자이너 메인 입니다.</title>

</head>
<%
	try {
		if (session.getAttribute("d_id") == null)
		//null- 로그인이 안되었을때
		{
%>
<script language="javascript">
	function focusIt() {
		document.inform.d_id.focus(); //현재문서(document.)에있는 inform을 찾아라. FOCUS=커서
	}

	function checkIt() {
		D_inputForm = eval("document.inform");
		if (!D_inputForm.d_id.value) {
			alert("아이디를 입력하세요..");
			D_inputForm.d_id.focus();
			return false;
		}
		if (!D_inputForm.d_password.value) {
			alert("패스워드를 입력하세요..");
			D_inputForm.d_password.focus();
			return false;
		}
	}
</script>
</head>
<img  src="C:\Users\소영\Desktop\JAVA\TONG\WebContent\Image\Tong1.jpg" width="150"
		height="100">
<body onLoad="focusIt();" bgcolor="white">
	<%
		// <body onLoad="함수명();"> 해당 함수를 부른다.
	%>
	<table width=500 cellpadding="0" cellspacing="0" align="center"
		border="2">
		<tr>
			<td width="300" bgcolor=#FFA2A2 height="20">&nbsp;</td>

			<form name="inform" method="post" action="LoginPro.jsp"
				onSubmit="return checkIt();">
				<%
					// infotm이름을가진 <form>실행, loginPro.jsp 로이동 (속성 onSubmit은 <form>이 진행되기전 해당함수를 실행한다)
				%>

				<td bgcolor=#F15F5F width="100" align="right">아이디</td>
				<td width="100" bgcolor=#FFDDDD><input type="text" name="d_id"
					size="15" maxlength="10"></td>
		</tr>
		<tr>
			<td rowspan="2" bgcolor=#FFE8FF width="300">디자이너 LOGIN</td>
			<td bgcolor=#C3ED60 width="100" align="right">패스워드</td>
			<td width="100" bgcolor=#5CD1E5><input type="password"
				name="d_password" size="15" maxlength="10"></td>
		</tr>
		<tr>
			<td colspan="3" bgcolor="silver" align="center"><input
				type="submit" name="Submit" value="로그인"> <input
				type="button" value="회원가입"
				onclick="javascript:window.location='AllinputForm.jsp'">
				<input type="button" value="아이디찾기"
					onclick="javascript:window.location='SearchidForm.jsp'">
					<input type="button" value="비밀번호찾기"
					onclick="javascript:window.location='SearchpwForm.jsp'"></td>
			</form>
		</tr>
	</table>
	<%
		} else { //로그인이 되었을때
	%>
	<table width=500 cellpadding="0" cellspacing="0" align="center"
		border="1">
		<tr>
			<td width="300" bgcolor="silver" height="20">어서오세요</td>

			<td rowspan="3" bgcolor="silver" align="center"><%=session.getAttribute("d_id")%>디자이너님
				<br> 환영합니다!
				<form method="post" action="D_logout.jsp">
					<input type="submit" value="로그아웃"> <input type="button"
						value="회원정보변경"
						onclick="javascript:window.location='D_modifyForm.jsp'">

				</form></td>
		</tr>
		<tr>
			<td rowspan="2" bgcolor="white" width="300">머리통입니다.</td>
		</tr>
	</table>
	<br>
	<%
		}
		} catch (NullPointerException e) {
		}
	%>
</body>
</html>
