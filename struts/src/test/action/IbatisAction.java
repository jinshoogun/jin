package test.action;

import java.io.Reader;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisAction {
	private List list;
	public String execute() throws Exception {
		Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);		
		reader.close();
		
		//sqlMap.update("bb");
		//sqlMap.insert("bb");
		//sqlMap.delete("bb");
		//sqlMap Id가 bb인 것을 호출!
		
		//select * from 사용할시
		//sqlMap.queryForList("selectAll");// - 결과 리스트로 리턴
		list = sqlMap.queryForList("selectId");
		
		//String str = (String)sqlMap.queryForObject("selectAll");
		//Object라도 타입이  String형이므로 String으로 가지고온다
		//sqlMap.queryForObject("selectAll");// 결과 레코드 하나만 리턴
		
		return "success";
	}
	public List getList(){
		return list;
	}
	
}
