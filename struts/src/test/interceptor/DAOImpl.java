package test.interceptor;
import test.action.DAO;

public interface DAOImpl {
	public void setDAO(DAO dao);

}
// 강제성 주입 - 메소드를 강제로 연결시키기 위해서 사용!