<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<% request.setCharacterEncoding("EUC-KR"); %>
<%@ page import="DATADB.bean.DAO"%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file = "../test2/mainform5.jsp" %>

<!DOCTYPE html>


<html>
<head>
<title>디자이너 회원가입</title>
<script language="javaScript">
	function openD_confirmId(userinput) {
		if (userinput.d_id.value == "") {
			alert("아이디를 입력하세요");
			return;
		}
		url = "D_confirmId.jsp?d_id=" + userinput.d_id.value;
		open(
				url,
				"confirm, toolbar=no,location=no,status=no,menubar=no,scrollbars=no,width=300,height=180");
	}

	function openD_confirmPw(userinput) {
		if (userinput.d_password.value != userinput.d_password1.value) {
			alert("비밀번호가 다릅니다 다시 입력해주세요.");
			return false;
		} else {
			alert("♥사용가능♥");
			return;
		}
	}
	function checkIt() { //테이블에 있는 form에서 function으로 동작이 실시하게 되면 정의를 내린다. 그리고 checkIt변수로 실시한다.
		var userinput = eval("document.userinput") //var는 변수에 대해서 임시적으로 저장하는 공간을 넣는 것을 의미하는데, userinput에다가 현재 문서에 userinput이란 테이블 변수를 불려들인다.
		// 그리고 eval로 통해 숫자 및 문자열들을 코드로 인식을 할 수 있다.

		if (!userinput.d_id.value) { //id 값이 비어 있을때 본 알람이 울린다.
			alert("아이디를 입력하세요");
			return false;
		}
		if (!userinput.d_password.value || !userinput.d_password1.value) { //pw와 pw1둘 중 하나 값이 비어 있을때 본 알람이 울린다.
			alert("비밀번호 입력하세요");
			return false;

		}
		if (!userinput.d_name.value) { //이름 값이 비어 있을때 본 알람이 울린다.
			alert("이름을 입력하세요");
			return false;
		
		}
		
		if (!userinput.d_email.value || !userinput.domain.value) { //메일아이디나 도메인주소 값이 비어 있을때 본 알람이 울린다.
			alert("이메일을 입력하세요");
			return false;
		}
		
		if (userinput.d_sex.value == "") { //radio인 성별 체크하지 않는 경우 본 알람 발생 그렇기 때문에 본 글에서 userinput.a.value == ""로 대신 작성
			alert("성별을 체크하세요");
			return false;
		}

		if (!userinput.d_birth.value) {
			alert("생년월일을  입력하세요");
			return false;
		}

		if (!userinput.d_phone.value) { 
			alert("핸드폰번호를 입력하세요");
			return false;
		}
	}
</script>
<body>
	<form method="post" action="D_inputPro.jsp" name="userinput" onSubmit="return checkIt()">
	
				<center><h1>디자이너 회원가입</h1></center>
			
			<center>
				<div data-role="content">

					<table>
						<tr>
							<td align="center" width=100>아이디</td>
							<td colspan=1><input type="text" name="d_id" /></td>
							<td><input name="checkin_id" type="button" value="중복확인"
								onClick="openD_confirmId(this.form)"></td>
						</tr>

						<tr>
							<td align="center">암호</td>
							<td colspan=3><input type="password" name="d_password" /></td>
						</tr>


						<tr>
							<td align="center">암호확인</td>
							<td colspan=1><input type="password" name="d_password1" /></td>
							<td><input type="button" name="pw" value="중복확인"
								OnClick="openD_confirmPw(this.form)" /></td>
						</tr>

						<tr>
							<td align="center">이름</td>
							<td colspan=3><input type="text" name="d_name" /></td>
						</tr>
						
						<tr>
							<td align="center">닉네임</td>
							<td colspan=3><input type="text" name="d_nickname" /></td>
						</tr>


						<tr>
							<td align="center">이메일</td>
							<td colspan=3><input type="text" name="d_email"></td>
						</tr>


							<td align="center">성별</td>
							<td>
							<input type="radio" name="d_sex" id="radio-choice-1"
										value="man" checked="checked"/>man

									<input type="radio" name="d_sex" id="radio-choice-2"
										value="woman" />woman
							</td>
						</tr>

						<tr>
							<td align="center">생년월일</td>
							<td colspan=2><input type="text" name="d_birth">예)910111</td>
					
						</tr>
						<tr>
							<td align="center">매장이름</td>
							<td colspan=3><input type="text" name="d_store" /></td>
						</tr>


						<tr>
							<td align="center">핸드폰</td>
							<td colspan=3><input type="text" name="d_phone">- 빼고 입력하세요</td>
						</tr>
                  </table></div>
                  
                  
                  <table>
                  						<tr>
							<td colspan="1">
								<div align="center">
									<input name="confirm" type="submit" value="회원가입">
									</div>
								<td colspan="1">
								<div align="center">	
									<input name="cancel" type="button" value="취소" 
										onclick="javascript:window.location='../test2/mainform6.jsp'">
								</div>

							</td>
						</tr>
						</center>
					</table>
	</form>


</body>

</head>
</html>
