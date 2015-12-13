<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="obj140.bean.DAO"%>
<html>
<head></head>
<%
	String id = (String) session.getAttribute("memId");
	String pw = request.getParameter("pw");

	DAO manager = DAO.getInstance();
	int check = manager.deleteMember(id, pw);
	// 탈퇴 같은 경우는 id값을 불려들어서 비번으로 인증을 하게 되면 삭제되기 때문에 id와 비밀번호를 가지고와서 임시 보관을 하게된다.
	if (check == 1) {
		session.invalidate();
		//check ==1이면 탈퇴가 되어진 상태이기 때문에 로그아웃이 필요하다. 그래서 로그아웃기능이 추가시킨다.
%>


<body>
	<form method="post" action="main.jsp" name="userinput">
		<table>
			<tr>
				<td>회원정보가 삭제되었습니다.
					<meta http-equiv="Refresh" content="5;url=main.jsp">
				</td>
				<%-- 그리고 삭제가 되었다는 결과와 5초뒤에로 main으로 돌아가게 된다. --%>
			</tr>
			<tr>
				<td><input type="submit" value="확인"></td>
			</tr>
		</table>
	</form>
	<%
		} else {
	%>
	<script>
		alert("비밀번호가 맞지 않습니다.");
		history.go(-1);
	</script>
	<%--check != 1인 경우로 비밀번호가 틀린 경우이다 이경우는 이전화면으로 다시 돌아가게된다. --%>
	<%
		}
	%>

</body>
</html>