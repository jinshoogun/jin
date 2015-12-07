<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%@ page import="DATADB.bean.DAO"%>

<html>
<head>
<title>회원탈퇴</title>

</head>

<%
	String id = (String)session.getAttribute("m_id");
	String pw = request.getParameter("m_password");

	DAO membership = DAO.getInstance();
	int check = membership.deleteMembership(id, pw);

	if (check == 1) { // DAO.java 에서 equals 함수를 통해 비교하여 동일하면 1을 반환한다.
		session.invalidate(); //1을 반환받았다면 해당정보를 모두 지우는 invalidate()함수 사용 ,모든 세션 정보를 삭제한다. 
%>
<body bgcolor="white">
	<form method="post" action="main.jsp" name="insert">  
		<table width="270" border="0" cellspacing="0" cellpadding="5"
			align="center">
			<tr bgcolor="white">
				<td height="39" align="center"><font size="+1"><b>회원정보가
							삭제되었습니다.</b></font></td>

			</tr>
			<tr bgcolor="white">
				<td align="center">
					<p>흐흐흐흑 다음에 또봐요</p>
					<meta http-equiv="Refresh" content="5;url=main.jsp">
				</td>
			</tr>
			<tr bgcolor="white">
				<td align="center"><input type="submit" value="확인"></td>
			</tr>
		</table>
	</form>

	<%
		} else {
	%>
	<script>
		alert("비밀번호가 맞지 않습니다.");
		history.go(-1);  //history는 경로 -1은 뒤로가기
		                 //자바스크립트에서 history객체
		                 //-사용자가 브라우저를 통해 이동한 페이지를 기록해둔 객체
		                 //-3개의 메서드가 있다 1. histroy.forward();
		                 //               2. history.back();
		                 //               3. history.go(숫자);
	</script>

	<%
		}
	%>

</body>
</html>
