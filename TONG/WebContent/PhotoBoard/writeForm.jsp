<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "PhotoBoard.DAO" %>
<%@ page import = "PhotoBoard.DTO" %>
        <%@ include file="../test2/mainform5.jsp"%>
<html>
<head>
<title>�ı� �Խ��� �Դϴ�!</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>
</head>
</script>
<% 

  int p_num=0,p_ref=1,p_re_step=0,p_re_level=0;
  try{  
    if(request.getParameter("p_num")!=null){
	p_num=Integer.parseInt(request.getParameter("p_num"));
	p_ref=Integer.parseInt(request.getParameter("p_ref"));
	p_re_step=Integer.parseInt(request.getParameter("p_re_step"));
	p_re_level=Integer.parseInt(request.getParameter("p_re_level"));
	}
    // ������ ����ID ����
    String id = (String)session.getAttribute("m_id");

%>

<body>  
<center><b>�۾���</b>
<br>

<form method="post" name="writeform" action="writePro.jsp" onsubmit="return writeSave()">
<input type="hidden" name="p_num" value="<%=p_num%>">
<input type="hidden" name="p_ref" value="<%=p_ref%>">
<input type="hidden" name="p_re_step" value="<%=p_re_step%>">
<input type="hidden" name="p_re_level" value="<%=p_re_level%>">

<table width="600" border="1" cellspacing="0" cellpadding="0" align="center">
    <td align="right" colspan="2">
	    <a href="list.jsp"> �۸��</a> 
   </td>
   </tr>
   <tr>
    <td  width="70" align="center">�ۼ���</td>
    <td  width="330">
    <%=id%>
       <input type="hidden" name="p_writer" value="<%=id%>"></td>
  </tr>
  <tr>
    <td  width="70" align="center" >�� ��</td>
    <td  width="330">
    <%if(request.getParameter("num")==null){%> <%--�ΰ� �����ʾƼ� �亯�̳��� --%>
       <input type="text" size="63" maxlength="63" name="p_subject"></td>
	<%}else{%>
	   <input type="text" size="63" maxlength="63" name="p_subject" value="[�亯]">
	<%}%>
  </tr>
  <tr>
    <td  width="70"align="center" >�� ��</td>
    <td  width="330" >
     <textarea name="p_content" rows="26" cols="70"></textarea> </td></br>
     </tr>
     <tr>
     
     </tr>
     <tr>
    <td  width="70"  align="center" >��й�ȣ</td>
    <td  wid
    th="330" >
     <input type="password" size="8" maxlength="12" name="p_password"> 
	 </td>
  </tr>
<tr>      
 <td colspan=2 align="center"> 
  <input type="submit" value="�۾���" >  
  <input type="reset" value="�ٽ��ۼ�">
  <input type="button" value="��Ϻ���" OnClick="window.location='list.jsp'">
</td></tr></table>    
 <%
  }catch(Exception e){}
%>     

</form>      
</body>
</html>      
