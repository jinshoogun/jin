<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>
<body>
	<center>
		<font size="6" color="green"> 회원 가입신청서입니다. 작성해주세욧! <br />
	</center>


		<table border="1" align="center">

			<tr>
				<td><center>아이디</center></td>
				<td><input type = "text" />&nbsp;<input type = "button" value = "중복확인" /> </td>
			</tr>	
				<td><center>비밀번호</center></td>
				<td><input type = "password" /> </td>
			</tr>	
				<td><center>비밀번호 확인 <br />(한번더 입력해주세요)</center></td>
				<td><input type = "password" /> &nbsp;<input type = "button" value = "중복확인" /></td>
			</tr>	
				<td><center>성별</center></td>
				<td><input type = "radio" name = "a" />남성&nbsp;<input type = "radio" name = "a" />여성</td>
			</tr>	
				<td><center>주소</center></td>
				<td> <textarea rows = "2", cols="50"></textarea> </td>
			</tr>	
				<td><center>휴대폰 또는 전화번호</center></td>
				<td>
				<select>
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
	             			</select>
	             	-
	             	<input type = "text" size="5"/>
	             	-
	             	<input type = "text" size="5"/>
				 </td>
				
			</tr>	
				<td><center>이메일 주소</center></td>
				<td> <input type = "text" />&nbsp;@ <input type = "text" />
				<select>
	               	<option>naver.com</option> 
		            <option>nate.com</option>
	              	<option>daum.net</option>
		            <option>hanmail.net</option>
	             	<option>gmail.com</option>
	             	<option>outlook.com</option> 
		            <option>기타</option>
		           
	             	</select> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td>
				
			</tr>	
				<td><center>이메일 수신 여부</center></td>
				<td><input type = "radio" name = "a" />Y&nbsp;&nbsp;<input type = "radio" name = "a" />N</td>
			</tr>	
				<td><center>닉네임 설정</center></td>
				<td><input type = "text" />&nbsp;<input type = "button" value = "중복확인" /> </td>

			</tr>	
				<td><center>소개란</center></td>
				<td> <textarea rows = "10", cols="50"></textarea> </td>
			</tr>
				<td colspan="2"><center><input type = "button" value = "확인"/>&nbsp;&nbsp;&nbsp;&nbsp;<input type = "button" value = "취소"/></center>
				  </td>
		    </tr>
		</table >
</body>
</html>