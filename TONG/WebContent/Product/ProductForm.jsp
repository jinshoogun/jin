<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
request.setCharacterEncoding("EUC-KR"); %>
<html>
<head>
<title>상품등록</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>
</head>

<% 

int num = 0;
	if(request.getParameter("num")!=null){
		num=Integer.parseInt(request.getParameter("num"));
	}

%>



   
<body>  
<p align="center"><strong>상품등록</strong></p>
<br>

<form name="ProductForm" method="post" enctype="multipart/form-data" action="ProductP.jsp" onsubmit="return writeSave()">
<table width="450" cellspacing="0" cellpadding="0" align="center">
   <tr>
    <td align="right" colspan="2" >
	    <a href="ProductBuy.jsp"> 구매페이지로 </a>   <%--Style.jsp 로 이동  한칸뒤로 이동 --%>
   </td>
   </tr>
   <tr>
  	<td>
  	사진 </td>
  	<td>
	<input type="file" name="s_image" value="업로드">

	</td>
  </tr>
  <tr>
    <td  width="100"   align="center" >상품이름</td>
   <td  width="330">
       <input type="text" size="40" maxlength="20" name="s_name" ></td>  
  </tr>
<tr>
    <td  width="100"   align="center" >상품재고</td>
   <td  width="330">
       <input type="text" size="40" maxlength="20" name="s_stock" ></td>  
  </tr>
 
  <tr>
  <td>
  상품가격
  </td>
  <td>
  <input type="text" size="10" maxlength="10" name="s_price">원
  </td>
  </tr>
  <tr>
  <td>
   상품정보
  </td>
 <td>
<textarea name="s_derail" rows="13" cols="40"></textarea>
 </td>
  </tr>
<tr>      
 <td colspan=2  align="center"> 
  <input type="submit" value="글쓰기" >  
  <input type="reset" value="다시작성">
  <input type="button" value="구매 목록보기" OnClick="window.location='ProductBuy.jsp'">
  <a href="/TONG/admin/main.jsp">이전
</td></tr></table>    




</form>      
</body>
</html>      