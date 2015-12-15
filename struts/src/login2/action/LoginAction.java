package login2.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import login2.dao.LoginDAO;
import login2.model.UserInfo;
import login2.interceptor.LoginDAOAware;

public class LoginAction implements Action, Preparable, ModelDriven, LoginDAOAware {
	UserInfo userInfo;
	LoginDAO dao;

	public String execute() throws Exception {
		if (dao.loginChk(userInfo)) {
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

	public void setLoginDAO(LoginDAO loginDAO) {
		this.dao = loginDAO;

	}

}
