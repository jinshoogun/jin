<%@ page language="java" contentType="text/html; charset=euc-kr"%>


<html>
<head><title>�α���</title>


   <script language="javascript">
    
       function begin(){
         document.myform.m_id.focus();
       }
       function test(){
         if(!document.myform.m_id.value){
           alert("���̵� �Է����� �����̽��ϴ�.");
           document.myform.m_id.focus();
           return false;
         }
         if(!document.myform.m_password.value){
           alert("��й�ȣ�� �Է����� �����̽��ϴ�.");
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
    <TD width="200" bgcolor="white" align=center>���̵�</TD>
    <TD width="300" bgcolor="white" align=center>
       <INPUT type="text" name="m_id" size="15" maxlength="12"></TD></TR>
  <TR height="50">
    <TD width="200" bgcolor="white" align=center>��й�ȣ</TD>
    <TD width="300" bgcolor="white" align=center>
      <INPUT type=password name="m_password"  size="15" maxlength="12"></TD></TR>
  <TR height="1">
   <TD colspan="2" >
      <INPUT type=submit value="�α���"> 
   <INPUT type=reset value="�ٽ��Է�">
     <input type="button" value="ȸ������" onclick="javascript:window.location='InputForm.jsp'"></TD></TR>
     
     
</TABLE>
	
</form>

</BODY>
</HTML>
