<%@ page contentType="text/html; charset=euc-kr"%>
<%@ include file="/view/color.jsp"%>
<html>
<head>
<title>ȸ������</title>

<body bgcolor="<%=bodyback_c%>">

<form method="post" action="inputPro.do" name="userinput">
  <table width="600" border="1" cellspacing="0" cellpadding="3" align="center" >
    <tr> 
    <td colspan="2" height="39" align="center" bgcolor="<%=value_c%>" >
       <font size="+1" ><b>ȸ������</b></font></td>
    </tr>
    <tr> 
      <td width="200" bgcolor="<%=value_c%>"><b>���̵� �Է�</b></td>
      <td width="400" bgcolor="<%=value_c%>">&nbsp;</td>
    </tr>  

    <tr> 
      <td width="200"> ����� ID</td>
      <td width="400"> 
        <input type="text" name="id" size="10" maxlength="12">
      </td>
    </tr>
    <tr> 
      <td width="200"> ��й�ȣ</td>
      <td width="400" > 
        <input type="password" name="passwd" size="15" maxlength="12">
      </td>
    
    <tr> 
      <td width="200" bgcolor="<%=value_c%>"><b>�������� �Է�</b></td>
      <td width="400" bgcolor="<%=value_c%>">&nbsp;</td>
    <tr>  
    <tr> 
      <td width="200">����� �̸�</td>
      <td width="400"> 
        <input type="text" name="name" size="15" maxlength="10">
      </td>
    </tr>
    <tr> 
      <td width="200">�ֹε�Ϲ�ȣ</td>
      <td width="400"> 
        <input type="text" name="jumin1" size="7" maxlength="6">
        -<input type="text" name="jumin2" size="7" maxlength="7">
      </td>
    </tr>
    <tr> 
      <td width="200">E-Mail</td>
      <td width="400"> 
        <input type="text" name="email" size="40" maxlength="30">
      </td>
    </tr>
    <tr> 
      <td width="200"> Blog</td>
      <td width="400"> 
        <input type="text" name="blog" size="60" maxlength="50">
      </td>
    </tr>
    <tr> 
      <td colspan="2" align="center" bgcolor="<%=value_c%>"> 
          <input type="submit" name="confirm" value="��   ��" >
          <input type="reset" name="reset" value="�ٽ��Է�">
          <input type="button" value="���Ծ���" onclick="javascript:window.location='main.do'">
      </td>
    </tr>
  </table>
</form>
</body>
</html>
