package test.interceptor;

import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import test.action.IbatisImpl;

public class IbatisInterceptor implements Interceptor {
	private Reader reader;
	private SqlMapClient sqlMap;
	public void destroy() {}
 	public void init(){
		try{
		reader = Resources.getResourceAsReader("sqlMapConfig.xml");
		sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
	}catch (Exception e){
		e.printStackTrace();
	} finally {
		if(reader != null){try{reader.close();}catch (Exception s){}}
	}}

	public String intercept(ActionInvocation arg0) throws Exception {
		Object obj = arg0.getAction();
		if(obj instanceof IbatisImpl){
			IbatisImpl ibatis = (IbatisImpl)obj; 
			ibatis.setIbatis(sqlMap);
		}
		return arg0.invoke();
	}

}
