<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "ADMIN.DATADB.bean.DAO" %>
<%@ page import = "ADMIN.DATADB.bean.DTO" %>
<%@ page import = "java.util.List" %>

    <%     int count = 0;
    List adminlist = null;%>
    <center><b>������ �����Դϴ�. (��ü ��:<%=count%>)</b>
        <%if (count == 0) {
%>
<table width="600" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td align="center">
    ������ ������ �����ϴ�.
    </td>
</table>

<%  } else {    %>
<table border="1" width="600" cellpadding="0" cellspacing="0"> 
    <tr height="30"> 
      <td align="center" width="150"  >I D</td> 
      <td align="center" width="150" >�� ��</td> 
      <td align="center" width="150"  >�� ��</td> 
      <td align="center" width="150" >�� ��</td> 
      </tr>
    <tr height="30">
      <% for (int i = 0 ; i < adminlist.size() ; i++) {
          DTO admin = (DTO)adminlist.get(i);%>
    <td align="center"  width="100"><%=admin.getA_id()%></td>
    <td align="center"  width="150"><%=admin.getA_name()%></td>
  </tr>
  
  <% }
  }
  
  %>