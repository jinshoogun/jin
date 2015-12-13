package obj430.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	// 로그인으로 입력된 정보를 getInstance통해 임시로 저장이 되었다가 끝나면 자동으로 삭제됩니다.
	private static DAO instance = new DAO();
// instance 객체 생성
	public static DAO getInstance() {
		return instance;

	}
	
	private Connection getConnection() throws Exception {

		Context ctx = new InitialContext();// 컨텐츠를 찾아가는 과정
		Context env = (Context) ctx.lookup("java:comp/env");// 자바로 셋팅설정을 찾아가는 곳
															// java:comp/env 고정값
		DataSource ds = (DataSource) env.lookup("jdbc/orcl");
		return ds.getConnection();
	} // getConnection을 통해 커넥션 풀을 연결합니다.

	public ArrayList select() {
		ArrayList list = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "select * from q1";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs != null) {
				list = new ArrayList();
				while (rs.next()) {
					DTO dto = new DTO();
					dto.setId(rs.getString("id"));
					dto.setNa(rs.getString("na"));
					dto.setPw(rs.getString("pw"));
					dto.setAdd(rs.getString("address"));
					dto.setA(rs.getString("sex"));
					dto.setPhone(rs.getString("phone"));
					dto.setEmail(rs.getString("mail"));
					dto.setB(rs.getString("mailagree"));
					dto.setNick(rs.getString("nick"));
					dto.setIntru(rs.getString("intru"));
					dto.setReg(rs.getTimestamp("reg"));
					list.add(dto);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {// 연결에도 예외가 생길 수 있으니 처리해야됩니다.
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException s) {
			}
			// 클로즈는 따로따로 예외처리를 할 수 있도록 해야한다. (예외 발생시 다른 것이 종료되지 않기 때문이다)
		}
		return list;
	}

	public void insert(DTO dto) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("insert into q1 values(?,?,?,?,?,?,?,?,?,?,sysdate)");
			// 본 내용은 q1에 가입된 정보를 넣는 곳입니다.
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getNa());
			pstmt.setString(4, dto.getAdd());
			pstmt.setString(5, dto.getA());
			pstmt.setString(6, dto.getPhfirst() + "-" + dto.getPhsec() + "-" + dto.getPhthr());
			pstmt.setString(7, dto.getMailId() + "@" + dto.getDomain());
			// 전화번호나 이메일 주소 같은 경우 하나의 변수로 정해서 다 넣을려고 했으나
			// 각각의 값이 넣고 변수로 지정되기 전에 null인 상태의 변수값이 먼저 보내지기 떄문에 null로 나오는 것을
			// 방지하기 위해서 따로따로 해서 선언한다.
			pstmt.setString(8, dto.getB());
			pstmt.setString(9, dto.getNick());
			pstmt.setString(10, dto.getIntru());
			pstmt.executeUpdate();
// 값을 컬럼에 맞게 레코드에 저장이 되어지고 수치는 보이지 않는다.
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException s) {
			}
		}
	}         // 예외처리를 실시한다. 종료시에도 각각 예외처리 실시

	public int userCheck(String id, String pw) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpw = "";
		int x = -1;
		// LoginPro.jsp파일에서 가져온 아이디와 비밀번호를 가지고 옵니다. x가 기본값이 -1로 지정되어있습니다.
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select pw from q1 where id = ?");
			// 아이디는 DB에서 있는지 검색을 하면 검색결과에 비밀번호가 나옵니다
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			// 그결과값은 rs라는 곳에 저장이 되어지고 값은 아직 갖고 있다

			if (rs.next()) {// rs값을 통해 비밀번호가 있는 확인을 합니다.
				// next 메소드를 통해 커서에 있는 값이 있는지 확인합니다.
				dbpw = rs.getString("pw");
				if (dbpw.equals(pw))
					x = 1; // 비밀번호 값과 동일하면 x=1로 값을 주고 줍니다.
				else
					x = 0; // 비밀번호 값이 다르면 x=0로 값을 줍니다.
			} else
				x = -1;// next메소드로 돌렸으나 결과값이 없다면(아이디 없는 경우) x=-1로 줍니다

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
		return x; // 결과값을 loginPro에게 돌려줍니다
	}

	public DTO getMember(String id) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO member = null;
		// id에서 primary key를 잡았기 때문에 id가 참조값으로 사용된다. 그렇기 떄문에 id 변수로 member 전체값을 불려들일 수 있다. 또한 DTO에서 member 변수를 정의한다.
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select * from q1 where id = ?");
			// id를 통해 모든 정보들이 저장되어서 진다.
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) { 	// 계속 돌아가서 rs값이 넣어진다.
				member = new DTO();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setNa(rs.getString("na"));
				member.setAdd(rs.getString("address"));
				member.setA(rs.getString("sex"));
				member.setPhone(rs.getString("phone"));
				member.setEmail(rs.getString("mail"));
				member.setB(rs.getString("mailagree"));
				member.setNick(rs.getString("nick"));
				member.setIntru(rs.getString("intru"));
			 // member를 통해 각각의 컬럼값에다가 html에서 입력된 값들이 name에 맞게 각각 컬럼의 레코드 값들이 불러들어서 저장되어진다. 
			 // 이때 getString()은 html의 name이 아닌 컬럼에 맞게 잡아줘야 한다.  
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
		} // 각각의 변수의 예외처리를한다.
		return member;
	}// 그리고 결과값은 member라는 변수로 통해 보내지게 된다.

	public void updateMember(DTO member) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
