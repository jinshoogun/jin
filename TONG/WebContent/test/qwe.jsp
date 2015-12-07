<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>

<style>


/*  �Ǹ޴�  */

#boardBox {        background: url("../images/main/bbs_h3_bg.gif") no-repeat 0 22px;    position:relative;    height:155px;
width: 600px; }
#boardBox h3{    float:left;    }
#boardBox .more a{    position:absolute;    top:0;    right:0;    padding:8px;    }
#boardBox ul{    position:absolute;    width:100%;    top:45px;    left:0; }
#boardBox li{    position:relative;        background: url("../images/common/bullet_list.gif") no-repeat 2px 5px;  
                padding:0 0 0 12px;        line-height:1.8;    }
#boardBox .date{    position:absolute;    top:0;    right:0;    _margin-top:-4px;}
#pdsList{    display:none;    }


@charset "utf-8";
/*  ��� (element) ���� �ʱ�ȭ  */
* { margin: 0; padding: 0; }
/* ������ */
h1,h2,h3,h4,h5,h6 { font-size:100%; font-weight:normail; }
/* �׵θ� ���ֱ� */
fieldset, img{ border:0 none; }
/* ��� */
ol,ul,li { list-style:none; } 
/* �ؽ�Ʈ ���� ��� */
address, caption, strong, em, cite {    font-weight:normal;    font-style:normal;}
/* �߰��� ������ */
ins { text-decoration:none; }
/* ������ ������ */
del { text-decoration:line-through } 
/* ���� */
hr { display:none } 
/*  ���̺�  */
table { border:0 none ; border-spacing: 0; border-collapse: collapse; }
th, td{ text-align:left; font-weight: normal; }
/* �ο뱸 */
q:before , q:after , blockquote:after , blockquote:before {    content : " ";    }
blockquote. q{ quotes: "" ""; } 
/* �ζ��� ����� ���� ��ġ */
img, input, select{    vertical-align:middle;    }





</style>

</head>
<body>

<div id="boardBox">
          <h3 class="tab01"><a href="#noticeList"><img src="images/main/tab_notice_ov.gif" alt="��������" /></a></h3>
          <div id="noticeList">
            <ul>
              <li><a href="#">HTML ��� ���� �˷��ָ� ���� Ȱ���</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">W3C ����Ʈ ������ �ҽ� �� ��������</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">KWCAG2.0 �ҽ�</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">���� �������� ���� ����Ʈ �̿�ȳ� �Դϴ�.</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">�����е��� �����ϴ� �� ���ټ��� ���� �̾߱⸦ ��..</a> <span class="date">2009.10.15</span></li>
            </ul>
            <p class="more"><a href="#"><img src="images/main/icon_more.gif" alt="������" /></a></p>
          </div>
          <h3 class="tab02"><a href="#pdsList"><img src="images/main/tab_pds.gif" alt="�ڷ��" /></a></h3>
          <div id="pdsList">
            <ul>
              <li><a href="#">������ ����Ʈ ��ũ ����</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">�� ���ټ� ���� �ڷ� ����</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">���� ���� ������ ����</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">�� ���ټ� ����� ���� ����ǥ�� ��� ���̵� ����</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">�ξ�Ƽ ���� �̹��� �ڷ�</a> <span class="date">2009.10.15</span></li>
            </ul>
            <p class="more"><a href="#"><img src="images/main/icon_more.gif" alt="������" /></a></p>
          </div>
      </div>


</body>
</html>