<%@ page contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "Style.DAO" %>
<%@ page import = "Style.DTO" %>
<%@ page import = "Style.rDAO" %>
<%@ page import = "java.util.Calendar" %>
<%@ include file="../test2/mainform5.jsp" %>
<%
request.setCharacterEncoding("EUC-KR"); %>
<html>
<head>
<title>����</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>


</head>


<% 

   Calendar now = Calendar.getInstance();
   Calendar fin = Calendar.getInstance();
   int year , month , day , hour , min ;
   

  int r_num=0;
  int num = Integer.parseInt(request.getParameter("num"));

  String pageNum = request.getParameter("pageNum");

 
  String name = (String)session.getAttribute("m_name");
  String phone = (String)session.getAttribute("m_phone");
  String password = (String)session.getAttribute("m_password");

  String storename = (String)session.getAttribute("storename");
  String storeid = (String)session.getAttribute("storeid");
  String designer = (String)session.getAttribute("nickname");
  String style = (String)session.getAttribute("style");
  String cost = (String)session.getAttribute("cost");
  

  try{  
     
     DAO dbPro = DAO.getInstance();
      DTO article =  dbPro.getArticle(num); 
     
     
    if(request.getParameter("r_num")!=null){
   r_num = Integer.parseInt(request.getParameter("r_num"));
   }
    
    
%>
   
<body  >  
<center><b>�����ϱ�</b>
<br>
<form method="post" name="reserveForm" action="ReservePro.jsp" onsubmit="return writeSave()">
<input type="hidden" name="r_num" value="<%=r_num%>">

<table width="400" border="1" cellspacing="0" cellpadding="0"    align="center">
   <tr>
    <td align="right" colspan="2"  >
       <a href="../test2/mainform6.jsp?pageNum=<%=pageNum%>"> �۸�� </a> </td> 
       
   </tr>
   <tr>
   <td align="center" colspan="2" >
       
 �ؿ���ð� 10���� �ش� ������ ������ �ϰų� �����ϼž� �մϴ�.<br>
 ���� �ð��� ���� �ֹ� ������ �ڵ����� ��ҵǿ��� �˾Ƽ� ��...!!!
            </td>
            </tr>
            
  
  <tr>
    <td  width="70"    align="center">�� ��</td>
    <td  width="330"> <%=session.getAttribute("m_id")%>
    
       <input type="hidden" name="r_name" value=<%=session.getAttribute("m_id")%>>
    </td>
  </tr>
  <tr>
    <td  width="70"    align="center">���̵�</td>
    <td  width="330"> <%=article.getStyle_storeid()%>
    
       <input type="hidden" name="r_id" value="<%=article.getStyle_storeid()%>">
    </td>
  </tr>
  <tr>
    <td  width="70"    align="center">�޴���ȭ</td>
    <td  width="330"> 
    <input type="text" name="r_phone">
    </td>
  </tr>
  
  <tr>
    <td  width="70"    align="center">��</td>
    <td  width="330"> <%=article.getStyle_Storename()%>
    
       <input type="hidden" name="r_store" value="<%=article.getStyle_Storename()%>"></td>
  </tr>
  
  
  <tr>
    <td  width="70"    align="center">�����̳� id</td>
    <td  width="330"> <%=article.getStyle_Nickname()%>
    
       <input type="hidden" name="r_designer" value="<%=article.getStyle_Nickname()%>"></td>
  </tr>
  
  
  <tr>
    <td  width="70"    align="center">�����̳�</td>
    <td  width="330"> <%=article.getStyle_Nickname()%>
    
       <input type="hidden" name="r_designer" value="<%=article.getStyle_Nickname()%>"></td>
  </tr>
  <tr>
    <td  width="70"    align="center">��Ÿ��</td>
    <td  width="330"> <%=article.getStyle_Style()%>
    
    <input type="hidden" name="r_style" value="<%=article.getStyle_Style()%>"></td>
  </tr>
  <tr>
    <td  width="70"    align="center">����</td>
    <td  width="330"> <%=article.getStyle_Price()%>
    
    <input type="hidden" name="r_cost" value="<%=article.getStyle_Price()%>"></td>
  </tr>
 <tr>
    <td  width="70"    align="center">���� �ð�</td>
    <td  width="330">
    <select name="r_date" onChange="checkValue();">
   <%
   for (int i=0; i<7; i++){
      year = now.get(Calendar.YEAR);
      month = now.get(Calendar.MONDAY) +1;
      day = now.get(Calendar.DATE);
      
      //if month prints just 1 digit num, add 0 at the begging, so it could print 01, 02, etc��
      String tempMonth = "";
      if (month < 10){
         tempMonth = "0" +month;
      } else {
         tempMonth = String.valueOf(month);
      }
      
      //if date prints just 1 digit num, add 0 at the begging , so it could print 01, 02, etc��
      String tempDay = "";
      if(day < 10) {
         tempDay = "0"+day;
      } else {
         tempDay = String.valueOf(day);
      }
      %>
      <option value="<%=year+tempMonth+tempDay%>"><%=year %>�� <%=month %>�� <%=day %>�� </option>
      <% 
      //get next date
      now.add(Calendar.DATE, 1);
   }
   %>
</select>
<select name="r_start" onChange="checkValue();">
   <%
   for (int i=10; i<22; i++){
      

      %>
      <option value=<%=i%>><%=i %>��</option>
      <% 
      
   }
   %>
   
</select>~ 
<select name="r_end" onChange="checkValue();">
   <%
   for (int i=11; i<23; i++){
      

      %>
      <option value=<%=i%>><%=i%>��</option>
      <% 
      
   }
   %>
   
</select>



  </td>
  </tr>
 </td>
 </tr>
  <tr>
    <td  width="70"    align="center" >���ǻ���</td>
    <td  width="330" >
     <textarea name="r_subject" rows="13" cols="40"></textarea> </td>
  </tr>
  <tr>
    <td  width="70"    align="center" >��й�ȣ</td>
    <td  width="330" >
     <input type="password" size="8" maxlength="12" name="r_password" > 
    </td>
  </tr>
<tr>      
 <td colspan=2   align="center"> 
  <input type="submit" value="�۾���" >  
  <input type="reset" value="�ٽ��ۼ�">
 
</td></tr></table>    
 <%
  }catch(Exception e){}
%>     
</form>      
</body>
</html>