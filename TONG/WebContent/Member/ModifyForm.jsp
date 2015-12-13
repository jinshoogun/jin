<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>

<%@ page import="DATADB.bean.DAO"%>
<%@ page import="DATADB.bean.DTO"%>


<html>
<head>
<title>회원정보수정</title>
<link href="style.css" rel="stylesheet" type="text/css">
<img  src="C:\Users\소영\Desktop\JAVA\TONG\WebContent\Image\Tong1.jpg" width="150"
		height="100">

<% String id= (String)session.getAttribute("m_id");

 DAO membership = DAO.getInstance();
 DTO d= membership.getMembership(id);  /// getMember 함수
 
 try{
 %>

<body bgcolor="white">
	<form method="post" action="ModifyPro.jsp" name="insert"
		onsubmit="return checkIt()">
		<table width="600" border="1" cellspacing="0" align="center">
			<tr>
				<td colspan="2" height="39" bgcolor="white" align="center"><font
					size="+1"><b>회원정보수정</b></font></td>

			</tr>
			<tr>
				<td colspan="2" class="normal" align="center">회원정보를수정합니다.</td>
			</tr>
			<tr>
				<td width="200" bgcolor="white"><b>아이디입력</b></td>
				<td width="400" bgcolor="white">&nbsp;</td>
			</tr>

			<tr>
				<td width="200">사용자이름</td>
				<td width="400"><%=d.getM_name() %></td>    <%//get메서드를 이용하여, 아이디에 해당하는 정보를 가져옴 %>
			</tr>
			
			<tr>
			<td width="200">비밀번호</td>
			<td width="400">
			<input type="password" name="m_password" size="10" maxlength="10" value="<%=d.getM_password()%>">
			</td>
			</tr>
			                      <%// value="<%d.getPw()"  
			                        // 가져온 값들을 변경하려면 text파일을 만들고 value 값을 주면됨!!
			                        // value에 get 함수를 입력해 놓으면 됨
			                      
			                      %>
			<tr>
			<td width="200">E-MAIL</td>
			<td width="400">
			
			<%if(d.getM_email()==null){ %>
			<input type="text" name="m_email" size="40" maxlength="30" >
			 <%}else{ %>
			 <input type="text" name="m_email" size="40" maxlength="30" value="<%=d.getM_email() %>">
			 <%} %>
			 </td>
			 </tr>
			 
			 <tr>
			 <td colspan="2" align="center" bgcolor="white">
			 <input type="submit" name="modify" value="수정">
			 <input type="button" value="취소" onclick="javascript:window.location='main.jsp'">
			 </td>
			 </tr>
			 </table>
			 </form>
			 </body>
			 <%}catch(Exception e){} %>
			 </html>
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			