<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "obj140.bean.DAO" %>

<% request.setCharacterEncoding("euc-kr");%>


<%-- ���ο��� �α����ϱ� ���� ������ �´��� Ȯ���� �ϱ� ���ؼ� ������� jsp�����Դϴ�.--%>
<%
    String id = request.getParameter("id");
	String pw  = request.getParameter("pw");
	// �켱 �Էµ� ���̵�� ����� ������ getInstance�� ���� �ӽ÷� ��ü�� �����մϴ�.
	DAO manager = DAO.getInstance();
    int check= manager.userCheck(id,pw);
// DAO�� �ִ� userCheck �޼ҵ带 ���� ���̵�� ��й�ȣ�� �ִ��� üũ�մϴ�.
// check���� userCheck �޼ҵ忡 x���� ����ֽ��ϴ�.
	if(check==1){
		session.setAttribute("memId",id);
		response.sendRedirect("main.jsp");
		// x=1�� ��� ������ ����Ǿ �α������� �ϰ� �ǰ� main if���� else���� �����ϰ� �˴ϴ�.
	}else if(check==0){%>
	<script> 
	  alert("��й�ȣ�� ���� �ʽ��ϴ�.");
      history.go(-1);
   // x=0�� ��� ���̵�� �˻��� �Ǿ����� DB�� ��й�ȣ ���� �ٸ��� ������ ����� �˷��ݴϴ�.
	</script>
<%	}else{ %>
	<script>
	  alert("���̵� ���� �ʽ��ϴ�..");
	  history.go(-1);
	</script>
	 <%--x=-1�� ��� ���̵� �˻��Ҷ� ���̵����� DB�� �ٸ��� ������ x=-1���� �ְ� ����� �˷��ݴϴ�.--%>
<%}	%>	