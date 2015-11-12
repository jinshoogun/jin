<%@ page language="java" contentType="text/html; charset=euc-kr"%>


<html>
<head><title>로그인</title>


   <script language="javascript">
    
       function begin(){
         document.myform.m_id.focus();
       }
       function test(){
         if(!document.myform.m_id.value){
           alert("아이디를 입력하지 않으셨습니다.");
           document.myform.m_id.focus();
           return false;
         }
         if(!document.myform.m_password.value){
           alert("비밀번호를 입력하지 않으셨습니다.");
           document.myform.m_password.focus();
           return false;
         }
        
         
       }
   
   </script>
</head>

<BODY onload="begin()" bgcolor="white">
<form name="userinput" action="LoginPro.jsp" method="post" onSubmit="return test()">


<TABLE >
  
  <TR >
    <TD colspan="2" align="middle" ></TD></TR>
    <TR height="50">
  
  <TR height="50">
    <TD width="200" bgcolor="white" align=center>아이디</TD>
    <TD width="300" bgcolor="white" align=center>
       <INPUT type="text" name="m_id" size="15" maxlength="12"></TD></TR>
  <TR height="50">
    <TD width="200" bgcolor="white" align=center>비밀번호</TD>
    <TD width="300" bgcolor="white" align=center>
      <INPUT type=password name="m_password"  size="15" maxlength="12"></TD></TR>
  <TR height="1">
   <TD colspan="2" >
      <INPUT type=submit value="로그인"> 
   <INPUT type=reset value="다시입력">
     <input type="button" value="회원가입" onclick="javascript:window.location='InputForm.jsp'"></TD></TR>
     
     
</TABLE>
	
</form>

</BODY>
</HTML>
