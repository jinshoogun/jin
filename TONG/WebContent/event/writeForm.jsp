<%@ page contentType="text/html; charset=euc-kr" pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>

<%if(session.getAttribute("a_id") == null) {%>
     <script type="text/javascript">
          alert("�α����� �۾��� ����");
          window.location="/TONG/Member/main.jsp";
     </script>
<%}%>
</head>

<% 
  int e_num=0,e_ref=1,e_re_step=0,e_re_level=0;
  try{  
    if(request.getParameter("e_num")!=null){
	e_num=Integer.parseInt(request.getParameter("e_num"));
	e_ref=Integer.parseInt(request.getParameter("e_ref"));
	e_re_step=Integer.parseInt(request.getParameter("e_re_step"));
	e_re_level=Integer.parseInt(request.getParameter("e_re_level"));
	}
    String id = (String)session.getAttribute("a_id");
%>
   
<body  >  
<center><b>�۾���</b>
<br>
<form method="post" name="writeform" action="writePro.jsp" onsubmit="return writeSave()">
<input type="hidden" name="e_num" value="<%=e_num%>">
<input type="hidden" name="e_ref" value="<%=e_ref%>">
<input type="hidden" name="e_re_step" value="<%=e_re_step%>">
<input type="hidden" name="e_re_level" value="<%=e_re_level%>">

<table width="400" border="1" cellspacing="0" cellpadding="0"    align="center">
   <tr>
    <td align="right" colspan="2"  >
	    <a href="event.jsp"> �۸��</a> 
   </td>
   </tr>
   <tr>
    <td  width="70"    align="center">�� ��</td>
    <td  width="330">
    
       <input type="text" name="e_writer" value="<%=id%>"></td>
  </tr>
  <tr>
    <td  width="70"    align="center" >�� ��</td>
    <td  width="330">
    <%if(request.getParameter("e_num")==null){%>
       <input type="text" size="40" maxlength="50" name="e_subject"></td>
	<%}else{%>
	   <input type="text" size="40" maxlength="50" name="e_subject" value="[�亯]"></td>
	<%}%>
  </tr>
  <tr>
    <td  width="70"    align="center" >�� ��</td>
    <td  width="330" >
     <textarea name="e_content" rows="13" cols="40"></textarea> </td>
  </tr>
  <tr>
    <td  width="70"    align="center" >��й�ȣ</td>
    <td  width="330" >
     <input type="password" size="8" maxlength="12" name="e_password"> 
	 </td>
  </tr>
<tr>      
 <td colspan=2   align="center"> 
  <input type="submit" value="�۾���" >  
  <input type="reset" value="�ٽ��ۼ�">
 
</td></tr></table>    
 <%
  }catch(Exception e){}
%>     
</form>      
</body>
</html>      
