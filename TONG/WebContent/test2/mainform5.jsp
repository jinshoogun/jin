<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<html>

</head>
<%
	try {
		if (session.getAttribute("m_id") == null)
		//null- 로그인이 안되었을때
		{
%>
<script language="javascript">
	function focusIt() {
		document.inform.m_id.focus(); //현재문서(document.)에있는 inform을 찾아라. FOCUS=커서
	}

	function checkIt() {
		InputForm = eval("document.inform");
		if (!InputForm.m_id.value) {
			alert("아이디를 입력하세요..");
			InputForm.m_id.focus();
			return false;
		}
		if (!InputForm.m_password.value) {
			alert("아이디를 입력하세요..");
			InputForm.m_password.focus();
			return false;
		}
	}
</script>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<style>
#navi , #navi ul, #navi ul li, #navi ul li ul{
 margin:0;
 padding:0;
}
#navi{
	background:#CC3D3D;
	padding-bottom:3px;
}

#navi:before , #navi:after, #navi >ul:before , #navi > ul:after{
	content:'';
	display:block;
	clear:both;
	
}
#navi ul{
	background:#CC3D3D;
	list-style:none;
}

#navi ul li{
	float:left;
	position:relative;
}
 
#navi ul li a{
	padding: 23px 65px;
	display:block;
	color:White;
	font-family:'굴림' , sans-rerif;
	font-weight:bold;
	font-size:18px;
	text-decoration:none;
	line-height:18px;
	transition:color .25s;
	-webkit-transition:color .25s;
	-moz-transition:color .25s;
	-o-transition:color .25s;
}


#navi > ul > li:hover > a{
	background:#CC3D3D;
}
#navi > ul > li.active > a, #navi > ul > li > a:active{
	background:#CC3D3D;
	color:White;
	
}

#navi > ul ul{
	opacity:0;
	visibility:hidden;
	position:absolute;
	background:#CC3D3D;
	
}
#navi > ul li:hover ul{
	opacity:1;
	visibility:visible;
	top:64px;
	left:0;
	
}
#navi li{
border-right:1px solid #CC3D3D;
border-left:1px slid #CC3D3D;
}

#navi li:hover {
	background-color:#FFB9B9;
	background-webkit-linear-gradient(top,#C4DEFF,#C4DEFF);
	background-linear-gradient(top,#C4DEFF,#C4DEFF);
		
}

#navi li:hover >a{
	color:#FF4848;
	text-shadow: 0 0 1px #ccc;
}

#navi li:first-child{
	-webkit-bordoer-radius:5px 0 0 5px;
	border-radius:5px 0 0 px;
}

#navi li:last-child{
	-webkit-bordoer-radius:0 5px 5px 0;
	border-radius:5px 0 0 px;
	
}

</style>

<td><input type="button" size="15" value="adminPage" onclick="javascript:window.location='../admin/main.jsp'">　　　　　　　　　　　　　　　
<center><a href="../test2/mainform6.jsp"><img src="../Image/Tong.jpg" width="150" height="120">
<a href="../test2/mainform6.jsp"><img src="../Image/Tong1.PNG" width="250" height="130"></a></center></td>
　　
 <body>
  <%if (session.getAttribute("a_id") != null) {} else { %>
 			<form name="inform" method="post" action="../test2/LoginPro.jsp"
				onSubmit="return checkIt();">&nbsp;　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
 　ID<input type="text" size="12" maxlength="12" name="m_id"></td>
 <td>PW<input type="password" size="12" maxlength="15" name="m_password"></td>
 <td> <input type="submit" name="Submit" size="15" value="로그인"></td> 
 <td> <input type="button" size="15" value="회원가입" onclick="javascript:window.location='../Member/AllinputForm.jsp'"></td>
 <td> <input type="button" size="15" value="id찾기" onclick="javascript:window.location='../test2/SearchidForm.jsp'"></td>
  <td> <input type="button" size="15" value="pw찾기" onclick="javascript:window.location='../test2/SearchpwForm.jsp'"></td>
				</td>

			</form>
		</tr>
	</table>
<%} %>


<div id='navi'>
<ul>
<li class="active"><a href="#"><image src="../Image/CH.jpg" width="30" height="30"><td>about us</a>
<ul>
	<li onclick="javascript:window.location='../Companyintroduce/Company.jsp'"><a href="#">회사소개&nbsp;　</a></li>
	<li onclick="javascript:window.location='../SiteMap/Map2.jsp'"><a href="#">오시는길&nbsp;　</a></li>
	<li onclick="javascript:window.location='../SiteMap/Sitemap.jsp'"><a href="#">사이트맵&nbsp;　</a></li>
	</ul>
	</li>
