<%@ page contentType="text/html; charset=EUC-KR"%><%-- JSP 코드 --%>%> 
<%@ language="java" contentType="text/html; charset=EUC-KR" %>

	<%-- 적용하고 있는 포맷형식 (WEB MINE TYPE) 복수은 안되지만 모든 형식은 지원하겠다는 가능  ex) image/jpg 사진 중에 jpg만 지원하겠다! --%>
        <%@  extends="java.util.Date"%>
	<%-- 상속 기능 (자동으로 상속되므로 작성안해도 되뮤) --%>
         <%@ import="java.util.Date"
         session="true"%>
	<%-- 세션(서버정보)과 쿠키(피시정보)와 동시에 사용하고 있다.((기본 웹은 비연결 지향성 - 요청이 끝나면 OFF상태) 비동기식 데이터 처리(F5없이 실시간 업뎃하는거)???) 로그인 상태를 확인한다?(기능 사용여부를 위해 true, false), 기본값 true, 생략가능 --%>
         <%@ buffer="8kb"%>
	<%--화면이 한번에 나타내는 양(현재, 기본값으로 지정됨 - 9폰트에 A4에 글자 가득 채울 수 있음) 유동적으로 변동 가능--%>
        <%@  autoFlush="true"%>
	<%-- 버퍼 크기가 다 찰 경우 추가할지 아닌지 결정 (false하면 버퍼 오버플로딩 현상으로 초과시 에러 발생)--%>
        <%@  isThreadSafe="true"%>
	<%--여러개 브라우져 요청을  허락할지 결정하는 것(기본값이 설정됨)--%>
        <%@  pageEncoding="EUC-KR"%>
	<%-- 언어지원 여부(EUC-KR UTF-8 - 국제 표준 iso-8859-1 - 협회표준) --%>
        <%@  errorPage="/error/error.jsp"%>
	<%-- 에러페이지 뜰때 제공하는 페이지를 지정 --%> 
        <%@  isErrorPage="false"%><%-- 에러페이지라고 정정한다(예외처리를 조금더 지원이 가능하다)--%> 


<%--page부분이 잘못작성시 저장시 에러 분출 --%><%-- HTML 코드 전부다!!! 공백 포함 --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello ...!!</h1>

</body>
</html>