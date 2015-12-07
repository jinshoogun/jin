
<html>
<body bgcolor="yellow" text="red">
	<%-- bgcolor 배경색, 글씨색, 배경사진 경로 --%>
	<!--  HTML 주석 단, 코드에 영향을 미침(실행만 되지 않음) -->
	<%-- JSP 주석 -- 코드에 영향을 안미침 --%>

	Hello JSP...!! so so so
	<br />
	<%-- 줄바꿈 X <br /> 사용 --%>

	Hello JSP...!!
	<br /> so so so

	<H1>H1 제목글자</H1>
	<H2>H2 제목글자</H2>
	<H3>H3 제목글자</H3>
	<H4>H4 제목글자</H4>
	<H5>H5 제목글자</H5>
	<H6>H6 제목글자</H6>

	<font size="6" , color="red"> Object140 <br /> <b>H </b> ello<%-- 굵은 글씨일때 사용 --%>
		<br /> <I>H </I> ello <%-- 이태리체일때 사용 --%> <br />
		he&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ello <%-- 띄어쓸때  사용 --%> <br />



	</font>

	<center>
		<%-- 가운데 쓰일때 사용 --%>
		<font size="6" color="red"> Object140 <br /> Hello<br />
		</font>

		<%-- 선을 쓰일때 사용 길이(미지정시 ), 크기, 색, 시작범위  (길이는 %로 지정가능)--%>
		<HR width="500" size="3" color="red" align="left">

		<%-- 표사용할때 사용함 <tr> 줄 <td> 칸 , border : 줄무늬--%>
		<table border="1">

			<tr>
				<td>aaa</td>
				<td>bbb</td>
			</tr>
			<tr>
				<td>ccc</td>
				<td>ddd</td>
			</tr>
			<tr>
				<td>eee</td>
				<td>fff</td>
			</tr>

		</table>
		<br />
</body>
</html>