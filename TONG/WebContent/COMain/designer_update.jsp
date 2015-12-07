<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>
</head>

<% 

request.setCharacterEncoding("EUC-KR");
int num = 0;
  try{
	if(request.getParameter("num")!=null){
		num=Integer.parseInt(request.getParameter("num"));
	}

%>



   
<body>  
<center><b>디자이너 등록</b>
<br>

<form name="designer_update" method="post" enctype="multipart/form-data" action="designer_updatePro.jsp" onsubmit="return writeSave()">
<table width="450" border="1" cellspacing="0" cellpadding="0" align="center">
   <tr>
    <td align="right" colspan="2" >
	    <a href="Style.jsp"> Style화면으로 </a>   <%--Style.jsp 로 이동  한칸뒤로 이동 --%>
   </td>
   </tr>
   <tr>
  	<td>
  	사진 </td>
  	<td>
	<input type="file" name="Style_Photo" value="업로드">

	</td>
  </tr>
  <tr>
    <td  width="100"   align="center" >미용실</td>
   <td  width="330">
       <input type="text" size="40" maxlength="20" name="Style_Storename" ></td>  <%--미용실명 입력 --%>
  </tr>
  <tr>
    <td  width="70"  align="center">지역</td>
    <td  width="330">
      강남 <input type="radio"  name="Style_Area" value="gangnam" >
      강북 <input type="radio"  name="Style_Area" value="gangbook" ></td> <%--지역선택 --%>
  </tr>
  <tr>
    <td  width="70"  align="center">성별</td>
    <td  width="330">
      남자 <input type="radio"  name="Style_Sex" value="man" >
      여자 <input type="radio"  name="Style_Sex" value="woman" ></td>
  </tr> <%--성별선택 --%>
 
  <tr>
    <td  width="70"  align="center">스타일</td>
    <td  width="330">
      커트 <input type="radio"  name="Style_Style" value="cut" >
      파마 <input type="radio"  name="Style_Style" value="perm" >
      염색 <input type="radio"  name="Style_Style" value="dye" >
      매직 <input type="radio"  name="Style_Style" value="magic" ></td>
  </tr>  <%--스타일 선택--%>
  <tr>
  <td>
  가격
  </td>
  <td>
  <input type="text" size="10" maxlength="10" name="Style_Price">원
  </td>
  </tr>
  <tr>
  <td>
   자기소개
  </td>
 <td>
<textarea name="Style_Myself" rows="13" cols="40"></textarea>
 </td>
  </tr>
<tr>      
 <td colspan=2  align="center"> 
  <input type="submit" value="글쓰기" >  
  <input type="reset" value="다시작성">
  <input type="button" value="목록보기" OnClick="window.location='Style.jsp'">
</td></tr></table>    



 <%
  }catch(Exception e){}
%>     
</form>      
</body>
</html>      