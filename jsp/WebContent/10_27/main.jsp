<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<form action="test.jsp" method="post">
	num1 : <input type="text" name="num1" /> <br /> num2 : <input
		type="text" name="num2" /> <br /> <input type="submit" value="전송" />
</form>



<form action="test.jsp" method="post">
	선택 <input type="radio" name="a" value="x" /> <br /> <input
		type="radio" name="a" value="y" /> <br /> <select name="sel">
		<option>aaa</option>
		<option>bbb</option>
		<option>ccc</option>

	</select> <br />
	<textarea rows="5" cols="20" name="context"></textarea>

	<input type="submit" value="전송" />
</form>






