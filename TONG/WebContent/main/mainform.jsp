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
	font-family:'����',sans-rerif;
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
 <td align="right">���̵�<input type="text" size="15" maxlength="12" name=""></td>
 <td align="right">��й�ȣ<input type="text" size="15" maxlength="15" name=""></td>
 <td> <input type="button" size="15" value="�α���"></td> <td><input type="button" size="15" value="ȸ������"></td>
 <td> <input type="button" size="17" value="id/pwã��"></td>
    
    
    
<div id='navi'>
<ul>
<li class="active"><a href="#">about us</a>
<ul>
	<li><a href="#">ȸ��Ұ�</a></li>
	<li><a href="#">���ô±�</a></li>
	<li><a href="#">����Ʈ��</a></li>
	</ul>
	</li>
<li class="active"><a href="#">My ����</a>
<ul>
	<li><a href="#">ȸ����������</a></li>
	<li><a href="#">ȸ��Ż��</a></li>
	<li><a href="#">����������</a></li>
	<li><a href="#">������Ȳ</a></li>
	<li><a href="#">���೻��</a></li>
	</ul>
	</li>
	
<li class="active"><a href="#">Styles</a>
<ul>
	<li><a href="#">�����̳�</a></li>
	<li><a href="#">��</a></li>
	<li><a href="#">����</a></li>
	<li><a href="#">ĿƮ</a></li>
	<li><a href="#">����</a></li>
</ul>
</li>
<li class="active"><a href="#">News & Events</a>
<ul>
	<li><a href="#">��������</a></li>
	<li><a href="#">������ �̺�Ʈ</a></li>
	<li><a href="#">����� �̺�Ʈ</a></li>
	<li><a href="#">��Ÿ�ϴ���</a></li>
</ul>
</li>
<li class="active"><a href="#">������</a>
<ul>
	<li><a href="#">QnA</a></li>
	<li><a href="#">���ı�</a></li>
	</li>
</ul>

</div>
</body>
</html>