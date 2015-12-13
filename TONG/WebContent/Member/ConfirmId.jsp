<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="DATADB.bean.DAO"%>


<html>
<head>
<title>중복확인</title>
<link href="style.css" rel="stylesheet" type="text/css">

<% request.setCharacterEncoding("EUC-KR"); %>

<%

  String id = request.getParameter("m_id");
  DAO membership = DAO.getInstance();
  int check = membership.ConfirmId(id);  // check변수를 선언하고.DAO confirmId함수에서 얻은 결과를 가져옴
  
  %>

<body bgcolor="white">
	<%
  if (check ==1 ) { //confirmId함수에서 1을 반환하면 해당 아이디가 있는것이였기 때문에 다른아이디를 선택하도록한다.
  %>
	<table width="200" border="0" cellspacing="0" cellpadding="5">
		<tr bgcolor="white">
			<td height="39"><%=id%>이미 사용중인 아이디 입니다.</td>
		</tr>
	</table>
	<form name="checkForm" method="post" action="ConfirmId.jsp">
		<table width="100" border="0" cellspacing="0" cellpadding="5">
			<tr>
				<td bgcolor="white" align="center"><P>다른아이디를 선택하세요.</P> <input
					type="text" size="10" maxlength="12" name="m_id"> <input
					type="submit" value="ID중복확인"></td>
			</tr>
		</table>
	</form>

	<% }else  //아이디가 없을때 , 해당 아이디를 사용하도록 함
              // onclick="setid()" 버튼 속성 사용
	{  %>
	<table width="200" border="0" cellspacing="0" cellpadding="5">
		<tr bgcolor="white">
			<td align="center">
				<p>
					입력하신
					<%=id%>
					는 사용하실수 있는 ID입니다.
				</p> <input type="button" value="닫기" onclick="setM_id()">
			</td>
		</tr>
	</table>

	<% } %>


</body>
</html>
<script language="javascript">
 
    function setM_id()  <% //setid()함수 , 자바스크립트의 opener 메소드 
                         // opener.document.폼네임.필드네임.value="<%=id>%";
                         //팝업창을 띄우고나서 다시 부모창으로 결과 값을 돌려줄때 사용한다.
                            
                            %>
   {
	  opener.document.userinput.m_id.value="<%=id%>";
		self.close();  //자기자신 창을 닫는다.
	}

	
</script>


<
