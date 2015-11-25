<%@ page  contentType="text/html; charset=euc-kr"%>
<%
if (session.getAttribute("a_id") ==null){%>
<script type = "text/javascript">
alert("관리자 계정으로 로그인해야됩니다!");
window.location = "/TONG/admin/adminLogin.jsp"
</script>
<%} %>
<%try{%> 
       <table width=500 align="center" border="1" >
         <tr>
           <td width="300"  height="20">안녕하세욧!</td>
           <td align="center">
             <%=session.getAttribute("a_id")%>님이 <br> 
             방문하셨습니다 <br/></td>
             </tr>
             <tr>
             <td width="300" >관리자 페이지입니다</td>
             <td align="center">
             <form  method="post" action="logout.jsp">
             <input type="submit"  value="로그아웃" ><br>
             <br/><input type="button" value="디자이너 정보 수정"  onclick="javascript:window.location='userModify.jsp'" ><br>
             <br/><input type="button" value="디자이너 삭제"  onclick="javascript:window.location='boardInfo.jsp'" ><br>
             <%if (((String)session.getAttribute("a_id")).equals("SuperAdmin")){%>
              <br/><input type="button" value="관리자 추가, 삭제, 변경" onclick="javascript:window.location='adminModify.jsp'" ><br>
              <br/><input type="button" value="회원정보 수정 및 탈퇴"  onclick="javascript:window.location='userModify.jsp'" ><br>
            	 
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
