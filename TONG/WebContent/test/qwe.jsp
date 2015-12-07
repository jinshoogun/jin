<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Insert title here</title>

<style>


/*  탭메뉴  */

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
/*  요소 (element) 여백 초기화  */
* { margin: 0; padding: 0; }
/* 제목요소 */
h1,h2,h3,h4,h5,h6 { font-size:100%; font-weight:normail; }
/* 테두리 없애기 */
fieldset, img{ border:0 none; }
/* 목록 */
ol,ul,li { list-style:none; } 
/* 텍스트 관련 요소 */
address, caption, strong, em, cite {    font-weight:normal;    font-style:normal;}
/* 추가된 데이터 */
ins { text-decoration:none; }
/* 삭제된 데이터 */
del { text-decoration:line-through } 
/* 수평선 */
hr { display:none } 
/*  테이블  */
table { border:0 none ; border-spacing: 0; border-collapse: collapse; }
th, td{ text-align:left; font-weight: normal; }
/* 인용구 */
q:before , q:after , blockquote:after , blockquote:before {    content : " ";    }
blockquote. q{ quotes: "" ""; } 
/* 인라인 요소의 세로 위치 */
img, input, select{    vertical-align:middle;    }





</style>

</head>
<body>

<div id="boardBox">
          <h3 class="tab01"><a href="#noticeList"><img src="images/main/tab_notice_ov.gif" alt="공지사항" /></a></h3>
          <div id="noticeList">
            <ul>
              <li><a href="#">HTML 모든 것을 알려주마 샘플 활용법</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">W3C 사이트 리뉴얼 소식 및 공지사항</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">KWCAG2.0 소식</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">서버 점검으로 인한 사이트 이용안내 입니다.</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">여러분들이 생각하는 웹 접근성에 대해 이야기를 나..</a> <span class="date">2009.10.15</span></li>
            </ul>
            <p class="more"><a href="#"><img src="images/main/icon_more.gif" alt="더보기" /></a></p>
          </div>
          <h3 class="tab02"><a href="#pdsList"><img src="images/main/tab_pds.gif" alt="자료실" /></a></h3>
          <div id="pdsList">
            <ul>
              <li><a href="#">디자인 사이트 링크 모음</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">웹 접근성 관련 자료 모음</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">예제 샘플 응용해 보기</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">웹 접근성 향상을 위한 국가표준 기술 가이드 라인</a> <span class="date">2009.10.15</span></li>
              <li><a href="#">로얄티 프리 이미지 자료</a> <span class="date">2009.10.15</span></li>
            </ul>
            <p class="more"><a href="#"><img src="images/main/icon_more.gif" alt="더보기" /></a></p>
          </div>
      </div>


</body>
</html>