<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../test2/mainform5.jsp" %>

<body>
<center><h2><% out.println("페이지 준비중 입니다.");
    out.println("<h3>3초후 메인으로 돌아갑니다.");%></center></h2>

		    <center><input type="button" value="메인으로" onclick="window.location='../test2/mainform6.jsp'">
      </form><meta http-equiv="Refresh" content="3;url=../test2/mainform6.jsp" ></center>
</body>
</html>