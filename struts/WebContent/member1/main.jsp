<%@ page  contentType="text/html; charset=euc-kr"%>
<%@ include file="/view/color.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head><title>메인입니다..</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<c:if test="${memId == null}">
<!-- test는 조건물의 속성 -->
<script language="javascript" src = "script.js"></script>
</head>
<body onLoad="focusIt();" bgcolor="<%=bodyback_c%>">
  <table width=500 cellpadding="0" cellspacing="0"  align="center" border="1" >
      <tr>
       <td width="300" bgcolor="<%=bodyback_c%>" height="20">
       &nbsp;
       </td>
   
       <form name="inform" method="post" action="LoginPro.action"  onSubmit="return checkIt();">

        <td bgcolor="<%=title_c%>"  width="100" align="right">아이디</td>
        <td width="100" bgcolor="<%=value_c%>">
            <input type="text" name="id" size="15" maxlength="10"></td>
      </tr>
      <tr > 
         <td rowspan="2" bgcolor="<%=bodyback_c%>" width="300" >메인입니다.</td>
         <td bgcolor="<%=title_c%>"  width="100" align="right">패스워드</td>
         <td width="100" bgcolor="<%=value_c%>">
            <input type="password" name="passwd" size="15" maxlength="10"></td>
       </tr>
       <tr>
          <td colspan="3" bgcolor="<%=title_c%>"   align="center">
            <input type="submit" name="submit" value="로그인">
          </td></form></tr></table></c:if>
<c:if test="${memId != null}">
       <table width=500 cellpadding="0" cellspacing="0"  align="center" border="1" >
         <tr>
           <td width="300" bgcolor="<%=bodyback_c%>" height="20">하하하</td>
           <td rowspan="3" bgcolor="<%=value_c%>" align="center">
             ${sessionScope.memId}님이 <br>
             방문하셨습니다
             <form  method="post" action="LoginOut.action">  
             <input type="submit"  value="로그아웃">
             </form>
         </td>
        </tr>
       <tr > 
         <td rowspan="2" bgcolor="<%=bodyback_c%>" width="300" >메인입니다.</td>
      </tr>
     </table>
     </c:if>
     <br>
 </body>
</html>
