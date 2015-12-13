<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="EUC-KR"%>
<%@page import="test.bean.DAO"%>

<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id= "dto" class ="test.bean.DTO" />
<jsp:setProperty name= "dto" property ="*" />

<% DAO dao = new DAO();
   dao.insert(dto);
   out.println("insert ¿Ï·á!");
   %>