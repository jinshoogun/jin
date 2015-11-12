package DATADB.bean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.*;
import javax.naming.*;


public class DAO {
	private static DAO instance = new DAO();
    
    public static DAO getInstance() {
        return instance;
    }
    
    private DAO() {
    }
    //리소스 관리
	private Connection getConnection() throws Exception {
		
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");  //자바로 설정된 걸 찾는다.
		DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");  //자바로된 부분중에 jdbc로된걸 찾는다.고정된이름이라 외어야함
		return ds.getConnection();
	}
	
	//insert()메소드
	public void insertMembership(DTO membership){
		Connection conn =null;
		PreparedStatement pstmt = null;
		try {
			conn=getConnection();//커넥션 연결
			//쿼리생성!
			pstmt = conn.prepareStatement( "insert into MEMBERSHIP values(?,?,?,?,?,?,?,?)");
			
			pstmt.setString(1,membership.getM_id());
			pstmt.setString(2,membership.getM_password());
			pstmt.setString(3,membership.getM_name());
			pstmt.setString(4,membership.getM_email());
			pstmt.setString(5,membership.getM_sex());
			pstmt.setString(6,membership.getM_birth());
			pstmt.setString(7,membership.getM_phone());
			pstmt.setTimestamp(8,membership.getM_reg());
			
			
			//쿼리실행!!
			pstmt.executeQuery();
		} catch (Exception e) { //예외처리
			e.printStackTrace();

		} finally {
			
			try {if (pstmt != null) {pstmt.close();}} catch (SQLException e) {}
			try {if (conn != null) {conn.close();}} catch (SQLException e) {}
		}
			
		
		
		
	}
	public int userCheck(String m_id, String m_password) 
			throws Exception {
				Connection conn = null;
		        PreparedStatement pstmt = null;
				ResultSet rs= null;
		        String dbpasswd="";
				int x=-1;
		        
				try {
		            conn = getConnection();
		            
		            pstmt = conn.prepareStatement(
		            	"select m_password from MEMBERSHIP where m_id = ?");
		            pstmt.setString(1, m_id);
		            rs= pstmt.executeQuery();

					if(rs.next()){
						dbpasswd= rs.getString("m_password"); 
						if(dbpasswd.equals(m_password))
							x= 1; //인증 성공
						else
							x= 0; //비밀번호 틀림
					}else
						x= -1;//해당 아이디 없음
					
		        } catch(Exception ex) {
		            ex.printStackTrace();
		        } finally {
					if (rs != null) try { rs.close(); } catch(SQLException ex) {}
		            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
		            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		        }
				return x;
			}


