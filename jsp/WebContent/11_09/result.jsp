<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    <%String path = request.getRealPath("save") +"//"; %>
    
    <img src =  "<%=path%>얏홍.jpg"> <br/>
    <img src =  "/jsp/save/얏홍.jpg"> <br/> 
    <%-- 이미지 링크 경로로 사용하기 위해서  후자 경로(웹경로로 사용해야된다.)  --%>