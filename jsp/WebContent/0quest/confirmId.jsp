<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="obj140.bean.DAO"%>


<html>

<%request.setCharacterEncoding("euc-kr");%>
	
<% String id = request.getParameter("id");
	DAO manager = DAO.getInstance();
	int check = manager.confirmId(id);%>
	<%-- id값을 DAO에서 파라미터값을 불려온다. DAO에서 getInstance에서 아이디를 입력할 수 있는 공간을 만들어준다. confirmId 메소드를 통해 나온 결과값을 check에다가
	넣어준다. --%>
<body>
<script language="Javascript">
 function setid(){
 	opener.document.userinput.id.value="<%=id%>";
	self.close();
	}
 //setid 메소드에서는 자신을 불러준 opener페이지에다가 id값을 넣어준다. 그리고 자신의 페이지를 종료를 한다.
</script>
	<%
		if (check == 1) {
			//본 if절인 check==1이 달성된 경우 아이디가 검색이 되기 때문에 primary key가 걸려있기 때문에 중복 사용이 불가능하다.
	%>
	<table width="300" border="1">
		<tr>
			<td height="39"><%=id%>이미 사용중인 아이디입니다.</td>
			<%-- 그렇기 때문에 본 아이디는 사용중이라고 설명을 하고 있다. --%>
		</tr>
	</table>
	<form name="checkForm" method="post" action="confirmId.jsp"><%-- 그리고 다시 자신 jsp를 다시 실행을 시킨다. 
	 중복 여부를 체크하기 위해 원하는 아이디를 검색할 수 있는 기능이 있다.--%>
		<table width="300" border="1">
			<tr>
				<td>다른 아이디를 선택하세요<p>
						<input type="text" size="10" minlength="12" name="id"> <input
							type="submit" value="ID중복확인">
				</td>
			</tr>
		</table>
	</form>
	<%
		} else {
			//else는 check != 1인 경우이기 때문에 아이디가 검색이 되지 않는다. 그렇기 때문에 위 아이디는 사용이 가능하다.
	%>
	<table width="300" border="1">
		<tr>
			<td align="center"> 
				<p>입력하신 <%=id%>는 사용하실 수 있는 아이디입니다.</p>
				<%-- 그렇기 때문에 본 아이디는 사용가능이라고 설명을 하고 있다. --%>
			<input type="button" value="닫기" onclick="setid()">
			<%-- 온클릭에서 setid()메소드로 연결을 하고 있다. --%>
			</td>
		</tr>
	</table>
	<%
		}
	%>
</body>
</html>


