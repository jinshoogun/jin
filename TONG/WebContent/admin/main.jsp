<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
    <%@ include file="../test2/mainform7.jsp" %>
<%
if (session.getAttribute("a_id") ==null){%>
<script type = "text/javascript">
alert("������ �������� �α����ؾߵ˴ϴ�!");
window.location = "/TONG/admin/adminLogin.jsp"
</script>
<%} %>
<%try{%> 
       <table width=500 height="250" align="center" border="1">
         <tr>
           <td width="300" height="20">�ȳ��ϼ���!</td>
           <td align="center">
             <%=session.getAttribute("a_id")%>���� <br> 
             �湮�ϼ̽��ϴ� <br/></td>
             </tr>
             <tr>
             <td width="600" >������ �������Դϴ�</td>
             <td align="center">
             <form  method="post" action="adminLoginout.jsp">
             <input type="button" value="���ΰ���"  onclick="javascript:window.location='../test2/mainform7.jsp'" ><br></br>
             <input type="button" value="��ǰ���"  onclick="javascript:window.location='../Product/ProductForm.jsp'" ><br></br>
             <input type="submit"  value="�α׾ƿ�" ><br>
             <br/><input type="button" value="�����̳� ���� ���� �� Ż��"  onclick="javascript:window.location='designerModify.jsp'" ><br>
             <%if (((String)session.getAttribute("a_id")).equals("SuperAdmin")){%>
              <br/><input type="button" value="������ �߰�, ����, ����" onclick="javascript:window.location='adminModify.jsp'" ><br>
              <br/><input type="button" value="ȸ������ ���� �� Ż��"  onclick="javascript:window.location='userModify.jsp'" ><br>
            	 <BR><input type="button" value="���� ���� Ȯ��"  onclick="javascript:window.location='../reserve/AdminReserveList.jsp'" ><br>
             <%} else { %>

             </form> 
         </td>
        </tr>
       <tr> 
         <td></td>
       </tr>
     </table>
     <br>
 <%}
 }catch(NullPointerException e){}
 %>
 </body>
</html>
