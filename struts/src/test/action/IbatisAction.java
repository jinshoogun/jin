package test.action;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisAction {
	private List list;
	private TestDTO dto;
	public String execute() throws Exception {
		Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);		
		reader.close();
		
		//sqlMap.update("bb");
		//sqlMap.insert("bb");
		//sqlMap.delete("bb");
		//sqlMap Id�� bb�� ���� ȣ��!
		
		//select * from ����ҽ�
		//sqlMap.queryForList("selectAll");// - ��� ����Ʈ�� ����
		dto = (TestDTO)sqlMap.queryForObject("selectId", "obj140");
		
		//String str = (String)sqlMap.queryForObject("selectAll");
		//Object�� Ÿ����  String���̹Ƿ� String���� ������´�
		//sqlMap.queryForObject("selectAll");// ��� ���ڵ� �ϳ��� ����
		
		return "success";
	}
	
	
	public List getList(){
		return list;
	}
	public TestDTO getDTO(){
		return dto;
	}
	
	
	
}
