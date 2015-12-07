package obj416.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	
	private static DAO instance = new DAO();
	
	public static DAO getInstance(){
		return instance;
		
	}
	
	private DAO(){}
	
	private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");
		return ds.getConnection();
		}
	

    public int getArticleCount() throws Exception {
    	 Connection conn = null;
    	 PreparedStatement pstmt = null;
    	 ResultSet rs = null;
    	 int x = 0;
    	 
    	 try{
    		 conn = getConnection();
    		 pstmt = conn.prepareStatement("select count(*) from board");
    		 rs = pstmt.executeQuery();
    		 if (rs.next()){
    			 x = rs.getInt(1); 
    		 }
 		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		return x; 
	}
    
    public List getArticles(int start, int end)	 throws Exception {
   	 Connection conn = null;
   	 PreparedStatement pstmt = null;
   	 ResultSet rs = null;
   	 List articleList = null;
   	 
   	 try{
   		 conn = getConnection();
   		 pstmt = conn.prepareStatement("select num,writer,email,subject,passwd,reg_date,ref,re_step,re_level,content,ip,readcount,r "
   				+
				"from (select num,writer,email,subject,passwd,reg_date,ref,re_step,re_level,content,ip,readcount,rownum r " +
				"from (select num,writer,email,subject,passwd,reg_date,ref,re_step,re_level,content,ip,readcount " +
				"from board order by ref desc, re_step asc) order by ref desc, re_step asc ) where r >= ? and r <= ? ");
   		 pstmt.setInt(1, start);
   		 pstmt.setInt(2, end);
   		 rs = pstmt.executeQuery();
   		 if (rs.next()){
   			 articleList = new ArrayList(end);
   		 }
   		 do{ 
   			 DTO article = new DTO();
   			 article.setNum(rs.getInt("num"));
   			 article.setWriter(rs.getString("writer"));
   			 article.setEmail(rs.getString("email"));
   			 article.setSubject(rs.getString("subject"));
   			 article.setPasswd(rs.getString("passwd"));
   			 article.setReg_date(rs.getTimestamp("reg_date"));
   			 article.setReadcount(rs.getInt("readcount"));
   			 article.setRef(rs.getInt("ref"));
   			 article.setRe_step(rs.getInt("re_step"));
   			 article.setRe_level(rs.getInt("re_level"));
   			 article.setContent(rs.getString("content"));
   			 article.setIp(rs.getString("ip"));
   		  } while (rs.next());
   		 } catch(Exception ex) {
 			ex.printStackTrace();
 		} finally {
 			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
 			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
 			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
 		}
 		return articleList; 
    }
}
   