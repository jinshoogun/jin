package login.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.opensymphony.xwork2.Action;
import login.dao.UserDAO;
import login.model.UserInfo;

public class UserAction2 implements Action {
	UserInfo userInfo;

	Log log = LogFactory.getLog(UserAction.class);

	public String execute() throws Exception {
		log.info(">>>>> execute");
		UserInfo userInfo = new UserInfo();
		log.info(">>>>>userInfo Object Create");

		UserDAO loginDao = new UserDAO();
		if (loginDao.save(userInfo)) {
			return "success";
		} else {
			return "error";
		}
	}
	public UserInfo getUserInfo(){
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo){
		this.userInfo = userInfo;
	}
}
