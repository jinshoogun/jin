<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>

    <c:forEach var="dto" items="${list}">
		${dto.id}, ${dto.pw}, ${dto.age}, ${dto.reg}
	</c:forEach>