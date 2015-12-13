<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ShopProduct.DTO" %>
<%@ page import="ShopProduct.DAO" %>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%
request.setCharacterEncoding("EUC-KR"); %>
<% 

   String savePath = request.getRealPath("ProductImage") + "//" ; 
   
   System.out.println("savePath  ="+savePath);
   String encType = "EUC-KR";
   int maxSize = 1024*1024;
   DefaultFileRenamePolicy dfp = new  DefaultFileRenamePolicy(); 
   
   MultipartRequest mr = new MultipartRequest(request,savePath,maxSize,encType,dfp); 
   String sName = mr.getFilesystemName("s_image");
   
   DTO aaa = new DTO();
   DAO dbPro = DAO.getInstance();
 
   
    
   aaa.setS_name(mr.getParameter("s_name"));
   aaa.setS_price(mr.getParameter("s_price"));
   aaa.setS_derail(mr.getParameter("s_derail"));
   aaa.setS_stock(mr.getParameter("s_stock"));
   aaa.setS_image(sName);
   //aaa.setS_image(mr.getParameter("s_image"));
	
	
    dbPro.insertShopProduct(aaa);
    response.sendRedirect("ProductBuy.jsp");
    %>
	