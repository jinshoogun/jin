<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import = "DATADB1.bean.DAO" %>

<% 

request.setCharacterEncoding("euc-kr");%>
<%
  //request 내부객체 - 클라이언트의 요청정보를 WAS가 전달해줌
  //              - 무조건 String !
  //request 내부객체 메소드 : 이름이 id인 파라미터에 해당하는 값을 리턴해준다.
    String id = request.getParameter("m_id"); //id와 pw를 가져온다
	String password  = request.getParameter("m_password");
	//DB id,pw 확인 - DAO.java 에서의 userCheck()메소드
	DAO membership = DAO.getInstance();
    int check= membership.userCheck(id, password);
    System.out.println(":aaaaaa"+check);
	if(check==1){  // userCheck()에서 1을반환시 인증성공, 0은 비밀번호틀림, -1은해당아이디없음
		session.setAttribute("m_id",id);
		response.sendRedirect("main.jsp");
	}else if(check==0){%>
	<script> 
	  alert("비밀번호가 맞지 않습니다.");
     
      //백스페이스 
	</script>
<%	}else{ %>
	<script>
	  alert("아이디가 맞지 않습니다..");
	  
	 
	</script>
<%}	%>	