<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

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
	font-family:'����' , sans-rerif;
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
background:url(../Image/123.jpg);
background-size:100% 100%;
background-repeat : no-repeat;
}

</style>

<td><img src="../Image/Tong.jpg" width="300" height="200"/></td>
<td>����������������������������������������������������
<img src="../Image/Tong1.PNG" width="300" height="200"/></td>
 <td>������������������������
 ��ID<input type="text" size="15" maxlength="12" name=""></td>
 <td>PW<input type="text" size="15" maxlength="15" name=""></td>
 <td> <input type="button" size="15" value="�α���"></td> 
 <td> <input type="button" size="15" value="ȸ������" onclick="javascript:window.location='../Member/InputForm.jsp'"></td>
 <td> <input type="button" size="17" value="id/pwã��"></td>
				</td>

			</form>
		</tr>
	</table>



<div id='navi'>
<ul>
<li class="active"><a href="#">about us</a>
<ul>
	<li><a href="#">ȸ��Ұ�</a></li>
	<li><a href="#">���ô±�</a></li>
	<li><a href="#">����Ʈ��</a></li>
	</ul>
	</li>
<li class="active"><a href="#">����&nbsp;&nbsp;My ����</a>
<ul>
	<li><a href="#">ȸ����������&nbsp;��</a></li>
	<li><a href="#">ȸ��Ż�𡡡���&nbsp;</a></li>
	<li><a href="#">��������������&nbsp;</a></li>
	<li><a href="#">������Ȳ������&nbsp;</a></li>
	<li><a href="#">���೻��������&nbsp;</a></li>
	</ul>
	</li>
	
<li class="active"><a href="#">Styles����</a>
<ul>
	<li><a href="#">�����̳�&nbsp;</a></li>
	<li><a href="#">�ߡ�����&nbsp;</a></li>
	<li><a href="#">��������&nbsp;</a></li>
	<li><a href="#">ĿƮ����&nbsp;</a></li>
	<li><a href="#">��������&nbsp;</a></li>
</ul>
</li>
<li class="active"><a href="#">News & Events</a>
<ul>
	<li><a href="#">�������ס�����</a></li>
	<li><a href="#">������ �̺�Ʈ&nbsp;</a></li>
	<li><a href="#">����� �̺�Ʈ&nbsp;</a></li>
	<li><a href="#">��Ÿ�ϴ�������</a></li>
</ul>
</li>
<li class="active"><a href="#">��������</a>
<ul>
	<li><a href="#">QnA������</a></li>
	<li><a href="#">���ı�&nbsp;&nbsp;</a></li>
	</li>
</ul>
</div>
</body>
</html>
