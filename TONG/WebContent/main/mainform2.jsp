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
	font-family:'����' , sans-rerif;
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
<td>����������������������������������������������������
<img src="../Image/Tong1.PNG" width="300" height="200"/></td>
 <td>������������
 �����̵�<input type="text" size="15" maxlength="12" name=""></td>
 <td>��й�ȣ<input type="text" size="15" maxlength="15" name=""></td>
 <td> <input type="button" size="15" value="�α���"></td> 
 <td> <input type="button" size="15" value="ȸ������" onclick="javascript:window.location='../Member/InputForm.jsp'"></td>
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