<li class="active"><a href="#"><image src="../Image/CH.jpg" width="30" height="30"><td>My 서비스</a>
<ul>
	<li onclick="javascript:window.location='../test2/ModifyForm.jsp'"><a href="#">정보수정&nbsp;&nbsp;　</a></li>
	<li onclick="javascript:window.location='../test2/DeleteForm.jsp'"><a href="#">회원탈퇴　&nbsp;&nbsp;</a></li>
<li onclick="javascript:window.location='../test2/rest.jsp'"><a href="#">예약내역　&nbsp;&nbsp;</a></li>
	</ul>
	</li>
	
<li class="active"><a href="#"><image src="../Image/CH.jpg" width="30" height="30"><td>Styles　　</a>
<ul>

	<li onclick="javascript:window.location='../aowkd/Stroe.jsp'"><a href="#">매장정보&nbsp;　&nbsp;</a></li>
	<li onclick="javascript:window.location='../ManWomen/Manperm.jsp'"><a href="#">펌　　　&nbsp;　&nbsp;</a></li>
	<li onclick="javascript:window.location='../ManWomen/ManMagic.jsp'"><a href="#">매직　　&nbsp;　&nbsp;</a></li>
	<li onclick="javascript:window.location='../ManWomen/ManCut.jsp'"><a href="#">커트　　&nbsp;　&nbsp;</a></li>
	<li onclick="javascript:window.location='../Color/Color.jsp'"><a href="#">염색　　&nbsp;　&nbsp;</a></li>
</ul>
</li>
<li class="active"><a href="#"><image src="../Image/CH.jpg" width="30" height="30"><td>News & Events</a>
<ul>
	<li onclick="javascript:window.location='../notice/notice.jsp'"><a href="#">공지사항&nbsp;　　　　</a></li>
	<li onclick="javascript:window.location='../event/event.jsp'"><a href="#">진행중 이벤트&nbsp;　&nbsp;</a></li>
	<li onclick="javascript:window.location='../StyleNews/list.jsp'"><a href="#">스타일뉴스&nbsp;　　　</a></li>
</ul>

</li>
<li class="active"><a href="#"><image src="../Image/CH.jpg" width="30" height="30"><td>고객센터&상품</a>
<ul>
	<li onclick="javascript:window.location='../QnA/list.jsp'"><a href="#">QnA　　　　　　</a></li>
	<li onclick="javascript:window.location='../PhotoBoard/list.jsp'"><a href="#">고객후기　　　&nbsp;&nbsp;</a></li>
	<li onclick="javascript:window.location='../Product/ProductBuy.jsp'"><a href="#">상품구매　　　　</a></li>
	</li></ul></div>
	</li>
	</br>
<tr>
</tr>

		<%
		} else { //로그인이 되었을때
	%>
	<script language="javascript">
</script>
</head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<style>
#navi , #navi ul, #navi ul li, #navi ul li ul{
 margin:0;
 padding:0;
}
#navi{
	background:#CC3D3D;
	padding-bottom:3px;
}

#navi:before , #navi:after, #navi >ul:before , #navi > ul:after{
	content:'';
	display:block;
	clear:both;
	
}
#navi ul{
	background:#CC3D3D;
	list-style:none;
}

#navi ul li{
	float:left;
	position:relative;
}
 
#navi ul li a{
	padding: 23px 65px;
	display:block;
	color:White;
	font-family:'굴림' , sans-rerif;
	font-weight:bold;
	font-size:18px;
	text-decoration:none;
	line-height:18px;
	transition:color .25s;
	-webkit-transition:color .25s;
	-moz-transition:color .25s;
	-o-transition:color .25s;
}


#navi > ul > li:hover > a{
	background:#CC3D3D;
}
#navi > ul > li.active > a, #navi > ul > li > a:active{
	background:#CC3D3D;
	color:White;
	
}

#navi > ul ul{
	opacity:0;
	visibility:hidden;
	position:absolute;
	background:#CC3D3D;
	
}
#navi > ul li:hover ul{
	opacity:1;
	visibility:visible;
	top:64px;
	left:0;
	
}
#navi li{
border-right:1px solid #CC3D3D;
border-left:1px slid #CC3D3D;
}

#navi li:hover {
	background-color:#FFB9B9;
	background-webkit-linear-gradient(top,#C4DEFF,#C4DEFF);
	background-linear-gradient(top,#C4DEFF,#C4DEFF);
		
}

#navi li:hover >a{
	color:#FF4848;
	text-shadow: 0 0 1px #ccc;
}

#navi li:first-child{
	-webkit-bordoer-radius:5px 0 0 5px;
	border-radius:5px 0 0 px;
}

