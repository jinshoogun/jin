<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "obj140.bean.DAO" %>

<% request.setCharacterEncoding("euc-kr");%>


<%-- 메인에서 로그인하기 위한 정보가 맞는지 확인을 하기 위해서 만들어진 jsp파일입니다.--%>
<%
    String id = request.getParameter("id");
	String pw  = request.getParameter("pw");
	// 우선 입력된 아이디와 비번은 정보를 getInstance로 통해 임시로 객체를 생성합니다.
	DAO manager = DAO.getInstance();
    int check= manager.userCheck(id,pw);
// DAO에 있는 userCheck 메소드를 통해 아이디와 비밀번호가 있는지 체크합니다.
// check값은 userCheck 메소드에 x값을 집어넣습니다.
	if(check==1){
		session.setAttribute("memId",id);
		response.sendRedirect("main.jsp");
		// x=1일 경우 세션이 연결되어서 로그인으로 하게 되고 main if문에 else문을 실행하게 됩니다.
	}else if(check==0){%>
	<script> 
	  alert("비밀번호가 맞지 않습니다.");
      history.go(-1);
   // x=0일 경우 아이디는 검색이 되었으나 DB에 비밀번호 값과 다르기 때문에 결과를 알려줍니다.
	</script>
<%	}else{ %>
	<script>
	  alert("아이디가 맞지 않습니다..");
	  history.go(-1);
	</script>
	 <%--x=-1일 경우 아이디를 검색할때 아이디결과가 DB와 다르기 때문에 x=-1값을 주고 결과를 알려줍니다.--%>
<%}	%>	