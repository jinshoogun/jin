package test.action;

import test.interceptor.DAOImpl;

public class HelloAction implements DAOImpl{
private DAO dao;
	public String execute() {
		dao.select();
		return "success";
	}
	public void setDAO(DAO dao){
		this.dao = dao;
	}
}