// 전송에 필요한 변수 및 기본값 생성을 한다.
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"update q1 set pw=?, address=?, phone=?, mail=?, mailagree=?, nick=?, intru=? " + "where id = ?");
			// update 테이블로 각 항목에 따라 값을 불러온다. 이때 ?와 setString 갯수를 맞추어야 하고 순서를 맞춰야 올바르게 컬럼에 맞게 레코드 값을 불려들을 수 있다.
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getAdd());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getB());
			pstmt.setString(6, member.getNick());
			pstmt.setString(7, member.getIntru());
			pstmt.setString(8, member.getId());
			// setString을 통해 각자의 값을 멤버에 통해 가져와 저장이 되이진다.
			pstmt.executeUpdate();
			// 본 정보들을 열람이 없이 업뎃이 완료 되어진다.

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
        // 예외처리를 실시한다. 종료시에도 각각 예외처리 실시
	}

	public int confirmId(String id) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = -1;
		// confirmId.jsp파일에서 가져온 아이디를 가지고 옵니다. x가 기본값이 -1로 지정되어있습니다.
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select id from q1 where id= ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
//sql에서 테이블에서 id값을 검색을 하게 된다. 그리고 ?는 가져온 id의 파라미터 값이 들어온다.
			if (rs.next())
				x = 1;
			//값이 없을때까지 계속 돌린다. 있을 경우 x=-1로 넣는다.
			else
				x = -1; // 그외에는 x=-1로 넣어준다.
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
		return x; // 결과값을 confirmId.jsp에게 돌려줍니다
	}

	public int deleteMember(String id, String pw) 
	throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpw ="";
		int x=-1;
		// 계정 삭제를 하기 위해 ID를 통해 memId정보를 불려들인다. 또한, pw는 계정을 삭제하기 위한 검증방법으로 pw도 같이 값을 부른다.
		// x의 기본값은 -1이다
		try {
			conn = getConnection();
			
			pstmt = conn.prepareStatement(
					"select pw from q1 where id = ?");
			// 본 과정은 id를 통해서 비밀번호를 불려들인다. 그렇기 때문에 ?에 id값으로 pw를 불러들인다. 그리고 그리고 rs에다가 저장을 한다.
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()){// 결과값이 있을떄까지 불러들인다.
				dbpw= rs.getString("pw");
				//dbpw는 사용자가 작성한 인스턴트로 통해 작성된 값이다.
				if(dbpw.equals(pw)){ // 사용자가 작성된 값이 실제 비밀번호와 동일한 경우라는 if절을 작성하고 있다.
					pstmt = conn.prepareStatement( //조건에 맞는다면 id값을 통해 테이블내에 있는 id에 맞는 레코드들이 삭제가 된다.
					"delete from q1 where id=?");
					pstmt.setString(1, id);
					pstmt.executeUpdate(); //그리고 정보결과 없이 완료선언한다.
					x= 1; //그리고 x=1이라고 변수를 선언한다.
				} else 
					x= 0; // 위 경우는 비밀번호가 다른 경우이므로, x=0으로 선언한다.
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
			return x; // X 결과값을 deletePro에게 돌려줍니다
		}
	public int confirmNick(String nick) 
	throws Exception {
		Connection conn = null;
     PreparedStatement pstmt = null;
		ResultSet rs= null;
		int x=-1;
		// confirmNick.jsp파일에서 가져온 닉네임을 가지고 옵니다. x가 기본값이 -1로 지정되어있습니다.
		try {
         conn = getConnection();
         
         pstmt = conn.prepareStatement(
         	"select nick from q1 where nick = ?");
         pstmt.setString(1, nick);
         rs= pstmt.executeQuery();
       //sql에서 테이블에서 id값을 검색을 하게 된다. 그리고 ?는 가져온 id의 파라미터 값이 들어온다.
			if(rs.next())
				//값이 없을때까지 계속 돌린다. 있을 경우 x=-1로 넣는다.
				x= 1; //x =1은 검색이 되어지는 상태이다.
			else
				x= -1;//x =1은 검색이 되어지지 않는 상태(없는 상태)이다.
     } catch(Exception ex) {
         ex.printStackTrace();
     } finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
         if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
         if (conn != null) try { conn.close(); } catch(SQLException ex) {}
     }
		return x;
	}// 결과값을 confirmNick.jsp에게 돌려줍니다
	
}