#navi li:last-child{
	-webkit-bordoer-radius:0 5px 5px 0;
	border-radius:5px 0 0 px;
	
}

</style>

<td><input type="button" size="15" value="adminPage" onclick="javascript:window.location='../admin/main.jsp'">　　　　　　　　　　　　　　　
<center><a href="../test2/mainform6.jsp"><img src="../Image/Tong.jpg" width="150" height="120">
<a href="../test2/mainform6.jsp"><img src="../Image/Tong1.PNG" width="250" height="130"></a></center></td>
 <td>
 <body>
 
 			<form name="inform" method="post" action="../test2/Logout.jsp"
				onSubmit="return checkIt();">
　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
 <td rowspan="3" bgcolor="silver" align="center"><%=session.getAttribute("m_id")%>님이 로그인 하셨습니다.
　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
<input type="submit" value="로그아웃">
<input type="button" value="회원정보변경" onclick="javascript:window.location='../test2/ModifyForm.jsp'">
			</td>
				</td>

			</form>
		</tr>
	</table>



<div id='navi'>
<ul>
<li class="active"><a href="#"><image src="../Image/CH.jpg" width="30" height="30"><td>about us</a>
<ul>
	<li onclick="javascript:window.location='../Companyintroduce/Company.jsp'"><a href="#">회사소개&nbsp;　</a></li>
	<li onclick="javascript:window.location='../SiteMap/Map2.jsp'"><a href="#">오시는길&nbsp;　</a></li>
	<li onclick="javascript:window.location='../SiteMap/Sitemap.jsp'"><a href="#">사이트맵&nbsp;　</a></li>
	</ul>
	</li>
<li class="active"><a href="#"><image src="../Image/CH.jpg" width="30" height="30"><td>My 서비스</a>
<ul>
	<li onclick="javascript:window.location='../test2/ModifyForm.jsp'"><a href="#">정보수정&nbsp;&nbsp;　</a></li>
	<li onclick="javascript:window.location='../test2/DeleteForm.jsp'"><a href="#">회원탈퇴　&nbsp;&nbsp;</a></li>
<li onclick="javascript:window.location='../reserve/MyReserveList.jsp'"><a href="#">예약내역　&nbsp;&nbsp;</a></li>
	</ul>
	</li>
	
<li class="active"><a href="#"><image src="../Image/CH.jpg" width="30" height="30"><td>Styles　　</a>
<ul>

	<li onclick="javascript:window.location='../aowkd/Stroe.jsp'"><a href="#">매장정보&nbsp;　&nbsp;</a></li>
	<li onclick="javascript:window.location='../ManWomen/Manperm.jsp'"><a href="#">펌　　　&nbsp;　&nbsp;</a></li>
	<li onclick="javascript:window.location='../ManWomen/ManMagic.jsp'"><a href="#">매직　　&nbsp;　&nbsp;</a></li>
	<li onclick="javascript:window.location='../ManWomen/ManCut.jsp'"><a href="#">커트　　&nbsp;　&nbsp;</a></li>
	<li onclick="javascript:window.location='../Color/Color.jsp'"><a href="#">염색　　&nbsp;　&nbsp;</a></li>
</ul>
</li>
<li class="active"><a href="#"><image src="../Image/CH.jpg" width="30" height="30"><td>News & Events</a>
<ul>
	<li onclick="javascript:window.location='../notice/notice.jsp'"><a href="#">공지사항&nbsp;　　　　</a></li>
	<li onclick="javascript:window.location='../event/event.jsp'"><a href="#">진행중 이벤트&nbsp;　&nbsp;</a></li>
	<li onclick="javascript:window.location='../StyleNews/list.jsp'"><a href="#">스타일뉴스&nbsp;　　　</a></li>
</ul>

</li>
<li class="active"><a href="#"><image src="../Image/CH.jpg" width="30" height="30"><td>고객센터&상품</a>
<ul>
	<li onclick="javascript:window.location='../QnA/list.jsp'"><a href="#">QnA　　　　　　</a></li>
	<li onclick="javascript:window.location='../oneByOne/list.jsp'"><a href="#">1:1상담　　　　&nbsp;</a></li>
	<li onclick="javascript:window.location='../PhotoBoard/list.jsp'"><a href="#">고객후기　　　&nbsp;&nbsp;</a></li>
	<li onclick="javascript:window.location='../Product/ProductBuy.jsp'"><a href="#">상품구매　　　　</a></li>
	</li></ul></div>
</ul></div>

		<%
		}
		} catch (NullPointerException e) {
		}
	%>
</ul>
</div>
</body>
</html>
