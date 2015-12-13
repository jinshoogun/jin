package DATADB.bean;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public class DAO {//데이터 접그을 목적으로하는 객체 커넥션 같은걸 하나만두고 여러사용자가 dao 의 인터페이스를
	              //사용하여 필요한 자료에 접근하도록 하는 것 
	private static DAO instance = new DAO();

	public static DAO getInstance() {
		return instance;
	}

	public DAO() {
	}

	// 리소스 관리
	private Connection getConnection() throws Exception {
		//getConnection 메서드 (java.lang.String,java.lang.String)
	    //javax.sql.DataSource 인터페이스의  getConnection 메서드에 의해 지정된다.
		//null이 아닌 사용자 이름 또는 암호를 사용하여 getConnection 메서드를 호출하면
		//SQLServerConnection 개체를 초기화 할때 SQLServerDataSource 클래스에 설정된 사용자 이름 및 암호 속성이 대체된다.
		

		Context initCtx = new InitialContext();//현재 환경의 naming context 획득하기
		Context envCtx = (Context) initCtx.lookup("java:comp/env"); // 자바로 설정된 걸
																	// 찾는다.
		DataSource ds = (DataSource) envCtx.lookup("jdbc/orcl"); // 자바로된 부분중에 DATASOURCE찾기 
																	// jdbc로된걸
																	// 찾는다.고정된이름이라
																	// 외어야함
		return ds.getConnection(); //컨넥션을 얻어온다.
	}

	//-------------------------------일반회원 insert 메소드------------------------------------------------
	public void insertMembership(DTO membership) {
		Connection conn = null;  //Connection형 데이터타입으로 conn 객체참조변수를 선언하고  null 값을 대입해서 초기화한다
		PreparedStatement pstmt = null; //PreparedStatement는 쿼리 문장을 미리 생성해 놓는것을 말한다.
		                                //PreparedStatement형 데이터타입 pstmt 객체참조변수를 선언하고 null값을 대입해서 초기화

		try {
			conn = getConnection();// 커넥션 연결
			// 쿼리생성!
			pstmt = conn.prepareStatement("insert into MEMBERSHIP values(?,?,?,?,?,?,?,sysdate,MEMBERSHIP_SEQ.NEXTVAL)");
          
			
			
			pstmt.setString(1, membership.getM_id());          //아이디
			pstmt.setString(2, membership.getM_password());    //비밀번호
			pstmt.setString(3, membership.getM_name());        //이름
			pstmt.setString(4, membership.getM_email());       //이메일
			pstmt.setString(5, membership.getM_sex());         //성별
			pstmt.setString(6, membership.getM_birth());       //생년월일
			pstmt.setString(7, membership.getM_phone());       //핸드폰번호
			// pstmt.setTimestamp(8,membership.getM_reg());

			

			pstmt.executeQuery(); //executeQuery()메소드는 SELECT문 실행할때 쓰이는데
			                      //이때 반환하는 ResultSet객체는 SELECT문을 이용하여 테이블로부터 얻어온 데이터를 담고있다.
		} catch (Exception e) { // 예외처리
			e.printStackTrace();

		} finally {

			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}

	}

	/*public int userCheck(String m_id, String m_password) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		int x = -1;

		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select m_password from MEMBERSHIP where m_id = ?");
			pstmt.setString(1, m_id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dbpasswd = rs.getString("m_password");
				if (dbpasswd.equals(m_password))
					x = 1; // 인증 성공
				else
					x = 0; // 비밀번호 틀림
			} else
				x = -1;// 해당 아이디 없음

		} catch (Exception ex) {
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
		return x;
	}*/

	public int ConfirmId(String m_id) // 중복확인 메소드
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		int x = -1;

		try {
			conn = getConnection(); // 커넥션 연결

			pstmt = conn.prepareStatement("select m_id from MEMBERSHIP where m_id =?");
			// ID를 입력하고 그에해당하는 ID를 가져옴.

			pstmt.setString(1, m_id);

			rs = pstmt.executeQuery();

			if (rs.next()) // rs에 저장된 결과가 있으면 if문실행 없으면 else문 실행
				x = 1; // 해당아이디 있음
			else
				x = -1; // 해당아이디없음

		} catch (Exception ex) {
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
		return x;

	}

	public int deleteMembership(String m_id, String m_password) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		int x = -1;
		try {
			conn = getConnection(); // 커넥션 연결
			pstmt = conn.prepareStatement("select m_password from MEMBERSHIP where m_id = ?");
			// 쿼리 생성, 해당하는 아이디에 맞는 pw를 가져온다 -> dbpasswd변수에 대입한다.
			pstmt.setString(1, m_id);
			rs = pstmt.executeQuery();
			System.out.println(m_id);
			if (rs.next()) {
				dbpasswd = rs.getString("m_password");
				System.out.println(m_password + dbpasswd);
				if (dbpasswd.equals(m_password)) { // equals 함수를 사용해서 퀴리문을 통해
													// 가져온dbpassword와 pw를 비교하여
													// 동일하면 delete문 실행
					pstmt = conn.prepareStatement("delete from MEMBERSHIP where m_id=?");
					pstmt.setString(1, m_id);
					pstmt.executeUpdate(); //삽입 수정 삭제 관련된 SQL문을 실행할때 쓰이고 수정된 레코드 개수를 반환한다 
					                      
					x = 1; // 회원탈퇴 성공
				} else
					x = 0; // 비밀번호 틀림
			}
		} catch (Exception ex) {
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
		return x;
	}

	public DTO getMembership(String m_id) // 회원정보 수정시, 정보를 가져오는 메서드
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO membership = null;

		try {
			conn = getConnection(); // 커넥션 연결

			pstmt = conn.prepareStatement("select *from MEMBERSHIP where m_id =?"); // 해당아이디의
																					// 정보를
																					// 찾음

			pstmt.setString(1, m_id);
			rs = pstmt.executeQuery();

			if (rs.next()) { // getString("id")에서 이름을 DB정보랑 동일하게 해야하며 , next() =
								// 커서를 다음걸로 넘겨주는
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
		} catch (Exception ex) {
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
		return membership;

	}

	public void updateMembership(DTO membership) // 회원정보 수정 메서드
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection(); // 커넥션 연결

			pstmt = conn.prepareStatement("update MEMBERSHIP set m_password=?,m_email=?" + "where m_id=?");
			// update 테이블명 set컬럼명=값, 컬럼명=값...
			// 여러컬럼을 변경하려면 쉼표로 구분하여 set위치에 써준다
			pstmt.setString(1, membership.getM_password());
			
			pstmt.setString(2, membership.getM_email());
			pstmt.setString(3, membership.getM_id());

			pstmt.executeQuery();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
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
	}
	public String SearchId(String m_name, String m_birth) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String id=null;

		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select m_id from MEMBERSHIP where m_name = ? and m_birth =?");

			pstmt.setString(1, m_name);
			pstmt.setString(2, m_birth);
			rs = pstmt.executeQuery();
			if(rs.next())
			id = rs.getString("m_id");
			
			} catch (Exception ex) {
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
		return id;
	}
	
	//비밀번호찾기
	public String SearchPw(String m_id, String m_birth)throws Exception
	{
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String pw=null;
	
	try {
		conn=getConnection();
		pstmt=conn.prepareStatement("select m_password from MEMBERSHIP where m_id =? and m_birth=? ");
		
		pstmt.setString(1,m_id);
		pstmt.setString(2,m_birth);
		
		rs = pstmt.executeQuery();
		
		if(rs.next())
			pw = rs.getString("m_password");
			
			} catch (Exception ex) {
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
		return pw;


} 

	
	// ---------------------------------디자이너 회원가입-------------------------------------------------------------------
	public void insertDesigner(DTO Designer) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int d_num = Designer.getD_num();
		int number = 0;
		String sql ="";
		
		try {
			conn = getConnection();
			
			sql = "insert into DESIGNER values(DESIGNER_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,SYSDATE)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, Designer.getD_id());
			pstmt.setString(2, Designer.getD_password());
			pstmt.setString(3, Designer.getD_name());
			pstmt.setString(4, Designer.getD_nickname());
			pstmt.setString(5, Designer.getD_email());
			pstmt.setString(6, Designer.getD_sex());
			pstmt.setString(7, Designer.getD_birth());
			pstmt.setString(8, Designer.getD_phone());
			pstmt.setString(9, Designer.getD_store());
			pstmt.executeUpdate();
			
			
		
		} catch (Exception e) {e.printStackTrace();} finally {
			if (rs != null)try {rs.close();} catch (SQLException e) {}
			if (pstmt != null)try {pstmt.close();} catch (SQLException e) {}
			if (conn != null)try {conn.close();} catch (SQLException e) {}
		}
	}
	
	public int userCheck(String id, String password) throws Exception {
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String dbpw = "";
	      int x = -1;
	      try {
	         conn = getConnection();
	         pstmt = conn.prepareStatement("select m_password from MEMBERSHIP where m_id = ?");
	         pstmt.setString(1, id);
	         rs = pstmt.executeQuery();
	         if (rs.next()) {
	            dbpw = rs.getString("m_password");
	            if (dbpw.equals(password))
	               x = 1; // 개인회원 확인

	            else
	               x = 0; // 비밀번호 오류
	         
	         }
	      } catch (Exception ex) {
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
	      return x;
	   }
	
	
	public int designerCheck(String id, String password) throws Exception {
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String dbpw = "";
	      int x = -1;
	      try {
	         conn = getConnection();
	         pstmt = conn.prepareStatement("select d_password from DESIGNER where d_id = ?");
	         pstmt.setString(1, id);
	         rs = pstmt.executeQuery();
	         if (rs.next()) {
	            dbpw = rs.getString("d_password");
	            if (dbpw.equals(password))
	               x = 1; // 개인회원 확인

	            else
	               x = 0; // 비밀번호 오류
	         } 
	      } catch (Exception ex) {
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
	      return x;
	   }
	
	public int adminCheck(String id, String password) throws Exception {
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String dbpw = "";
	      int x = -1;
	      try {
	         conn = getConnection();
	         pstmt = conn.prepareStatement("select a_password from Administrator where a_id = ?");
	         pstmt.setString(1, id);
	         rs = pstmt.executeQuery();
	         if (rs.next()) {
	            dbpw = rs.getString("a_password");
	            if (dbpw.equals(password))
	               x = 1; // 개인회원 확인

	            else
	               x = 0; // 비밀번호 오류
	         
	         }
	      } catch (Exception ex) {
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
	      return x;
	   }
	
	
//디자이너 회원가입 중복확인 메소드
	public int D_confirmId(String d_id) 
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		int x = -1;

		try {
			conn = getConnection(); // 커넥션 연결

			pstmt = conn.prepareStatement("select d_id from DESIGNER where d_id =?");
			// ID를 입력하고 그에해당하는 ID를 가져옴.

			pstmt.setString(1, d_id);

			rs = pstmt.executeQuery();

			if (rs.next()) // rs에 저장된 결과가 있으면 if문실행 없으면 else문 실행
				x = 1; // 해당아이디 있음
			else
				x = -1; // 해당아이디없음

		} catch (Exception ex) {
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
		return x;

	}
	
	//디자이너회원 탈퇴 메소드
	public int deleteDesigner(String d_id, String d_password) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		int x = -1;
		try {
			conn = getConnection(); // 커넥션 연결
			pstmt = conn.prepareStatement("select d_password from DESIGNER where d_id = ?");
			// 쿼리 생성, 해당하는 아이디에 맞는 pw를 가져온다 -> dbpasswd변수에 대입한다.
			pstmt.setString(1, d_id);
			rs = pstmt.executeQuery();
			System.out.println(d_id);
			if (rs.next()) {
				dbpasswd = rs.getString("d_password");
				System.out.println(d_password + dbpasswd);
				if (dbpasswd.equals(d_password)) { // equals 함수를 사용해서 퀴리문을 통해
													// 가져온dbpassword와 pw를 비교하여
													// 동일하면 delete문 실행
					pstmt = conn.prepareStatement("delete from DESIGNER where d_id=?");
					pstmt.setString(1, d_id);
					pstmt.executeUpdate();
					x = 1; // 회원탈퇴 성공
				} else
					x = 0; // 비밀번호 틀림
			}
		} catch (Exception ex) {
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
		return x;
	}
	
	
	
//디자이너 회원정보 수정시 정보를 가져오는 메서드 
	public DTO getDesigner(String d_id) 
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO designer = null;

		try {
			conn = getConnection(); // 커넥션 연결

			pstmt = conn.prepareStatement("select *from DESIGNER where d_id =?"); // 해당아이디의
																					// 정보를
																					// 찾음

			pstmt.setString(1, d_id);
			rs = pstmt.executeQuery();

			if (rs.next()) { // getString("id")에서 이름을 DB정보랑 동일하게 해야하며 , next() =
								// 커서를 다음걸로 넘겨주는
				designer = new DTO();

				designer.setD_id(rs.getString("d_id"));
				designer.setD_password(rs.getString("d_password"));
				designer.setD_name(rs.getString("d_name"));
				designer.setD_nickname(rs.getString("d_nickname"));
				designer.setD_email(rs.getString("d_email"));
				designer.setD_sex(rs.getString("d_sex"));
				designer.setD_birth(rs.getString("d_birth"));
				designer.setD_phone(rs.getString("d_phone"));
				
			}
		} catch (Exception ex) {
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
		return designer;

	}

	public void updateDesigner(DTO designer) // 회원정보 수정 메서드
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection(); // 커넥션 연결

			pstmt = conn.prepareStatement("update DESIGNER set d_password=?,d_email=?" + "where d_id=?");
			// update 테이블명 set컬럼명=값, 컬럼명=값...
			// 여러컬럼을 변경하려면 쉼표로 구분하여 set위치에 써준다
			pstmt.setString(1, designer.getD_password());
			pstmt.setString(2, designer.getD_email());
			pstmt.setString(3, designer.getD_id());

			pstmt.executeQuery();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
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
	}
	
}









