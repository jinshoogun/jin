<%@ page  contentType="text/html; charset=euc-kr"%>
<%try{%> 
       <table width=500 align="center" border="1" >
         <tr>
           <td width="300"  height="20">�ȳ��ϼ���!</td>

           <td align="center">
             <%=session.getAttribute("a_Id")%>���� <br> 
             �湮�ϼ̽��ϴ� <br/></td>
             </tr>
             <tr>
             <td width="300" >������ �������Դϴ�</td>
             <td align="center">
             <form  method="post" action="logout.jsp">
             <input type="submit"  value="�α׾ƿ�" ><br>
             <br/><input type="button" value="ȸ����������"  onclick="javascript:window.location='UserModify.jsp'" ><br>
             <br/><input type="button" value="�Խñ� ����"  onclick="javascript:window.location='BoardInfo.jsp'" ><br>
             <%if (((String)session.getAttribute("a_Id")).equals("SuperAdmin")){%>
              <br/><input type="button" value="������ �߰�, ����, ����" onclick="javascript:window.location='AdminModify.jsp'" ><br>
              <br/><input type="button" value="ȸ�� ���� Ż��"  onclick="javascript:window.location='UserKill.jsp'" ><br>
            	 
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
