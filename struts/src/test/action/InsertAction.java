package test.action;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.opensymphony.xwork2.ModelDriven;

public class InsertAction implements ModelDriven{
	private TestDTO dto;
	public String execute() throws Exception{
		Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);		
		reader.close();
		sqlMap.insert("insert", dto);
		
		return "success";
	}
	public Object getModel(){
		dto = new TestDTO();
		return dto;
	}

}
