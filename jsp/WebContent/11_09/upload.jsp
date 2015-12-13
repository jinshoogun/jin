<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = " com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import = " com.oreilly.servlet.MultipartRequest"%>


<h2> 업로드 처리...!!!</h2>

<% request.setCharacterEncoding("euc-kr");
String savePath = request.getRealPath("save") +"//";
String enc = "euc-kr";
int maxSize = 1024*1024*5;
DefaultFileRenamePolicy dfp = new DefaultFileRenamePolicy();



MultipartRequest mr = new MultipartRequest (request,savePath, maxSize, enc, dfp);

String name = mr.getParameter("name");
String sName = mr.getFilesystemName("save");
String oName = mr.getOriginalFileName("save");
String type = mr.getContentType("save");



out.println(name);
out.println(sName);
out.println(oName);
out.println(type);

 %>