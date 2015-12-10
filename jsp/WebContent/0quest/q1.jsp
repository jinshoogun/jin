<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<html>
<head>
<body>
	<center>
		<font size="6" color="green"> 카페회원 가입신청서입니다. 작성해주세욧! <br />
	</center>

<form action="insert.do" method="post" name ="userinput" onSubmit="return checkIt()">
	<table border="1" align="center" >
			<%-- 본 내용들을 insert.jsp로 post형식으로 전달을 하게 됩니다. 이때 return(가입완료 버튼을 누를때)되기 직전에 function checkIt()메소드로 들어가서 조건 여부를
			확인을 하고 조건에 맞는 경우 false로 통해 에러 알람을 발생시키고 조건이  true로 수행하게 된다면  submit을 하게 되엇 insert.jsp로 정보를 전달을 하게 된다.--%>
			<tr>
				<td><center>
						아이디<br /> (6자 이상 적으세요)
					</center></td>
				<td><input type="text" name=id /> 
				<input type="button" value="중복확인" name=idch OnClick="openConfirmid(this.form)" /> 
					<%-- 아이디의 중복여부를 체크하기 위해서  현재폼에서 openConfirmid 메소드를 실행한다. --%>
				</td>
			</tr>
			<td><center>
					비밀번호<br /> (6자 이상 적으세요)
				</center></td>
			<td><input type="password" name=pw /></td>
			</tr>
			<td><center>
					비밀번호 확인 <br />(한번더 입력해주세요)
				</center></td>
			<td><input type="password" name=pw1 /> <input type="button"
				value="중복확인" name=pwch OnClick="openConfirmpw(this.form)" /></td>
			<%-- 비밀번호가 올바르게 작성여부를 확인한다. 온클릭을 통해 openConfirmpw function 메소드로 넘어가게 된다. --%>
			</tr>
			<td><center>이름</center></td>
			<td><input type="text" name=na /></td>
			</tr>
			<td><center>성별</center></td>
			<td><input type="radio" name="a" value="남성" />남성 <input
				type="radio" name="a" value="여성" />여성</td>
			</tr>
			<td><center>주소</center></td>
			<td><textarea rows="2" , cols="50" name="add"></textarea></td>
			</tr>
			<td><center>휴대폰 또는 전화번호</center></td>
			<td><select name="phfirst">
					<option>010</option>
					<option>011</option>
					<option>016</option>
					<option>017</option>
					<option>018</option>
					<option>019</option>
					<option>02</option>
					<option>051</option>
					<option>053</option>
					<option>032</option>
					<option>062</option>
					<option>042</option>
					<option>052</option>
					<option>044</option>
					<option>031</option>
					<option>033</option>
					<option>043</option>
					<option>041</option>
					<option>063</option>
					<option>061</option>
					<option>054</option>
					<option>055</option>
					<option>064</option>
					<option>없음</option>
			</select> - <input type="text" size="5" name=phsec /> - <input type="text"
				size="5" name=phthr /></td>

			</tr>
			<td><center>이메일 주소</center></td>
			<td><input type="text" name="mailId" /> @ <input type="text"
				name="domain" /> <select name="domain1">
					<option>직접입력</option>
					<option>naver.com</option>
					<option>nate.com</option>
					<option>daum.net</option>
					<option>hanmail.net</option>
					<option>gmail.com</option>
					<option>outlook.com</option>
			</select></td>

			</tr>
			<td><center>이메일 수신 여부</center></td>
			<td><input type="radio" name="b" value="동의" />Y <input
				type="radio" name="b" vaule="비동의" />N</td>
			</tr>
			<td><center>
					닉네임 설정<br /> (2자 이상 적으세요)
				</center></td>
			<td><input type="text" name="nick" /> <input type="button"
				value="중복확인" name="nich" OnClick="openConfirmnick(this.form)"/></td>
	        <%-- 닉네임이 중복여부를 있는지 확인을 하는 버튼이다. 그래서 온클릭을 통해 openConfirmnick function 메소드로 넘어가게 된다. --%>
			</tr>
			<td><center>
					소개란<br /> (10자 이상 적으세요)
				</center></td>
			<td><textarea rows="10" , cols="50" name="intru"></textarea></td>
			</tr>
			<td colspan="2"><center>
					<input type="submit" value="확인" name="com" /> <input type="reset"
						value="초기화" name="reset" />
					<%-- submit을 미리 확인버튼에 사용을 하였기 때문에 취소버튼은 button으로 사용하였고 main화면으로 돌아오게 됩니다. 
				또한, 초기화 버튼으로 모든 정보를 리셋하게 만듭니다.--%>
					<input type="button" value="취소"
						onclick="javascript:location.href='main.do'"/>
					<%-- 가입을 하다가 취소하면 뒤로 main.jsp로 돌아옵니다 --%>
		</form>
		</center>
		</td>
		</tr>
		</form>
	</table>
</body>
</html>