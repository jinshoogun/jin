<%@ page contentType="text/html; charset=euc-kr" %>
<%@ include file="/view/color.jsp"%>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>
</head>
<%
if (session.getAttribute("memId") ==null){%>
<script type = "text/javascript">
alert("�α��� �� �۾��� ����");
window.location = "/jsp/member/main.jsp"
</script>
<%} %>

<% 
  int num=0,ref=1,re_step=0,re_level=0;
  try{  						//   16 16 0 0 
    if(request.getParameter("num")!=null){
    	//num�� null�� ���� �ƴϸ� ��۵�
		num=Integer.parseInt(request.getParameter("num"));
		ref=Integer.parseInt(request.getParameter("ref"));
		re_step=Integer.parseInt(request.getParameter("re_step"));
		re_level=Integer.parseInt(request.getParameter("re_level"));
	}
  String id = (String)session.getAttribute("memId");
  //getAttribute�� ���ϰ��� object�� �ޱ� ������ (String)���� �� ������ȯ

%>
   
<body bgcolor="<%=bodyback_c%>">  
<center><b>�۾���</b>
<br>
<form method="post" name="writeform" action="writePro.jsp" onsubmit="return writeSave()">
<input type="hidden" name="num" value="<%=num%>">
<%-- hidden�� �ܼ��� ȭ�� ������� �ʰ� ���� �ѱ�� ������ ����Ѵ�. --%>
<input type="hidden" name="ref" value="<%=ref%>">
<input type="hidden" name="re_step" value="<%=re_step%>">
<input type="hidden" name="re_level" value="<%=re_level%>">

<table width="400" border="1" cellspacing="0" cellpadding="0"  bgcolor="<%=bodyback_c%>" align="center">
   <tr>
    <td align="right" colspan="2" bgcolor="<%=value_c%>">
	    <a href="list.jsp"> �۸��</a> 
   </td>
   </tr>
   <tr>
   
    <td  width="70"  bgcolor="<%=value_c%>" align="center">�� ��</td>
    <td  width="330">
    <%=id %>
       <input type="hidden"  name="writer" value = "<%=id %>"></td>
  </tr>
  <tr>
    <td  width="70"  bgcolor="<%=value_c%>" align="center" >�� ��</td>
    <td  width="330">
    <%if(request.getParameter("num")==null){%>
       <input type="text" size="40" maxlength="50" name="subject"></td>
	<%}else{%>
	   <input type="text" size="40" maxlength="50" name="subject" value="[�亯]">
	<%}%>
  </tr>
  <tr>
    <td  width="70"  bgcolor="<%=value_c%>" align="center">Email</td>
    <td  width="330">
       <input type="text" size="40" maxlength="30" name="email" ></td>
  </tr>
  <tr>
    <td  width="70"  bgcolor="<%=value_c%>" align="center" >�� ��</td>
    <td  width="330" >
     <textarea name="content" rows="13" cols="40"></textarea> </td>
  </tr>
  <tr>
    <td  width="70"  bgcolor="<%=value_c%>" align="center" >��й�ȣ</td>
    <td  width="330" >
     <input type="password" size="8" maxlength="12" name="passwd"> 
	 </td>
  </tr>
<tr>      
 <td colspan=2 bgcolor="<%=value_c%>" align="center"> 
  <input type="submit" value="�۾���" >  
  <input type="reset" value="�ٽ��ۼ�">
  <input type="button" value="��Ϻ���" OnClick="window.location='list.jsp'">
</td>
</tr>
</table>  
 <%
  }catch(Exception e){
	  
  }
  
%>     
</form>      
</body>
</html>      
