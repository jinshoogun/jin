<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%> pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
    
    <title>�̹��� ��Ŀ�� Ŀ���� ��������</title>
    <style>
.customoverlay {position:relative;bottom:85px;border-radius:6px;border: 1px solid #ccc;border-bottom:2px solid #ddd;float:left;}
.customoverlay:nth-of-type(n) {border:0; box-shadow:0px 1px 2px #888;}
.customoverlay a {display:block;text-decoration:none;color:#000;text-align:center;border-radius:6px;font-size:14px;font-weight:bold;overflow:hidden;background: #d95050;background: #d95050 url(http://i1.daumcdn.net/localimg/localimages/07/mapapidoc/arrow_white.png) no-repeat right 14px center;}
.customoverlay .title {display:block;text-align:center;background:#fff;margin-right:35px;padding:10px 15px;font-size:14px;font-weight:bold;}
.customoverlay:after {content:'';position:absolute;margin-left:-12px;left:50%;bottom:-12px;width:22px;height:12px;background:url('http://i1.daumcdn.net/localimg/localimages/07/mapapidoc/vertex_white.png')}
</style>

</head>
<body>
<img  src="C:\Users\�ҿ�\Desktop\JAVA\TONG\WebContent\Image\Tong1.jpg" width="150"
		height="100"><br/>
<font size="5"  ><b>���ô±�</b></font>		
<HR width=100% size=4 color=red> 

<div id="map" style="width:100%;height:350px;"  align="left"></div>

<script type="text/javascript" src="//apis.daum.net/maps/maps3.js?apikey=4cc43b690658aaf9346529a3c1af1c1b"></script>


<script>
var mapContainer = document.getElementById('map'), // ������ ǥ���� div 
  mapOption = { 
        center: new daum.maps.LatLng(37.498942, 127.032830), // ������ �߽���ǥ
        level: 4 // ������ Ȯ�� ����
    };

var map = new daum.maps.Map(mapContainer, mapOption);

var imageSrc = 'http://map.daum.net/?itemId=11394059', // ��Ŀ�̹����� �ּ��Դϴ�    
    imageSize = new daum.maps.Size(64, 69), // ��Ŀ�̹����� ũ���Դϴ�
    imageOprion = {offset: new daum.maps.Point(27, 69)}; // ��Ŀ�̹����� �ɼ��Դϴ�. ��Ŀ�� ��ǥ�� ��ġ��ų �̹��� �ȿ����� ��ǥ�� �����մϴ�.

// ��Ŀ�� �̹��������� ������ �ִ� ��Ŀ�̹����� �����մϴ�
var markerImage = new daum.maps.MarkerImage(imageSrc, imageSize, imageOprion),
    markerPosition = new daum.maps.LatLng(37.498942, 127.032830); // ��Ŀ�� ǥ�õ� ��ġ�Դϴ�

// ��Ŀ�� �����մϴ�
var marker = new daum.maps.Marker({
  position: markerPosition,
   // ��Ŀ�̹��� ���� 
});

// ��Ŀ�� ���� ���� ǥ�õǵ��� �����մϴ�
marker.setMap(map);  

// Ŀ���� �������̿� ǥ��� �������� HTML ���ڿ��̳� document element�� �����մϴ�
var content = '<div class="customoverlay">' +
    '  <a href=http://map.daum.net/?itemId=11394059 target="_blank">' +
    '    <span class="title">(��)�Ӹ���</span>' +
    '  </a>' +
    '</div>';

// Ŀ���� �������̰� ǥ�õ� ��ġ�Դϴ� 
var position = new daum.maps.LatLng(37.498942, 127.032830);  

// Ŀ���� �������̸� �����մϴ�
var customOverlay = new daum.maps.CustomOverlay({
    map: map,
    position: position,
    content: content,
    yAnchor: 1 
});
</script>
 <div>
 <HR width=100% size=4 color=red> 

�ּ�&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;����Ư���� ������ ���ﵿ 823-24 �������� 2��, 3�� (T: 1544-9970 / F: 070-8290-2889)<br/> 
 <br />
����&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img  src="C:\Users\�ҿ�\Desktop\JAVA\TONG\WebContent\Image\bus1.jpg" width="10"
		height="15"> 146 / 740 / 341 / 360 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img  src="C:\Users\�ҿ�\Desktop\JAVA\TONG\WebContent\Image\bus2.jpg" width="10"
		height="15"> 1100 / 1700 / 2000 / 7007 / 8001 <br />
 <br />
����ö&nbsp;&nbsp;&nbsp;&nbsp;����ö 2ȣ�� ���￪ 3���ⱸ 100m  <br />
 <br />


<input  align="justify" type="submit" name="Submit" value="�Ӹ��� ������������" onclick="javascript:window.location='MainForm.jsp'">
</div>



 </body>
</html>
