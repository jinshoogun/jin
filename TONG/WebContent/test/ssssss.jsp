<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
 <form action="http://www.miiu.co.kr">
  <div class="loginBox">
  <fieldset>
 <label class="id"><span><img src="images/txt_id.jpg" alt="아이디"></span><input type="text"></label>
    <label class="password"><span><img src="images/txt_pwd.jpg" alt="비밀번호"></span><input type="password"></label>
 <input type="image" src="images/btn_login.jpg" value="나 버튼">
    <p class="security">
        <input type="checkbox"> 아이디저장 
        보안저장    
    </p>
    <ul>
  <li><img src="images/btn_regist.jpg"></li>
  <li><img src="images/btn_search_id.jpg"></li>
  <li><img src="images/btn_search_pwd.jpg"></li>
  <style>
 .loginBox fieldset {position:relative; width:490px; height:180px; margin:0 auto; border:none;}
 .loginBox fieldset .id , .password { overflow:hidden; display:block; width:380px; margin:0 0 10px; }
 .loginBox fieldset .id span, .password span {float:left; width:60px; padding:15px 0 0 0; display:block;}
 .loginBox fieldset  input[type=text],input[type=password] {float:left; width:310px; height:38px; padding:2px 2px 2px 3px; border:1px solid #ddd; color:#8F8F91;}
 .loginBox input[type=image] {position:absolute; top:0px; right:0px;}
 
 .loginBox fieldset .security {margin-left:60px; font-size:11px; color:#757575;}
 .loginBox fieldset ul {margin-left:62px; padding:0;}
 .loginBox fieldset li{display:inline-block;  list-style:none;}
 </style>
 </ul>
  </fieldset>
  </div>
 </form>