<%@ page contentType="text/html; charset=euc-kr" %>
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
  int n_num=0,n_ref=1,n_re_step=0,n_re_level=0;
  try{  
    if(request.getParameter("n_num")!=null){
	n_num=Integer.parseInt(request.getParameter("n_num"));
	n_ref=Integer.parseInt(request.getParameter("n_ref"));
	n_re_step=Integer.parseInt(request.getParameter("n_re_step"));
	n_re_level=Integer.parseInt(request.getParameter("n_re_level"));
	}
    String id = (String)session.getAttribute("a_id");
%>
   
<body  >  
<center><b>�۾���</b>
<br>
<form method="post" name="writeform" action="writePro.jsp" onsubmit="return writeSave()">
<input type="hidden" name="n_num" value="<%=n_num%>">
<input type="hidden" name="n_ref" value="<%=n_ref%>">
<input type="hidden" name="n_re_step" value="<%=n_re_step%>">
<input type="hidden" name="n_re_level" value="<%=n_re_level%>">

<table width="400" border="1" cellspacing="0" cellpadding="0" align="center">
   <tr>
    <td align="right" colspan="2"  >
	    <a href="notice.jsp"> �۸��</a> 
   </td>
   </tr>
   <tr>
    <td  width="70"    align="center">�� ��</td>
    <td  width="330">
    
       <input type="text" name="n_writer" value="<%=id%>"></td>
  </tr>
  <tr>
    <td  width="70"    align="center" >�� ��</td>
    <td  width="330">
    <%if(request.getParameter("n_num")==null){%>
       <input type="text" size="40" maxlength="50" name="n_subject"></td>
	<%}else{%>
	   <input type="text" size="40" maxlength="50" name="n_subject" value="[�亯]"></td>
	<%}%>
  </tr>
  <tr>
    <td  width="70"    align="center" >�� ��</td>
    <td  width="330" >
     <textarea name="n_content" rows="13" cols="40"></textarea> </td>
  </tr>
  <tr>
    <td  width="70"    align="center" >��й�ȣ</td>
    <td  width="330" >
     <input type="password" size="8" maxlength="12" name="n_password"> 
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
