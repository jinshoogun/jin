<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "DATADB.bean.DAO" %>

<% 

request.setCharacterEncoding("EUC-KR");%>

<%
  //request ���ΰ�ü - Ŭ���̾�Ʈ�� ��û������ WAS�� ��������
  //              - ������ String !
  //request ���ΰ�ü �޼ҵ� : �̸��� id�� �Ķ���Ϳ� �ش��ϴ� ���� �������ش�.
    String id = request.getParameter("d_id"); //id�� pw�� �����´�
	String password  = request.getParameter("d_password");
	//DB id,pw Ȯ�� - DAO.java ������ userCheck()�޼ҵ�
	DAO designer = DAO.getInstance();
    int check= designer.userCheck(id, password);
   
	if(check==1){  // userCheck()���� 1����ȯ�� ��������, 0�� ��й�ȣƲ��, -1���ش���̵����
		session.setAttribute("d_id",id);
		response.sendRedirect("D_Main.jsp");
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