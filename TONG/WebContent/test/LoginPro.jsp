<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB.bean.DAO" %>

<% 

request.setCharacterEncoding("euc-kr");%>

<%
  //request ���ΰ�ü - Ŭ���̾�Ʈ�� ��û������ WAS�� ��������
  //              - ������ String !
  //request ���ΰ�ü �޼ҵ� : �̸��� id�� �Ķ���Ϳ� �ش��ϴ� ���� �������ش�.
    String id = request.getParameter("m_id"); //id�� pw�� �����´�
	String password  = request.getParameter("m_password");
	//DB id,pw Ȯ�� - DAO.java ������ userCheck()�޼ҵ�
	DAO membership = DAO.getInstance();
    int check= membership.userCheck(id, password);
	if(check==1){  // userCheck()���� 1����ȯ�� ��������, 0�� ��й�ȣƲ��, -1���ش���̵����
		session.setAttribute("m_id",id);
		response.sendRedirect("mainform5.jsp");
	}else if(check==0){%>
	<script> 
	  alert("��й�ȣ�� ���� �ʽ��ϴ�.");
     
      //�齺���̽� 
	</script>
<%	}else{ %>
	<script>
	  alert("���̵� ���� �ʽ��ϴ�..");
	  
	 
	</script>
<%}	%>	