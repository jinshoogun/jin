<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB.bean.DAO" %>

<% 

request.setCharacterEncoding("euc-kr");%>

<%
  //request ���ΰ�ü - Ŭ���̾�Ʈ�� ��û������ WAS�� ��������
  //              - ������ String !
  //request ���ΰ�ü �޼ҵ� : �̸��� id�� �Ķ���Ϳ� �ش��ϴ� ���� �������ش�.
    String id = request.getParameter("id"); //id�� pw�� �����´�
	String password  = request.getParameter("password");
    
    
	//DB id,pw Ȯ�� - DAO.java ������ userCheck()�޼ҵ�
	DAO membership = DAO.getInstance();
    int usercheck= membership.userCheck(id, password);
    int designercheck = membership.designerCheck(id, password);
    int admincheck = membership.adminCheck(id, password);
    
    if(usercheck==1){
    	session.setAttribute("m_id", id);
    	response.sendRedirect("mainform6.jsp");
    }else if(designercheck==1){
    	session.setAttribute("d_id", id);
    	
    	response.sendRedirect("mainform6.jsp");
    }else if(admincheck==1){
    	session.setAttribute("a_id", id);
    	response.sendRedirect("mainform6.jsp");
    }else {%>
	<script> 
	  alert("��й�ȣ �Ǵ� ���̵� ���� �ʽ��ϴ�.");
   history.go(-1);
    //�齺���̽� 
	</script>
<%	} %>