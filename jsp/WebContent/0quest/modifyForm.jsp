<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "obj140.bean.*" %>

<html>
<head>


<%
    String id = (String)session.getAttribute("memId");
   
    DAO manager = DAO.getInstance();
    DTO c = manager.getMember(id);
// memid를 통해 계정이 연결되고 계정정보를 수정할 수 있는 공간인 getInstance을 통해 생성을 합니다.
// 이때 getmMember에서 id를 통해 c값에다가 전송을 하게 된다.
	try{
%>

<body>
<form method="post" action="modifyPro.jsp" name="userinput" onsubmit="return checkIt()">
<%-- 본 폼은 modifyPro.jsp에다가 정보를 보낸다. 그리고 userinput으로 동일시하여 변경할 수 있게하며 또한, q1에 있는 checkIt()메소드를 전송을 하기 전에 확인을 하고 검사한 뒤에 전송이 되어진다.--%>
  <table width="600" border="1" cellspacing="0" cellpadding="3"  align="center">
    <tr> 
      <td colspan="2" height="39"  align="center">
	     <font size="+1" ><b>회원 정보수정</b></font></td>
    </tr>
    <tr>
      <td colspan="2" class="normal" align="center">회원의 정보를 수정합니다.</td>
    </tr>
     <tr> 
      <td width="200"><b>아이디 입력</b></td>
      <td width="400">&nbsp;</td>
    <tr>  

    <tr> 
      <td  width="200"> 사용자 ID</td>
      <td  width="400"><%=c.getId()%></td>
    </tr> <%-- DTO에 있는 getId값을 불러들어온다.  --%>
    
     <tr> 
      <td width="200"> 비밀번호</td>
      <td width="400"> 
        <input type="password" name="pw" size="10" minlength="6" value="<%=c.getPw()%>">
      </td> <%-- DTO에 있는 getPw값(비번)을 불러들어온다. 단, input으로 수정이 가능하게 만들어진다.  --%>
    <tr>  
    <tr> 
      <td  width="200"><b>개인정보 입력</b></td>
      <td width="400">&nbsp;</td>
    <tr>  
    <tr> 
      <td   width="200">사용자 이름</td>
      <td  width="400"> 
        <%=c.getNa()%> <%-- DTO에 있는 getNa값(이름)을 불러들어온다. 단, input으로 수정이 가능하게 만들어진다.  --%>
      </td>
    </tr>
        <tr> 
      <td  width="200">성별</td>
      <td  width="400"> 
        <%=c.getA()%> <%-- DTO에 있는 getA값을 불러들어온다.  --%>
      </td>
    </tr>
    <tr> 
      <td width="200">주소</td>
      <td width="400"> 
        <input type="text" name = "add" size ="40" minlength = "10" value="<%=c.getAdd()%>">
      </td> <%-- DTO에 있는 getAdd(주소 )값을 불러들어온다. 단, input으로 수정이 가능하게 만들어진다.--%>
    </tr>
   <tr> 
      <td width="200">E-Mail</td>
      <td width="400">
          <input type="text" name="email" size="40" maxlength="30" value="<%=c.getEmail()%>">	
      </td> <%-- DTO에 있는 getEmail(이메일)값을 불러들어온다. 단, input으로 수정이 가능하게 만들어진다.--%>
      <tr> 
      <td width="200">전화번호</td>
      <td width="400">
          <input type="text" name="phone" size="40" maxlength="30" value="<%=c.getPhone()%>">	
      </td>  <%-- DTO에 있는 getPhone(전화번호)값을 불러들어온다. 단, input으로 수정이 가능하게 만들어진다.--%>
    </tr>
       <tr> 
      <td width="200">이메일 동의 여부</td>
      <td width="400">
       <%=c.getB()%> 상태입니다.
      <input type="radio" name="b" value="동의" />Y <input type="radio" name="b" value="비동의" />N</td>
    </tr> <%-- DTO에 있는 getB(이메일 동의)값을 불러들어온다. 단, input으로  B값이 셋팅되어 수정이 가능하게 만들어진다.--%>
    <tr> 
      <td width="200">닉네임설정</td>
      <td width="400"> 
          <input type="text" name="nick" size="60" maxlength="50" value="<%=c.getNick()%>">
      </td><%-- DTO에 있는 getNick(닉네임)값을 불러들어온다. 단, input으로 수정이 가능하게 만들어진다.--%>
    </tr>   
      <td width="200">소개란</td>
      <td width="400"> 
          <input type="text" name="intru" size="60" maxlength="2000" value="<%=c.getIntru()%>">
      </td> <%-- DTO에 있는 getIntru(소개란)값을 불러들어온다. 단, input으로 수정이 가능하게 만들어진다.--%>
    </tr>      
    <tr> 
      <td> 
       <input type="submit" name="modify" value="수   정" > <%-- 본 정보까지의 결과를 submit을 통해 modifyPro.jsp으로 보내진다.--%>
       <input type="button" value="취  소" onclick="javascript:window.location='main.jsp'">      
      </td> <%-- 취소버튼을 통해 main.jsp으로 이동을 하게된다.--%>
    </tr>
  </table>
</form>
</body>
<%}catch(Exception e){}%>
</html>