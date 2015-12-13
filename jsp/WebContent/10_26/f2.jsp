<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>


		<table border="1" bordercolor="red">

			<tr>
				<td>aaa</td>
				<td>bbb</td>
				<td>ccc</td>
			</tr>
			<tr>
				<td colspan="2">ccc</td>
				<td>ddd</td>
			</tr>
			<tr>
				<td>eee</td>
				<td rowspan="2">fff</td>
			</tr>
			<br />
		</table>
		
		<%-- 체크박스를 만들때 사용 --%>>
		<input type = "text" />                 <br />
		<input type = "password" />             <br />
		<input type = "button" value = "버튼" /> <br />
		<input type = "checkbox" />             <br />
		<input type = "radio" name = "a" />     <br />
		<input type = "radio" name = "a" />     <br />
		<input type = "file" />                 <br />
	
		<textarea rows = "10", cols="50"></textarea> <%-- 글쓰기 칸 만들때 사용 줄, 칸 --%>>	
		<br />
		
		<select>
		<option>aaaaa</option> <%-- 옵션을 선택할때 사용 --%>>	
		<option>bbbbb</option>
		<option>ccccc</option>
		<option>ddddd</option>
		<option>eeeee</option>
		
		</select>
		
		
			<table>
		<tr>
			<td>id</td>
			<td><input type="text" /></td>
		</tr>

		<tr>
			<td>pw</td>
			<td><input type="password" /></td>
		</tr>

		<tr>
			<td colspan="2"><input type="button" value="로그인" /></td>>
		</tr>

</body>
</html>