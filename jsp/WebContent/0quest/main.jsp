<%@ page  contentType="text/html; charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${session.getAttribute("memId")==null}">
  <table width=750  align="center" border="1" >
      <tr>
       <td width="500"  height="30">
       &nbsp;
       </td>
   
       <form name="inform" method="post" action="loginPro.do"> 
        <%-- 위 폼은 inform이라는 이름을 갖아서 post로 아이디 비밀번호를 공개하지 않고  loginPro.jsp에게 넘겨 줍니다.  --%>

        <td width="100" align="center">아이디</td>
        <td width="100" >
            <input type="text" name="id" size="15" maxlength="10"></td>
      </tr>
      <tr > 
         <td rowspan="2" width="500" align="center">로그인하세욧!</td>
         <td width="200" align="center">패스워드</td>
         <td width="200" bgcolor=>
            <input type="password" name="pw" size="15" maxlength="10"></td>
       </tr>
       <tr>
          <td colspan="3" align="center">
            <input type="submit" name="Submit" value="로그인"> <%-- 입력된 결과를 submit을 통해 loginPro에게 전달합니다. --%>
            <input type="button"  value="회원가입" onclick="javascript:location.href='q1.do'"/>
            <%-- submit가 이미 로그인버튼에 사용되었기 때문에 onclick을 통해 q1.jsp로 전달을 하게 됩니다. --%>
          </td></form></tr></table></c:if>
    <c:if test="${session.getAttribute("memId")!=null}"> <%-- x = -1인 경우 값을 받게 되면 로그인 상태로 들어오게 됩니다. --%>
       <table width=500 align="center" border="1" >
         <tr>
           <td width="300"  height="20">안녕하세욧!</td>
           <td rowspan="3" align="center">
            "${session.getAttribute("memId")}" 님이 <br>
             방문하셨습니다 <%-- 연결된 아이디로 방문이되었다는 결과값이 나오게 됩니다. --%>
             <form  method="post" action="logout.do">  <%-- logout.jsp로 memId값이 넘어가게 됩니다. --%>
             <input type="submit"  value="로그아웃" >
             <input type="button" value="회원정보변경" onclick="javascript:location.href='modify.do'"/ >
             </form> <%-- 회원정보를 바꾸기 위해 onclick을 통해 modify.jsp 파일로 전달이 되어집니다. --%>
         </td>
        </tr>
       <tr> 
         <td rowspan="2" width="300" >마이페이지입니다</td>
      </tr>
     </table>
     </c:if>
     <br>
 </body>
</html>
