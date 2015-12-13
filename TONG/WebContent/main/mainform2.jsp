<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>

<html>
<head>
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
	background:gray;
	list-style:none;
}

#navi ul li{
	float:left;
	position:relative;
}
 
#navi ul li a{
	padding: 50px 135px;
	display:block;
	color:white;
	font-family:'굴림' , sans-rerif;
	font-weight:bold;
	fint-size:20px;
	text-decoration:none;
	line-height:18px;
}


#navi > ul > li:hover > a{
	background:gray;
}
#navi > ul > li.active > a, #navi > ul > li > a:active{
	background:gray;
	color:pink;
	
}

#navi > ul ul{
	opacity:0;
	visibility:hidden;
	position:absolute;
	background:gray;
	
}
#navi > ul li:hover ul{
	opacity:1;
	visibility:visible;
	top:64px;
	left:0;
	
}
#navi li{
border-right:1px solid #7a7a7a;
border-left:1px slid #343434;
}

.navi li:hover {
	background-color:#333333;
	background-webkit-linear-gradient(top,#333333,#4c4c4c);
	background-linear-gradient(top,#333333,#4c4c4c);
		
}

.navi li:hover >a{
	color:yellow;
	text-shadow: 0 0 1px #ccc;
}

</style>
<body>

<td><img src="../Image/Tong.jpg" width="300" height="200"/></td>
<td>　　　　　　　　　　　　　　　　　　　　　　　　　　
<img src="../Image/Tong1.PNG" width="300" height="200"/></td>
 <td>　　　　　　
 　아이디<input type="text" size="15" maxlength="12" name=""></td>
 <td>비밀번호<input type="text" size="15" maxlength="15" name=""></td>
 <td> <input type="button" size="15" value="로그인"></td> 
 <td> <input type="button" size="15" value="회원가입" onclick="javascript:window.location='../Member/InputForm.jsp'"></td>
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
