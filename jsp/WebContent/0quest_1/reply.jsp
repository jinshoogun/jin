<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

    <%request.setCharacterEncoding("euc-kr"); %>
    <jsp:useBean class = "obj140.bean.DTO" id ="dto" /> 
    <jsp:setProperty name = "dto" property = "id" /> 
    <jsp:setProperty name = "dto" property = "pw" /> 
    <jsp:setProperty name = "dto" property = "add" />
    <jsp:setProperty name = "dto" property = "phfirst" />
    <jsp:setProperty name = "dto" property = "phsec" />
    <jsp:setProperty name = "dto" property = "phthr" /> 
    <jsp:setProperty name = "dto" property = "mailId" />
    <jsp:setProperty name = "dto" property = "domain" />
    <jsp:setProperty name = "dto" property = "domain1" />
    <jsp:setProperty name = "dto" property = "a" /> 
    <jsp:setProperty name = "dto" property = "b" />
    <jsp:setProperty name = "dto" property = "nick" />
    <jsp:setProperty name = "dto" property = "intru" />
    <jsp:setProperty name = "dto" property = "na" />

</head>
<body><center>
	�� ������ ������ �˴ϴ�. 
	<br /></center>
	<br />

	<%request.setCharacterEncoding("euc-kr"); %>
	<table border="1" align ="center">

		<td><center>���̵�</center></td>
		   <td><jsp:getProperty name = "dto" property = "id" /></td>
		</tr>
		<tr>
			<td><center>��й�ȣ</center> </td>
		    <td><jsp:getProperty name = "dto" property = "pw" /></td>
		    </tr>
		<tr>
			<td><center>�̸�</center> </td>
		    <td><jsp:getProperty name = "dto" property = "na" /></td>
		<tr>
			<td><center>����</center> </td>
		    <td><jsp:getProperty name = "dto" property = "a" /></td>
		    
		<tr>
			<td><center>�ּ�</center></td>
			<td><jsp:getProperty name = "dto" property = "add" /></td>
			</tr>
		<tr>
			 <td><center>��ȭ��ȣ</center></td>
			<td><jsp:getProperty name = "dto" property = "phfirst" />-<jsp:getProperty name = "dto" property = "phsec" />-<jsp:getProperty name = "dto" property = "phthr" /></td>
			</tr>
		
		<tr>
			<td><center>�����ּ�</center></td>
			<td><jsp:getProperty name = "dto" property = "mailId" />@<jsp:getProperty name = "dto" property = "domain" /></td>
			</tr>
		<tr>	
			<td><center>�̸��� ���� ����</center></td>
			<td><jsp:getProperty name = "dto" property = "b" /></td>
			</tr>
			
	    <tr>	
			<td><center>�г���</center></td>
			<td><jsp:getProperty name = "dto" property = "nick" /></td>
			</tr>
			
		 <tr>	
			<td><center>�Ұ���</center></td>
			<td>
		<jsp:getProperty name = "dto" property = "intru" /></td>
			</tr>
			</table><center>
</form>
</body>
</html>