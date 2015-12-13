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
	background:pink;
	padding-bottom:3px;
}

#navi:before , #navi:after, #navi >ul:before , #navi > ul:after{
	content:'';
	display:block;
	clear:both;
	
}
#navi ul{
	background:#FFEAEA;
	list-style:none;
}

#navi ul li{
	float:left;
	position:relative;
}
 
#navi ul li a{
	padding: 25px 127px;
	display:block;
	color:#FFEAEA;
	font-family:'굴림' , sans-rerif;
	font-weight:bold;
	font-size:18px;
	text-decoration:none;
	line-height:18px;
}


#navi > ul > li:hover > a{
	background:#FF6C6C;
}
#navi > ul > li.active > a, #navi > ul > li > a:active{
	background:#FF6C6C;
	color:pink;
	
}

#navi > ul ul{
	opacity:0;
	visibility:hidden;
	position:absolute;
	background:#FF6C6C;
	
}
#navi > ul li:hover ul{
	opacity:1;
	visibility:visible;
	top:64px;
	left:0;
	
}
#navi li{
border-right:1px solid #FF6C6C;
border-left:1px slid #FF6C6C;
}

#navi li:hover {
	background-color:#333333;
	background-webkit-linear-gradient(top,#333333,#4c4c4c);
	background-linear-gradient(top,#333333,#4c4c4c);
		
}

#navi li:hover >a{
	color:yellow;
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
body
{
background:url(../Image/Tong.jpg);
background-repeat : no-repeat;
}

</style>

<td></td>
<td>　　　　　　　　　　　　　　　　　　　　　　　
<center><img src="../Image/Tong1.PNG" width="300" height="200"/></td>
</center>
 <td>
 <body>
 
 			<form name="inform" method="post" action="LoginPro.jsp"
				onSubmit="return checkIt();">　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
 　ID<input type="text" size="15" maxlength="12" name="m_id"></td>
 <td>PW<input type="password" size="15" maxlength="15" name="m_password"></td>
 <td> <input type="submit" name="Submit" size="15" value="로그인"></td> 
 <td> <input type="button" size="15" value="회원가입" onclick="javascript:window.location='../Member/InputForm.jsp'"></td>
 <td> <input type="button" size="17" value="id/pw찾기"></td>
				</td>

			</form>
		</tr>
	</table>



<div id='navi'>
<ul>
<li class="active"><a href="#">about us</a>
<ul>
	<li><a href="#">회사소개</a></li>
	<li><a href="#">오시는길</a></li>
	<li><a href="#">사이트맵</a></li>
	</ul>
	</li>
<li class="active"><a href="#">　　&nbsp;&nbsp;My 서비스</a>
<ul>
	<li><a href="#">회원정보수정&nbsp;　</a></li>
	<li><a href="#">회원탈퇴　　　&nbsp;</a></li>
	<li><a href="#">마이페이지　　&nbsp;</a></li>
	<li><a href="#">예약하기　　　&nbsp;</a></li>
	<li><a href="#">예약내역　　　&nbsp;</a></li>
	</ul>
	</li>
	
<li class="active"><a href="#">Styles　　</a>
<ul>

	<li><a href="#">디자이너&nbsp;</a></li>
	<li><a href="#">펌　　　&nbsp;</a></li>
	<li><a href="#">매직　　&nbsp;</a></li>
	<li><a href="#">커트　　&nbsp;</a></li>
	<li><a href="#">염색　　&nbsp;</a></li>
</ul>
</li>
<li class="active"><a href="#">News & Events</a>
<ul>
	<li><a href="#">공지사항　　　</a></li>
	<li><a href="#">진행중 이벤트&nbsp;</a></li>
	<li><a href="#">종료된 이벤트&nbsp;</a></li>
	<li><a href="#">스타일뉴스　　</a></li>
</ul>
</li>
<li class="active"><a href="#">　고객센터</a>
<ul>
	<li><a href="#">QnA　　　</a></li>
	<li><a href="#">고객후기&nbsp;&nbsp;</a></li>
	</li>
		<%
		} else { //로그인이 되었을때
	%>
	<table width=500 cellpadding="0" cellspacing="0" align="right"
		border="1">
		<tr>
			<td width="300" bgcolor="silver" height="20">어서오세요</td>

			<td rowspan="3" bgcolor="silver" align="center"><%=session.getAttribute("m_id")%>님이
				<br> 방문하셨습니다
				<form method="post" action="Logout.jsp">
					<input type="submit" value="로그아웃"> <input type="button"
						value="회원정보변경"
						onclick="javascript:window.location='ModifyForm.jsp'">

				</form></td>
		</tr>
		<tr>
			<td rowspan="2" bgcolor="white" width="300">머리통입니다.</td>
		<%
		}
		} catch (NullPointerException e) {
		}
	%>
</ul>
</div>
</body>
</html>
