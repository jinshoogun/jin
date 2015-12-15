package login.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import login.dao.LoginDAO;
import login.model.UserInfo;

public class LoginAction implements Action, Preparable, ModelDriven {
	UserInfo userInfo;

	public String execute() throws Exception {
		LoginDAO dao = new LoginDAO();
		if (dao.loginChk(userInfo)){
			return "success";
		} else {
			return "login";
		}
	}
	public void prepare() throws Exception {
		userInfo = new UserInfo();
	}

	public Object getModel() {
		return userInfo;

	}
}
