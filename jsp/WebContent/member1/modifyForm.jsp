<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "ch11.logon.*" %>
<%@ include file="/view/color.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<title>ȸ����������</title>
<link href="style.css" rel="stylesheet" type="text/css">


<body bgcolor="<%=bodyback_c%>">
<form method="post" action="modifyPro.do" name="userinput" onsubmit="return checkIt()">

  <table width="600" border="1" cellspacing="0" cellpadding="3"  align="center">
    <tr > 
      <td  colspan="2" height="39" bgcolor="<%=title_c%>" align="center">
	     <font size="+1" ><b>ȸ�� ��������</b></font></td>
    </tr>
    <tr>
      <td colspan="2" class="normal" align="center">ȸ���� ������ �����մϴ�.</td>
    </tr>
     <tr> 
      <td width="200" bgcolor="<%=value_c%>"><b>���̵� �Է�</b></td>
      <td width="400" bgcolor="<%=value_c%>">&nbsp;</td>
    <tr>  

    <tr> 
      <td  width="200"> ����� ID</td>
      <td  width="400"> <input type ="hidden" name = "id" value = "${id}" />
      <c:out value  = "${id}" /></td>
    </tr>
    
     <tr> 
      <td width="200"> ��й�ȣ</td>
      <td width="400"> 
        <input type="password" name="passwd" size="10" maxlength="10" value="${passwd}" >
      </td>
    <tr>  
    <tr> 
      <td  width="200" bgcolor="<%=value_c%>"><b>�������� �Է�</b></td>
      <td width="400" bgcolor="<%=value_c%>">&nbsp;</td>
    <tr>  
    <tr> 
      <td   width="200">����� �̸�</td>
      <td  width="400"> 
        <input type="text" name="name" size="15" maxlength="20" value="${name}" >
      </td>
    </tr>
    <tr> 
      <td width="200">�ֹε�Ϲ�ȣ</td>
      <td width="400"> 
        <c:out value  = "${Jumin1}" />- <c:out value  = "${Jumin2}" />
      </td>
    </tr>
   <tr> 
      <td width="200">E-Mail</td>
      <td width="400">
      <c:if test= "${Email==null}">
		  <input type="text" name="email" size="40" maxlength="30" >
		  </c:if>
		<c:if test = "${Email!=null}">
          <input type="text" name="email" size="40" maxlength="30" value="${Email}">
           </c:if>
      </td>
    </tr>
   
    <tr> 
      <td width="200">Blog</td>
      <td width="400"> 
	    <c:if test= "${blog==null}">
		  <input type="text" name="blog" size="60" maxlength="50" >
		</c:if>
		 <c:if test= "${blog!=null}">
          <input type="text" name="blog" size="60" maxlength="50" value="${blog}">
		</c:if>
      </td>
    </tr>      
    <tr> 
      <td colspan="2" align="center" bgcolor="<%=value_c%>"> 
       <input type="submit" name="modify" value="��   ��" >
       <input type="button" value="��  ��" onclick="javascript:window.location='main.do'">      
      </td>
    </tr>
  </table>
</form>
</body>
</html>