 package DATADB.bean;
 
 import java.sql.*;
 import javax.sql.*;
 import javax.naming.*;
 import java.util.*;
 
 public class eDAO {
    
 	private static eDAO instance = new eDAO();
    
    public static eDAO getInstance() {
        return instance;
    }
    
    private eDAO() {
    }
    
    private Connection getConnection() throws Exception {
      Context initCtx = new InitialContext();
      Context envCtx = (Context) initCtx.lookup("java:comp/env");
      DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");
      return ds.getConnection();
    }
 
    public void insertArticle(DTO article) 
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
		ResultSet rs = null;

		int num=article.getE_num();
		int ref=article.getE_ref();
		int re_step=article.getE_re_step();
		int re_level=article.getE_re_level();
		int number=0;
        String sql="";

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement("select max(e_num) from event");
			rs = pstmt.executeQuery();
			
			if (rs.next())
		      number=rs.getInt(1)+1;
		    else
		      number=1; 
		   
		    if (num!=0)
		    {  
		      sql="update event set e_re_step=e_re_step+1 where e_ref= ? and e_re_step> ?";
              pstmt = conn.prepareStatement(sql);
              pstmt.setInt(1, ref);
			  pstmt.setInt(2, re_step);
			  pstmt.executeUpdate();
			  re_step=re_step+1;
			  re_level=re_level+1;
		     }else{
		  	  ref=number;
			  re_step=0;
			  re_level=0;
		     }
            sql = "insert into event(e_num,e_writer,e_subject,e_content,e_password,";
		    sql+="e_ref,e_re_step,e_re_level,e_reg_date) values(event_seq.NEXTVAL,?,?,?,?,?,?,?,sysdate)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, article.getE_writer());
            pstmt.setString(2, article.getE_subject());
			pstmt.setString(3, article.getE_content());
            pstmt.setString(4, article.getE_password());
            pstmt.setInt(5, ref);
            pstmt.setInt(6, re_step);
            pstmt.setInt(7, re_level);
			
            pstmt.executeUpdate();
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }
    
	public int getArticleCount()
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        int x=0;

        try {
            conn = getConnection();
            
            pstmt = conn.prepareStatement("select count(*) from event");
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

	public List getArticles(int start, int end)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List articleList=null;
        try {
            conn = getConnection();
            
            pstmt = conn.prepareStatement(
            		"select e_num,e_writer,e_subject,e_content,e_password,e_readcount,e_reg_date,e_ref,e_re_step,e_re_level,r "+
        					"from (select e_num,e_writer,e_subject,e_content,e_password,e_readcount,e_reg_date,e_ref,e_re_step,e_re_level,rownum r " +
        					"from (select e_num,e_writer,e_subject,e_content,e_password,e_readcount,e_reg_date,e_ref,e_re_step,e_re_level " +
        					"from event order by e_ref desc, e_re_step asc) order by e_ref desc, e_re_step asc ) where r >= ? and r <= ? ");
            pstmt.setInt(1, start);
			pstmt.setInt(2, end);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                articleList = new ArrayList(end);
                do{
                  DTO article= new DTO();
				  article.setE_num(rs.getInt("e_num"));
				  article.setE_writer(rs.getString("e_writer"));
                  article.setE_subject(rs.getString("e_subject"));
                  article.setE_content(rs.getString("e_content"));
                  article.setE_password(rs.getString("e_password"));
				  article.setE_readcount(rs.getInt("e_readcount"));
			      article.setE_reg_date(rs.getTimestamp("e_reg_date"));
                  article.setE_ref(rs.getInt("e_ref"));
                  article.setE_re_step(rs.getInt("e_re_step"));
				  article.setE_re_level(rs.getInt("e_re_level"));
				  
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
 
    public DTO getArticle(int num)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        DTO article=null;
        try {
            conn = getConnection();

            pstmt = conn.prepareStatement(
            	"update event set e_readcount=e_readcount+1 where e_num = ?");
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

            pstmt = conn.prepareStatement(
            	"select * from event where e_num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                article = new DTO();
                article.setE_num(rs.getInt("e_num"));
				article.setE_writer(rs.getString("e_writer"));
                article.setE_subject(rs.getString("e_subject"));
                article.setE_content(rs.getString("e_content")); 
                article.setE_password(rs.getString("e_password"));
				article.setE_readcount(rs.getInt("e_readcount"));
			    article.setE_reg_date(rs.getTimestamp("e_reg_date"));
                article.setE_ref(rs.getInt("e_ref"));
                article.setE_re_step(rs.getInt("e_re_step"));
				article.setE_re_level(rs.getInt("e_re_level"));   
			}
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
		return article;
    }

    public DTO updateGetArticle(int num)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        DTO article=null;
        try {
            conn = getConnection();

            pstmt = conn.prepareStatement(
            	"select * from event where e_num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                article = new DTO();
                article.setE_num(rs.getInt("e_num"));
				article.setE_writer(rs.getString("e_writer"));
                article.setE_subject(rs.getString("e_subject"));
                article.setE_content(rs.getString("e_content"));
                article.setE_password(rs.getString("e_password"));
				article.setE_readcount(rs.getInt("e_readcount"));
			    article.setE_reg_date(rs.getTimestamp("e_reg_date"));
                article.setE_ref(rs.getInt("e_ref"));
                article.setE_re_step(rs.getInt("e_re_step"));
				article.setE_re_level(rs.getInt("e_re_level"));
			}
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
		return article;
    }

    public int updateArticle(DTO article)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs= null;

        String dbpasswd="";
        String sql="";
		int x=-1;
        try {
            conn = getConnection();
            
			pstmt = conn.prepareStatement(
            	"select e_password from event where e_num = ?");
            pstmt.setInt(1, article.getE_num());
            rs = pstmt.executeQuery();
            
			if(rs.next()){
			  dbpasswd= rs.getString("e_password"); 
			  if(dbpasswd.equals(article.getE_password())){
                sql="update event set e_writer=?,e_subject=?,e_password=?";
			    sql+=",e_content=? where e_num=?";
                pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, article.getE_writer());
                pstmt.setString(3, article.getE_subject());
                pstmt.setString(4, article.getE_password());
                pstmt.setString(5, article.getE_content());
			    pstmt.setInt(6, article.getE_num());
                pstmt.executeUpdate();
				x= 1;
			  }else{
				x= 0;
			  }
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
    
    public int deleteArticle(int num, String password)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs= null;
        String dbpasswd="";
        int x=-1;
        try {
			conn = getConnection();

            pstmt = conn.prepareStatement(
            	"select e_password from event where e_num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
            
			if(rs.next()){
				dbpasswd= rs.getString("e_password"); 
				if(dbpasswd.equals(password)){
					pstmt = conn.prepareStatement(
            	      "delete from event where e_num=?");
                    pstmt.setInt(1, num);
                    pstmt.executeUpdate();
					x= 1;
				}else
					x= 0;
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
    
    public List getMyList(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List articleList=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from event where e_writer=? order by e_reg_date");
					
			        pstmt.setString(1, id);

					rs = pstmt.executeQuery();
					if (rs.next()) {
						articleList = new ArrayList(); 
						do{ 
							DTO article= new DTO();
							article.setE_num(rs.getInt("e_num"));
							article.setE_writer(rs.getString("e_writer"));
							article.setE_subject(rs.getString("e_subject"));
							article.setE_content(rs.getString("e_content"));
							article.setE_password(rs.getString("e_password"));
							article.setE_readcount(rs.getInt("e_readcount"));
							article.setE_reg_date(rs.getTimestamp("e_reg_date"));
							article.setE_ref(rs.getInt("e_ref"));
							article.setE_re_step(rs.getInt("e_re_step"));
							article.setE_re_level(rs.getInt("e_re_level"));
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
    
    
    public void insertComment(DTO article) 
    	    throws Exception {
    	        Connection conn = null;
    	        PreparedStatement pstmt = null;
    			ResultSet rs = null;

    			int cmtenum=article.getE_num();
    			int number=0;
    	        String sql="";

    	        try {
    	            conn = getConnection();
    	            pstmt = conn.prepareStatement("select max(cmte_num) from commentevent");
    				rs = pstmt.executeQuery();
    				
    				if (rs.next()) {
    			      number=rs.getInt(1)+1;
    				} else {
    			      number=1; 
    				}
    				  
    	            sql = "insert into commentevent(cmte_num,cmte_writer,cmte_content,";
    			    sql+="cmte_ref,cmte_reg_date) values(commentevent_seq.NEXTVAL,?,?,?,sysdate)";

    	            pstmt = conn.prepareStatement(sql);
    	            pstmt.setString(1, article.getCmte_writer());
    				pstmt.setString(2, article.getCmte_content());
    	            pstmt.setInt(3, article.getCmte_ref());
    				
    	            pstmt.executeUpdate();
    	            
    	        } catch(Exception ex) {
    	            ex.printStackTrace();
    	        } finally {
    				if (rs != null) try { rs.close(); } catch(SQLException ex) {}
    	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
    	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
    	        }
    	    }
    public List getComment(int start, int end)
    	    throws Exception {
    	        Connection conn = null;
    	        PreparedStatement pstmt = null;
    	        ResultSet rs = null;
    	        List commentList=null;
    	        
    	        try {
    	            conn = getConnection();
    	            
    	            pstmt = conn.prepareStatement(
    	            		"select cmte_num,cmte_writer,cmte_content,cmte_reg_date,cmte_ref,r "+
    	        					"from (select cmte_num,cmte_writer,cmte_content,cmte_reg_date,cmte_ref,rownum r " +
    	        					"from (select cmte_num,cmte_writer,cmte_content,cmte_reg_date,cmte_ref " +
    	        					"from commentevent order by cmte_num desc, cmte_ref asc) order by cmte_num desc, cmte_ref asc) where r = e_num and r <= ? ");
    	            pstmt.setInt(1, start);
    				pstmt.setInt(2, end);
    	            rs = pstmt.executeQuery();

    	            if (rs.next()) {
    	                commentList = new ArrayList(end);
    	                do{
    	                  DTO comment= new DTO();
    	                  comment.setE_num(rs.getInt("cmte_num"));
    	                  comment.setE_writer(rs.getString("cmte_writer"));
    	                  comment.setE_content(rs.getString("cmte_content"));
    	                  comment.setE_reg_date(rs.getTimestamp("cmte_reg_date"));
    	                  comment.setE_ref(rs.getInt("cmte_ref"));
    					  
    	                  commentList.add(comment);
    				    }while(rs.next());
    				}
    	        } catch(Exception ex) {
    	            ex.printStackTrace();
    	        } finally {
    	            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
    	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
    	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
    	        }
    			return commentList;
    	    }
    
    public DTO getComment(int Cmte_ref)
    	    throws Exception {
    	        Connection conn = null;
    	        PreparedStatement pstmt = null;
    	        ResultSet rs = null;
    	        DTO comment=null;
    	        try {
    	            conn = getConnection();
    	            
    	            pstmt = conn.prepareStatement(
    	            	"select * from commentevent where cmte_ref = ?");
    	            pstmt.setInt(1, Cmte_ref);
    	            rs = pstmt.executeQuery();

    	            if (rs.next()) {
    	            	comment = new DTO();
    	            	comment.setE_num(rs.getInt("cmte_num"));
  	                  comment.setE_writer(rs.getString("cmte_writer"));
  	                  comment.setE_content(rs.getString("cmte_content"));
  	                  comment.setE_reg_date(rs.getTimestamp("cmte_reg_date"));
  	                  comment.setE_ref(rs.getInt("cmte_ref")); 
    				}
    	        } catch(Exception ex) {
    	            ex.printStackTrace();
    	        } finally {
    	            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
    	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
    	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
    	        }
    			return comment;
    	    }
    
    public int getcommentCount()
    	    throws Exception {
    	        Connection conn = null;
    	        PreparedStatement pstmt = null;
    	        ResultSet rs = null;

    	        int x=0;

    	        try {
    	            conn = getConnection();
    	            
    	            pstmt = conn.prepareStatement("select count(*) from commentevent");
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
    public DTO e_comment(int id) throws Exception {
        //id와 pw를 받아와 selet문을 이용하여 아이디가 있으면 x값에 0을 넣고 없으면 -1넣는다.loginpro에서 if조건문을 돌려 0이면 로그인다른숫자면 오류 출력
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        DTO manager = null;
           
        try {
           conn = getConnection();

           pstmt = conn.prepareStatement("select * from commentevent where cmte_ref = ?"); //go2테이블에 id값1,id를 넣어 pw값을 확인
           pstmt.setInt(1, id);
           rs = pstmt.executeQuery();

           if (rs.next()) {
              manager = new DTO();
              manager.setCmte_num(rs.getInt("cmte_num"));
              manager.setCmte_writer(rs.getString("cmte_writer"));
              manager.setCmte_content(rs.getString("cmte_content"));
              manager.setCmte_reg_date(rs.getTimestamp("cmte_reg_date"));
              
           }

        } catch (Exception ex) {//try catch닫기
           ex.printStackTrace();
        } finally {
           if (rs != null)
              try {
                 rs.close();
              } catch (SQLException ex) {
              }
           if (pstmt != null)
              try {
                 pstmt.close();
              } catch (SQLException ex) {
              }
           if (conn != null)
              try {
                 conn.close();
              } catch (SQLException ex) {
              }
        }
        return manager;

	}
    
 }