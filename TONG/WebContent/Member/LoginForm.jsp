<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>


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
<img  src="C:\Users\�ҿ�\Desktop\JAVA\TONG\WebContent\Image\Tong1.jpg" width="150"
		height="100">
<BODY onload="begin()" bgcolor="white">
<form name="userinput" action="LoginPro.jsp" method="post" onSubmit="return test()">


<TABLE  width=500 cellpadding="10" cellspacing="0" align="center"  border="2" bgcolor="pink"  >
 
  
  <TR height="50" >
    <TD width="200" bgcolor="silver" align=center>���̵�</TD>
    <TD width="300" bgcolor="white" align=center>
       <INPUT type="text" name="m_id" size="15" maxlength="12"></TD></TR>
  <TR height="50">
    <TD width="200" bgcolor="silver" align=center>��й�ȣ</TD>
    <TD width="300" bgcolor="white" align=center>
      <INPUT type=password name="m_password"  size="15" maxlength="12"></TD></TR>
  <TR height="1">
   <TD colspan="2" align="center" >
      <INPUT type=submit value="�α���"> 
   <INPUT type=reset value="�ٽ��Է�">
     <input type="button" value="ȸ������" onclick="javascript:window.location='AllinputForm.jsp'"></TD></TR>
     
     
</TABLE>
	
</form>

</BODY>
</HTML>
