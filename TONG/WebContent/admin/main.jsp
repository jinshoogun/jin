<%@ page  contentType="text/html; charset=euc-kr"%>
<%
if (session.getAttribute("a_id") ==null){%>
<script type = "text/javascript">
alert("������ �������� �α����ؾߵ˴ϴ�!");
window.location = "/TONG/admin/adminLogin.jsp"
</script>
<%} %>
<%try{%> 
       <table width=500 align="center" border="1" >
         <tr>
           <td width="300"  height="20">�ȳ��ϼ���!</td>
           <td align="center">
             <%=session.getAttribute("a_id")%>���� <br> 
             �湮�ϼ̽��ϴ� <br/></td>
             </tr>
             <tr>
             <td width="300" >������ �������Դϴ�</td>
             <td align="center">
             <form  method="post" action="logout.jsp">
             <input type="submit"  value="�α׾ƿ�" ><br>
             <br/><input type="button" value="�����̳� ���� ����"  onclick="javascript:window.location='userModify.jsp'" ><br>
             <br/><input type="button" value="�����̳� ����"  onclick="javascript:window.location='boardInfo.jsp'" ><br>
             <%if (((String)session.getAttribute("a_id")).equals("SuperAdmin")){%>
              <br/><input type="button" value="������ �߰�, ����, ����" onclick="javascript:window.location='adminModify.jsp'" ><br>
              <br/><input type="button" value="ȸ������ ���� �� Ż��"  onclick="javascript:window.location='userModify.jsp'" ><br>
            	 
             <%} else { %>

             </form> 
         </td>
        </tr>
       <tr> 
         >
         <td></td>
       </tr>
     </table>
     <br>
 <%}
 }catch(NullPointerException e){}
 %>
 </body>
</html>
