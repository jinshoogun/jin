<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="obj140.bean.DAO"%>


<html>

<%request.setCharacterEncoding("euc-kr");%>
	
<% String nick = request.getParameter("nick");
	DAO manager = DAO.getInstance();
	int check = manager.confirmNick(nick);%>
		<%-- nick 값을 DAO에서 파라미터값을 불려온다. DAO에서 getInstance에서 아이디를 입력할 수 있는 공간을 만들어준다. confirmNick 메소드를 통해 나온 결과값을 check에다가
	넣어준다. --%>

<body>
<script language="Javascript">
 function setnick(){
 	opener.document.userinput.nick.value="<%=nick%>";
	self.close();
	}
//setnick 메소드에서는 자신을 불러준 opener페이지에다가 id값을 넣어준다. 그리고 자신의 페이지를 종료를 한다.
</script>
	<%
		if (check == 1) {
			//본 if절인 check==1이 달성된 경우 닉네임이 검색이 되기 때문에 unique로 설정되어 있기 때문에 중복 사용이 불가능하다.
	%>
	
	<table>
		<tr>
			<td height="39"><%=nick%>은(는) 이미 사용중인 닉네임입니다.</td>
			<%-- 그렇기 때문에 본 닉넴은 사용중이라고 설명을 하고 있다. --%>
		</tr>
	</table>
	<form name="checkForm" method="post" action="confirmNick.jsp"> <%-- 그리고 다시 자신 jsp를 다시 실행을 시킨다.
	 중복 여부를 체크하기 위해 원하는 닉넴을 검색할 수 있는 기능이 있다.--%>
		<table>
			<tr>
				<td>다른 닉네임을 선택하세요<p>
						<input type="text" size="10" minlength="12" name="nick"> <input
							type="submit" value="닉네임 중복확인">
				</td>
			</tr>
		</table>
	</form>
	<%
		} else {
			//else는 check != 1인 경우이기 때문에 닉네임이 검색이 되지 않는다. 그렇기 때문에 위 닉네임 사용이 가능하다.
	%>
	<table width="300" border="1">
		<tr>
			<td align="center"> 
				<p>입력하신 <%=nick%>(은)는 사용하실 수 있는 닉네임입니다.</p>
				<%-- 그렇기 때문에 본 닉네임은 사용가능이라고 설명을 하고 있다. --%>
			<input type="button" value="닫기" onclick="setnick()">
			<%-- 온클릭에서 setnick()메소드로 연결을 하고 있다. --%>
			</td>
		</tr>
	</table>
	<%
		}
	%>
</body>
</html>


