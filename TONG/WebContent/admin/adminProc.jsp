<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="adminDATADB.bean.DAO"%>
<%@ include file = "../test2/mainform7.jsp" %>
<% request.setCharacterEncoding("EUC-KR");%>

<%
    String id = request.getParameter("a_id");
	String password  = request.getParameter("a_password");
	// �켱 �Էµ� ���̵�� ����� ������ getInstance�� ���� �ӽ÷� ��ü�� �����մϴ�.
	DAO manager = DAO.getInstance();
    int check= manager.userCheck(id, password);
// DAO�� �ִ� userCheck �޼ҵ带 ���� ���̵�� ��й�ȣ�� �ִ��� üũ�մϴ�.
// check���� userCheck �޼ҵ忡 x���� ����ֽ��ϴ�.
	if(check==1){
		session.setAttribute("a_id",id);
		response.sendRedirect("main.jsp");
		// x=1�� ��� ������ ����Ǿ �α������� �ϰ� �ǰ� main if���� else���� �����ϰ� �˴ϴ�.
	}else{%>
	<script> 
	  alert("��й�ȣ�� ���� �ʽ��ϴ�.");
      history.go(-1);
   // x=0�� ��� ���̵�� �˻��� �Ǿ����� DB�� ��й�ȣ ���� �ٸ��� ������ ����� �˷��ݴϴ�.
	</script>
<%}	%>	