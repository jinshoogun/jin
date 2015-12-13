<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>




<body>
	<form name="myform" action="deletePro.jsp" method="post" Onsubmint ="return checkIt()">
		<table> <%-- 회원 탈퇴 기능으로 본 내용이 작성이 되면 deletePro.jsp파일로 전송을 하게 된다. 단, 비밀번호가 인증조건이기 때문에 post로 전달하게 된다.
		          Onsubmit로 전송하기 전에 main에 있는 checkIt()메소드를 실행하여 검사 후 전송을하게 된다. --%>
			<tr>
				<td><b>회원 탈퇴</b></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td><input type=submit value="회원탈퇴"> <%-- 본내용까지 내용을 전송을 하게 된다. --%>
				<input type="button" value="취소"
					onclick="javascript:window.location='main.jsp'"></td>
			</tr>
		</table>
	</form>
</body>
</html>