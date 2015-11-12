<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="DATADB.bean.DAO" %>
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<link rel="stylesheet" href="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.css" />
<script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
<script src="http://code.jquery.com/mobile/1.2.0/jquery.mobile-1.2.0.min.js"></script>
<!DOCTYPE html>


<html>
<head>
<title>회원가입</title>
<script language="javaScript">


function openConfirmId(userinput) {
	if(userinput.m_id.value == "") {
		alert("아이디를 입력하세요");
		return;
	}
	url ="ConfirmId.jsp?m_id=" + userinput.m_id.value;
	open(url,"confirm, toolbar=no,location=no,status=no,menubar=no,scrollbars=no,width=300,height=180");
	}

</script>




<body>
<form method="post" action="InputPro.jsp" name="userinput" >
<div data-theme="c" data-role="page"> 
<div data-role="header"> 
<h1>회원가입</h1>
</div> 
<center><div data-role="content"> 

  <table width=60%  >
  <tr>
   <td align="center" width=100>아이디</td>
   <td colspan=1>
   <input type="text" name="m_id"  /></td>
   <td>
   <input name="checkin_id" type="button" value="중복확인" onClick="openConfirmId(this.form)">
  </td>
</tr>
  
  <tr>
   <td align="center">암호</td>
   <td colspan=3>
    <input type="password" name="m_password" />
   </td>
  </tr>


  <tr> 
   <td align="center" >암호확인</td>
   <td colspan=3>
    <input type="password" name="m_password"  />
   </td>
  </tr>
  
  <tr>
   <td align="center" >이름</td>
   <td colspan=3>
    <input type="text" name="m_name" />
   </td>
  </tr>


  <tr>
   <td align="center" >이메일</td> 
   <td colspan=3>
    <input type="text" name="m_email"  >
 </td>
 </tr>
  
  <tr>
   <td align="center" >성별</td>
  <td colspan='3'>
   <fieldset data-role="controlgroup">
    <input type="radio" name="m_sex" id="radio-choice-1" value="choice-1" checked="checked" />
    <label for="radio-choice-1">man</label>
  
    <input type="radio" name="m_sex" id="radio-choice-2" value="choice-2" />
    <label for="radio-choice-2">woman</label>
   </fieldset>
  </td>
  </tr>
  
  <tr>
  <td align="center">생년월일</td>
  <td>
  <select name="m_birth">
  <% for(int i=1900; i<=2015; i++){ %>
  <option value="<%=i%>"><%=i%></option>
  <%}%>
  </select>
  </td>
  
  <td>
  <select name="m_birth">
  <% for(int i=01; i<=12; i++){ %>
  <option value="<%=i%>"><%=i%></option>
  <%}%>
  </select>
  </td>
  
  <td>
  <select name="m_birth">
  <% for(int i=1; i<=31; i++){ %>
  <option value="<%=i%>"><%=i%>
  <%}%>
  </option>
  </select>
  </td>


  <tr>
  <td align="center">핸드폰</td>
  <td >
    <select name ="m_phone">
    <option value="010">010</option>
   
    </select>
  </td>
  <td>
    <input type="text" name="m_phone" size="4"> 
  </td>
   <td>
    <input type="text" name="m_phone" size="4">
   </td>
  </tr>

  <tr>
   <td colspan="4">
   <div align="center">
   <input name="confirm" type="submit" value="회원가입" onclick="javascript:window.location='main.jsp'" ></div>
 
  </td>
  </tr> 
</center>
</table>
</form>


</body>
 
</head>
</html>
    