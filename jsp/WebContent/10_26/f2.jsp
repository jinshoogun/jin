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
		
		<%-- üũ�ڽ��� ���鶧 ��� --%>>
		<input type = "text" />                 <br />
		<input type = "password" />             <br />
		<input type = "button" value = "��ư" /> <br />
		<input type = "checkbox" />             <br />
		<input type = "radio" name = "a" />     <br />
		<input type = "radio" name = "a" />     <br />
		<input type = "file" />                 <br />
	
		<textarea rows = "10", cols="50"></textarea> <%-- �۾��� ĭ ���鶧 ��� ��, ĭ --%>>	
		<br />
		
		<select>
		<option>aaaaa</option> <%-- �ɼ��� �����Ҷ� ��� --%>>	
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
			<td colspan="2"><input type="button" value="�α���" /></td>>
		</tr>

</body>
</html>