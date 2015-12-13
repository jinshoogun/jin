<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "Style.DAO" %>
<%@ page import = "Style.DTO" %>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>

<% request.setCharacterEncoding("EUC-KR");

	DTO article = new DTO();
	
	String savePath = request.getRealPath("DesignerImage") + "//";  
	String encType = "EUC-KR"; 
	int maxSize = 1024*1024; 
	DefaultFileRenamePolicy dfp = new DefaultFileRenamePolicy();

	MultipartRequest mr = new MultipartRequest(request , savePath , maxSize , dfp);
	String sName = mr.getFilesystemName("Style_Photo");
	article.setStyle_Photo(sName);

	article.setStyle_Storename(mr.getParameter("Style_Storename"));
	article.setStyle_Area(mr.getParameter("Style_Area"));
	article.setStyle_Sex(mr.getParameter("Style_Sex"));
	article.setStyle_Style(mr.getParameter("Style_Style"));
	article.setStyle_Price(mr.getParameter("Style_Price"));
	article.setStyle_Myself(mr.getParameter("Style_Myself"));
	
	DAO dbPro = DAO.getInstance();
    dbPro.insertArticle(article);
    
    response.sendRedirect("Style.jsp");
%>
