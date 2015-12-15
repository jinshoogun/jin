package login.interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class SumAction implements Action, Preparable, ModelDriven {
	NumberForAdd num;
	private int sum = 0;
	public String execute() throws Exception{
		SumDAO dao = new SumDAO();
		sum = dao.add(num);
		return "success";
		
	}
	public void prepare() throws Exception {
		num = new NumberForAdd();
	}
	
	public Object getModel(){
		return num;
	}
	
	public int getSum(){
		return sum;
	}
	

}
