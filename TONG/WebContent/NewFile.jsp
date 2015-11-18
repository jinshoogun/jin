<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
 
<script type="text/javascript">
    function pro()
    {
        var re=confirm("로그아웃 하시겠습니까");
    
        if(re)
        {        
            alert("로그아웃 되었습니다");
        }
        else
        {
            alert("로그아웃을 취소하였습니다");
        }
    }
 
 
</script>
 
 
 
</head>
 
<body>
 
<input type="button" value="로그아웃" onclick="pro()"/>
 
</body>
</html>[출처] 자바스크립트 기초4-Math객체,prompt(),confirm() |작성자 나나



