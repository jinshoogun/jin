package login2.interceptor;

import login2.dao.LoginDAO;

public interface LoginDAOAware {
	public void setLoginDAO(LoginDAO loginDAO);
}
