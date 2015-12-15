package login.dao;
import login.model.UserInfo;

public class LoginDAO {
	public boolean loginChk (UserInfo userInfo){
		
		if ("test".equals(userInfo.getId())){
			userInfo.setName("ȫ�浿");
			return true;
		} else {
			return false;
		}
	}
}
