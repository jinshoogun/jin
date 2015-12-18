package test.action;


import com.ibatis.sqlmap.client.SqlMapClient;
import com.opensymphony.xwork2.ModelDriven;

public class InsertAction implements ModelDriven, IbatisImpl{
	private TestDTO dto;
	private SqlMapClient sqlMap;
	public String execute() throws Exception{
		sqlMap.insert("insert", dto);
		
		return "success";
	}
	public Object getModel(){
		dto = new TestDTO();
		return dto;
	}
	public void setIbatis(SqlMapClient sqlMap){
		this.sqlMap = sqlMap;
	}

}