	public int ConfirmId(String m_id)  //중복확인 메소드
	 throws Exception {
		 Connection conn = null;
		 PreparedStatement pstmt= null;
		 ResultSet rs = null;
		 String dbpasswd="";
		 int x=-1;
		 
		 try {
			 conn = getConnection();  //커넥션 연결
			 
			 pstmt = conn.prepareStatement("select m_id from MEMBERSHIP where m_id =?");
			                               //ID를 입력하고 그에해당하는 ID를 가져옴.
			 
			 pstmt.setString(1, m_id);
			
			 rs=pstmt.executeQuery();
			 
			 if(rs.next()) //rs에 저장된 결과가 있으면 if문실행 없으면 else문 실행
				 x=1; //해당아이디 있음
			 else
				 x=-1; //해당아이디없음
			 
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }finally {
			 if (rs != null) try { rs.close(); } catch(SQLException ex) {}
	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		 }
		 return x;
		 
	 }
	
		    
	public int deleteMembership (String m_id,String m_password)
	     throws Exception {
		 Connection conn = null;
	        PreparedStatement pstmt = null;
	        ResultSet rs= null;
	        String dbpasswd="";
	        int x=-1;
	        try {
				conn = getConnection();  //커넥션 연결
	            pstmt = conn.prepareStatement("select m_password from MEMBERSHIP where m_id = ?");
	            //쿼리 생성, 해당하는 아이디에 맞는 pw를 가져온다 -> dbpasswd변수에 대입한다.
	            pstmt.setString(1, m_id);
	            rs = pstmt.executeQuery();
				if(rs.next()){
					dbpasswd= rs.getString("m_password"); 
					System.out.println(m_password + dbpasswd);
					if(dbpasswd.equals(m_password)){  //equals 함수를 사용해서 퀴리문을 통해 가져온dbpassword와 pw를 비교하여 동일하면 delete문 실행
						pstmt = conn.prepareStatement(
	            	      "delete from MEMBERSHIP where m_id=?");
	                    pstmt.setString(1, m_id);
	                    pstmt.executeUpdate();
						x= 1; //회원탈퇴 성공
					}else
						x= 0; //비밀번호 틀림
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
	public DTO getMembership(String m_id)  //회원정보 수정시, 정보를 가져오는 메서드
			throws Exception {
				Connection conn = null;
				PreparedStatement pstmt =null;
				ResultSet rs = null;
				DTO membership =null;
				
				try {
					conn =getConnection(); // 커넥션 연결
					
					pstmt = conn.prepareStatement("select *from MEMBERSHIP where m_id =?"); //해당아이디의 정보를 찾음
					
					pstmt.setString(1, m_id);
					rs=pstmt.executeQuery();
					
					if(rs.next()) { //getString("id")에서 이름을 DB정보랑 동일하게 해야하며 , next() = 커서를 다음걸로 넘겨주는 
						membership = new DTO();
						
						membership.setM_id(rs.getString("m_id"));
						membership.setM_password(rs.getString("m_password"));
						membership.setM_name(rs.getString("m_name"));
						membership.setM_email(rs.getString("m_email"));
						membership.setM_sex(rs.getString("m_sex"));
						membership.setM_birth(rs.getString("m_birth"));
						membership.setM_phone(rs.getString("m_phone"));
						membership.setM_reg(rs.getTimestamp("m_reg"));
						
						
					}
				}catch(Exception ex) {
					ex.printStackTrace();
				}finally {
					if (rs!=null) try { rs.close(); }catch(SQLException ex) {}
					if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			        if (conn != null) try { conn.close(); } catch(SQLException ex) {}		
				}
				return membership;
				
			}

			public void updateMembership(DTO membership) //회원정보 수정 메서드 
			throws Exception {
				Connection conn = null;
				PreparedStatement pstmt = null ;
				
				try {
					conn = getConnection(); //커넥션 연결
					
				    pstmt = conn.prepareStatement("update MEMBERSHIP set m_password=?,m_name=?,m_email=?");
				                           //update 테이블명 set컬럼명=값, 컬럼명=값...
				                           //여러컬럼을 변경하려면 쉼표로 구분하여 set위치에 써준다
				    pstmt.setString(1,membership.getM_password());
				    pstmt.setString(2, membership.getM_name());
				    pstmt.setString(3, membership.getM_email());
				    
				    pstmt.executeQuery();
				    
				    }catch(Exception ex) {
				    	ex.printStackTrace();
				    }finally {
				    	 if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
				         if (conn != null) try { conn.close(); } catch(SQLException ex) {}
				    }
				
			}
			public void insertArticle(DTO article) throws Exception {
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				int q_num=article.getQ_num();
				int q_ref=article.getQ_ref();
				int q_re_step=article.getQ_re_step();
				int q_re_level=article.getQ_re_level();
				int number=0;
				
				String sql="";
				try {
					conn = getConnection(); 
					pstmt = conn.prepareStatement("select max(Q_num) from QNA");
					//글의 그룹번호를 지정하기 위해 사용?
					rs = pstmt.executeQuery();
					if (rs.next()) 
						number=rs.getInt(1)+1;	
					else
						number=1; 
					// writeForm에 int num=0,ref=1,re_step=0,re_level=0;로 시작하기 때문에 참조해서 이해보세욧
					if (q_num!=0) 
					{ 
						sql="update qna set q_re_step=q_re_step+1 where q_ref= ? and q_re_step> ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, q_ref);
						pstmt.setInt(2, q_re_step);
						pstmt.executeUpdate();
						q_re_step=q_re_step+1;
						q_re_level=q_re_level+1;

					}else{ 
						q_ref=number;				// 0   16y 
						q_re_step=0;
						q_re_level=0;
					}
					
					sql = "insert into qna(q_num,q_writer,q_subject,q_content,q_password2, ";
					sql+="q_readcount,q_ref,q_re_step,q_re_level,q_reg_date) values(QnA_seq.NEXTVAL,?,?,?,?,?,?,?,?,sysdate)";
						pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, article.getQ_writer());
					pstmt.setString(2, article.getQ_subject());
					pstmt.setString(3, article.getQ_content());
					pstmt.setString(4, article.getQ_password2());
					pstmt.setInt(5, article.getQ_readcount());
					pstmt.setInt(6, q_ref);
					pstmt.setInt(7, q_re_step);
					pstmt.setInt(8, q_re_level);
					pstmt.executeUpdate();

				} catch(Exception ex) {
					ex.printStackTrace();
				} finally {
					if (rs != null) try { rs.close(); } catch(SQLException ex) {}
					if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
					if (conn != null) try { conn.close(); } catch(SQLException ex) {}
				}
			}
			
			public DTO getArticle(int q_num) throws Exception {
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				DTO article=null;
				try {
					conn = getConnection();
					pstmt = conn.prepareStatement(
					"update QnA set q_readcount=q_readcount+1 where q_num = ?"); 
					// 조회수를 미리 올라가기 합니다. 읽었다는 증거를 하기 위해서
					pstmt.setInt(1, q_num);
					pstmt.executeUpdate();
					pstmt = conn.prepareStatement(
					"select * from QnA where Q_num = ?"); 
					pstmt.setInt(1, q_num);
					rs = pstmt.executeQuery();
					if (rs.next()) {
						article = new DTO();
						article.setQ_num(rs.getInt("q_num"));
						article.setQ_writer(rs.getString("q_writer"));
						article.setQ_subject(rs.getString("q_subject"));
						article.setQ_password2(rs.getString("q_password2"));
						article.setQ_reg_date(rs.getTimestamp("q_reg_date"));
						article.setQ_readcount(rs.getInt("q_readcount"));
						article.setQ_ref(rs.getInt("q_ref"));
						article.setQ_re_step(rs.getInt("q_re_step"));
						article.setQ_re_level(rs.getInt("q_re_level"));
						article.setQ_content(rs.getString("q_content"));
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

			public int getArticleCount() throws Exception {
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				int x=0;
				try {
					conn = getConnection();
					pstmt = conn.prepareStatement("select count(*) from QnA");
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
					pstmt = conn.prepareStatement(
							"select q_num, q_writer,q_subject,q_password2,q_reg_date,q_ref,q_re_step, q_re_level, q_content,q_readcount,r "
							+
							"from (select q_num, q_writer,q_subject, q_password2,q_reg_date, q_ref, q_re_step,q_re_level, q_content, q_readcount,rownum r " +
							"from (select q_num,q_writer,q_subject, q_password2, q_reg_date,q_ref, q_re_step, q_re_level, q_content, q_readcount " +
							"from qnA order by q_ref desc, q_re_step asc) order by q_ref desc, q_re_step asc ) where r >= ? and r <= ? ");
							pstmt.setInt(1, start); 
							pstmt.setInt(2, end); 

							rs = pstmt.executeQuery();
							if (rs.next()) {
								articleList = new ArrayList(end); 
								do{ 
									DTO article= new DTO();
									article.setQ_num(rs.getInt("q_num"));
									article.setQ_writer(rs.getString("q_writer"));
									article.setQ_subject(rs.getString("q_subject"));
									article.setQ_password2(rs.getString("q_password2"));
									article.setQ_reg_date(rs.getTimestamp("q_reg_date"));
									article.setQ_readcount(rs.getInt("q_readcount"));
									article.setQ_ref(rs.getInt("q_ref"));
									article.setQ_re_step(rs.getInt("q_re_step"));
									article.setQ_re_level(rs.getInt("q_re_level"));
									article.setQ_content(rs.getString("q_content"));
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
			public int updateArticle(DTO article) throws Exception {
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs= null;
				String dbpasswd="";
				String sql="";
				int x=-1;
				try {
					conn = getConnection();
					pstmt = conn.prepareStatement(
					"select q_password2 from QnA where q_num = ?");
					pstmt.setInt(1, article.getQ_num());
					rs = pstmt.executeQuery();
					if(rs.next()){
						dbpasswd= rs.getString("q_password2"); 
						if(dbpasswd.equals(article.getQ_password2())){
							sql="update QnA set q_writer=?,q_subject=?, q_password2=?";
							sql+=",q_content=? where q_num=?";
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, article.getQ_writer());
							pstmt.setString(2, article.getQ_subject());
							pstmt.setString(3, article.getQ_password2());
							pstmt.setString(4, article.getQ_content());
							pstmt.setInt(5, article.getQ_num());
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
			
			public DTO updateGetArticle(int q_num) throws Exception {
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				DTO article=null;
				try {
					conn = getConnection();
					pstmt = conn.prepareStatement(
					"select * from QnA where q_num = ?"); 
					pstmt.setInt(1, q_num);
					rs = pstmt.executeQuery();
					if (rs.next()) {
						article = new DTO();
						article.setQ_num(rs.getInt("q_num"));
						article.setQ_writer(rs.getString("q_writer"));
						article.setQ_subject(rs.getString("q_subject"));
						article.setQ_password2(rs.getString("q_password2"));
						article.setQ_reg_date(rs.getTimestamp("q_reg_date"));
						article.setQ_readcount(rs.getInt("q_readcount"));
						article.setQ_ref(rs.getInt("q_ref"));
						article.setQ_re_step(rs.getInt("q_re_step"));
						article.setQ_re_level(rs.getInt("q_re_level"));
						article.setQ_content(rs.getString("q_content"));
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
			
			public int deleteArticle(int q_num, String q_password2) throws Exception {
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs= null;
				String dbpasswd="";
				int x=-1;
				try {
					conn = getConnection();
					pstmt = conn.prepareStatement(
					"select q_password2 from qna where q_num = ?");
					pstmt.setInt(1, q_num);
					rs = pstmt.executeQuery();
					if(rs.next()){
						dbpasswd= rs.getString("q_password2");
						if(dbpasswd.equals(q_password2)){
							pstmt = conn.prepareStatement(
							"delete from qna where q_num=?");
							pstmt.setInt(1, q_num);
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
			
	}

	 