<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
    <%@ include file="../test2/mainform5.jsp"%>
    <%
request.setCharacterEncoding("EUC-KR"); %>
<html>
<head>
<title>�Խ���</title>
<script language="JavaScript"></script>
</head>
<% 
  int o_num=0,o_ref=1,o_re_step=0,o_re_level=0;
  try{                    //   16 16 0 0 
    if(request.getParameter("O_num")!=null){
       //num�� null�� ���� �ƴϸ� ��۵�
      o_num=Integer.parseInt(request.getParameter("O_num"));
      o_ref=Integer.parseInt(request.getParameter("O_ref"));
      o_re_step=Integer.parseInt(request.getParameter("O_re_step"));
      o_re_level=Integer.parseInt(request.getParameter("O_re_level"));
      
   }
  String id = (String)session.getAttribute("m_id");
  //getAttribute�� ���ϰ��� object�� �ޱ� ������ (String)���� �� ������ȯ

%>
   
<body>  
<center><b>�۾���</b>
<br>
<form method="post" name="writeform" action="writePro.jsp">
<input type="hidden" name="o_num" value="<%=o_num%>">
<%-- hidden�� �ܼ��� ȭ�� ������� �ʰ� ���� �ѱ�� ������ ����Ѵ�. --%>
<input type="hidden" name="o_ref" value="<%=o_ref%>">
<input type="hidden" name="o_re_step" value="<%=o_re_step%>">
<input type="hidden" name="o_re_level" value="<%=o_re_level%>">

<table width="400" border="1" cellspacing="0" cellpadding="0"  align="center">
   <tr>
    <td align="right" colspan="2">
       <a href="list.jsp"> �۸��</a> 
   </td>
   </tr>
   <tr>
   
    <td  width="70"  align="center">�� ��</td>
    <td  width="330">
       <input type="hidden" name="o_writer" value="<%=id%>"><%=id%></td>
  </tr>
  <tr>
    <td  width="70"  align="center" >�� ��</td>
    <td  width="330">
    <%if(request.getParameter("o_num")==null){%>
       <input type="text" size="40" maxlength="50" name="o_subject" ></td>
   <%}else{%>
      <input type="text" size="40" maxlength="50" name="o_subject" value="[�亯]">
   <%}%>
  </tr>
  <tr>
    <td  width="70"  align="center" >�� ��</td>
    <td  width="330" >
     <textarea name="o_content" rows="13" cols="40"></textarea> </td>
  </tr>
  <tr>
    <td  width="70"  align="center" >��й�ȣ</td>
    <td  width="330" >
     <input type="password" size="8" maxlength="12" name="o_password2"> 
    </td>
  </tr>
<tr>      
 <td colspan=2  align="center"> 
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