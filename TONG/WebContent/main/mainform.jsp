<%@ page language="java" contentType="text/html; charset=EUC-KR"
  pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<style>
#navi , #navi u1, #navi ul li , #navi ul li ul {
margin:0;
padding:0;

}
#navi{
	background:#e82c0c;
	padding-bottom:3px;
}
#navi:before,#navi:after,#navi > ul:before , #navi > ul:after{
	content:'';
	display:block;
	clear:both;
	}
#navi ul{
	background:#333;
	list-style:none;
}
#navi ul li{
	float:left;
	position:relative;
}
#navi ul li a{
	padding: 23px 26px:
	display:block;
	color:white;
	font-family:'굴림',sans-rerif;
	font-weight:bold;
	
	font-size:20px;
	text-decoration:none;
	line-height:18px;
}
#navi > ul > li:hover > a{
	background:#e82c0c;
}
#navi > ul > li.active > a, #navi > ul > li > a:active{
	background:#bfbab5;
	color:#333;
}

#navi > ul ul{
	opacity:0;
	visibility:hidden;
	position:absolute;
	background:#333;
}
#navi > ul li:hover ul{
	opacity:1;
	visibility:visible;
	top:64px;
	left:0;
}
	
</style>

</head>
<body>

    <center><img src="../Image/Tong.jpg" width="300" height="200"/></center>
 <td align="right">아이디<input type="text" size="15" maxlength="12" name=""></td>
 <td align="right">비밀번호<input type="text" size="15" maxlength="15" name=""></td>
 <td> <input type="button" size="15" value="로그인"></td> <td><input type="button" size="15" value="회원가입"></td>
 <td> <input type="button" size="17" value="id/pw찾기"></td>
    
    
    
<div id='navi'>
<ul>
<li class="active"><a href="#">about us</a>
<ul>
	<li><a href="#">회사소개</a></li>
	<li><a href="#">오시는길</a></li>
	<li><a href="#">사이트맵</a></li>
	</ul>
	</li>
<li class="active"><a href="#">My 서비스</a>
<ul>
	<li><a href="#">회원정보수정</a></li>
	<li><a href="#">회원탈퇴</a></li>
	<li><a href="#">마이페이지</a></li>
	<li><a href="#">예약현황</a></li>
	<li><a href="#">예약내역</a></li>
	</ul>
	</li>
	
<li class="active"><a href="#">Styles</a>
<ul>
	<li><a href="#">디자이너</a></li>
	<li><a href="#">펌</a></li>
	<li><a href="#">매직</a></li>
	<li><a href="#">커트</a></li>
	<li><a href="#">염색</a></li>
</ul>
</li>
<li class="active"><a href="#">News & Events</a>
<ul>
	<li><a href="#">공지사항</a></li>
	<li><a href="#">진행중 이벤트</a></li>
	<li><a href="#">종료된 이벤트</a></li>
	<li><a href="#">스타일뉴스</a></li>
</ul>
</li>
<li class="active"><a href="#">고객센터</a>
<ul>
	<li><a href="#">QnA</a></li>
	<li><a href="#">고객후기</a></li>
	</li>
</ul>

</div>
</body>
</html>