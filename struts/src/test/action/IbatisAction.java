package test.action;

import java.util.List;
import com.ibatis.sqlmap.client.SqlMapClient;

public class IbatisAction implements IbatisImpl {
	private List list;
	private TestDTO dto;
	private SqlMapClient sqlMap;

	public String execute() throws Exception {

		dto = (TestDTO) sqlMap.queryForObject("selectId", "obj140");
		return "success";
	}

	public void setIbatis(SqlMapClient sqlMap) {
		this.sqlMap = sqlMap;
	}

}
