<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>

<%
String realFolder = "";//�� ���ø����̼ǻ��� ���� ���

//������ ���ε�Ǵ� ������ �����Ѵ�.
String saveFolder = "DesignerImage";  //������ ����Ǵ� �����̸�
String encType = "EUC-KR"; //���ڵ�Ÿ��
int maxSize = 1*1024*1024;  //�ִ� ���ε� ����ũ�� 1Mb

ServletContext context = getServletContext();
//���� jsp�������� �� ���ø����̼ǻ��� ���� ��θ� ���Ѵ�
realFolder = context.getRealPath(saveFolder);  
out.println("the realpath is : " + realFolder+"<br>");

try
{
   MultipartRequest multi = null;
   
   //������ ����� ������Ʈ�� �����ϰ� ������ �����Ѵ�.
   //������ ���ϸ��� ������ �ִ� ��ü, �������� ������,�ִ� ���ε�� ����ũ��, �����ڵ�, �⺻ ���� ����
   multi = new MultipartRequest(request,realFolder,maxSize,encType,new DefaultFileRenamePolicy());
   
   //Form�� �Ķ���� ����� �����´�
   Enumeration params = multi.getParameterNames();
  
   //�Ķ���͸� ����Ѵ�
   while(params.hasMoreElements()){ 
      String name = (String)params.nextElement(); //���۵Ǵ� �Ķ�����̸�
      String value = multi.getParameter(name);    //���۵Ǵ� �Ķ���Ͱ�  
   }

   //������ ���� ������ ������ ����Ѵ�
   Enumeration files = multi.getFileNames();
   
   //���� ������ �ִٸ�
   while(files.hasMoreElements()){
    //input �±��� �Ӽ��� file�� �±��� name �Ӽ��� :�Ķ�����̸�
      String name = (String)files.nextElement();
   
   //������ ����� ���� �̸�
      String filename = multi.getFilesystemName(name);
   
   //������ ������ ���� �̸�
      String original = multi.getOriginalFileName(name);
   
   //���۵� ������ ���� Ÿ��
      String type = multi.getContentType(name);
      
   //���۵� ���� �Ӽ��� file�� �±��� name �Ӽ����� �̿��� ���� ��ü ����
      File file = multi.getFile(name);
   }
}catch(IOException ioe){
 System.out.println(ioe);
}catch(Exception ex){
 System.out.println(ex);
}

response.sendRedirect("designer_update.jsp");
%>

