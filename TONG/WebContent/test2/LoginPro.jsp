<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB.bean.DAO" %>

<% 

request.setCharacterEncoding("euc-kr");%>

<%
  //request 내부객체 - 클라이언트의 요청정보를 WAS가 전달해줌
  //              - 무조건 String !
  //request 내부객체 메소드 : 이름이 id인 파라미터에 해당하는 값을 리턴해준다.
    String id = request.getParameter("id"); //id와 pw를 가져온다
	String password  = request.getParameter("password");
    
    
	//DB id,pw 확인 - DAO.java 에서의 userCheck()메소드
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
	  alert("비밀번호 또는 아이디가 맞지 않습니다.");
   history.go(-1);
    //백스페이스 
	</script>
<%	} %>