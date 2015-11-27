package Style;

import java.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.catalina.connector.Request;

import Style.DTO;
import Style.DAO;

public class DAO {

	private static DAO instance = new DAO();
	
	public static DAO getInstance(){
		return instance;
	}
	
	private DAO() {
	}
	
	private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");
		return ds.getConnection();
	}
	

public void insertArticle(DTO article) throws Exception {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = article.getNum();
		int number=0;
		String sql="";
		
		try {
			conn = getConnection(); 
			pstmt = conn.prepareStatement("select max(num) from STYLE");
			rs = pstmt.executeQuery();
			if (rs.next()) 
				number=rs.getInt(1)+1;	
			else
				number=1; 
 
			sql = "insert into STYLE(PHOTO,STORENAME,AREA,SEX,";
			sql+="STYLE,PRICE,MYSELF,NUM) values(?,?,?,?,?,?,?,Style_seq.NEXTVAL)";
				pstmt = conn.prepareStatement(sql);
				
			pstmt.setString(1, article.getStyle_Photo());
			pstmt.setString(2, article.getStyle_Storename());
			pstmt.setString(3, article.getStyle_Area());
			pstmt.setString(4, article.getStyle_Sex());
			pstmt.setString(5, article.getStyle_Style());
			pstmt.setString(6, article.getStyle_Price());
			pstmt.setString(7, article.getStyle_Myself());
			pstmt.executeUpdate();
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
	}

public int getArticleCount() throws Exception {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int x=0;
	try {
		conn = getConnection();
		pstmt = conn.prepareStatement("select count(*) from Style");
		rs = pstmt.executeQuery();
		if (rs.next()) {
			x= rs.getInt(1); 
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


public List getArticles(int start, int end) throws Exception {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	List articleList=null;
	try {
		conn = getConnection();
		pstmt = conn.prepareStatement("select NUM,PHOTO,STORENAME,AREA,SEX,STYLE,PRICE,MYSELF "
					     + "from (select NUM,PHOTO,STORENAME,AREA,SEX,STYLE,PRICE,MYSELF,rownum r "
					     + "from (select NUM,PHOTO,STORENAME,AREA,SEX,STYLE,PRICE,MYSELF "
					     + "from Style)) where r>=? and r<=?");
			    
				pstmt.setInt(1, start); 
				pstmt.setInt(2, end); 

				rs = pstmt.executeQuery();
				if (rs.next()) {
					articleList = new ArrayList(end); 
					do{ 
						DTO article= new DTO();
						article.setNum(rs.getInt("num"));
						article.setStyle_Photo(rs.getString("PHOTO"));
						article.setStyle_Storename(rs.getString("STORENAME"));
						article.setStyle_Area(rs.getString("AREA"));
						article.setStyle_Sex(rs.getString("SEX"));
						article.setStyle_Style(rs.getString("STYLE"));
						article.setStyle_Price(rs.getString("PRICE"));
						article.setStyle_Myself(rs.getString("MYSELF"));
						articleList.add(article); 
					}while(rs.next());
				}
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

