<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<html>
<head></head><title>회원탈퇴</title>


<script language="javascript"></script>

</head>
<body onload="begin()" bgcolor="white">  

 <% // <body onload="begin()" - focus()는 커서로서, 처음시작할때 password이름을 가진 text에 커서가 위치해 있다.%>
 
 
<form name="myform" action="DeletePro.jsp" method="post" onSubmit="return checkIt()" >
                                                       <% // submit인 "회원탈퇴" 버튼을 클릭하였을때, form
                                                           //테그에 의해 <deletePro.jsp>로 이동
                                                           //이것도 마찬가지로 checkIt()함수 먼저 실행된다.%>

<table cellSpacing=1 cellPadding=1 width="260" bprder=1 align="center" >
<tr height="30" >
<td colspan="2" align="middle" bgcolor="white">
<font size="+1" ><b>회원탈퇴</b></font></td></tr>

<tr height="30">
<td width="110" bgcolor="white" align=center>비밀번호</td>
<td width="150" align=center>
<input type=password name="m_password" size="15" maxlength="12"></td></tr>
<tr height="30">
<td colspan="2" align="middle" bgcolor="white" >
<input type=submit value="회원탈퇴">
<input type="button" value="취소" onclick="javascript:window.location='main.jsp'"></td></tr>
</table>
</form>
</body>
</html>
