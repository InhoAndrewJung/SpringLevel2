package config;
/*
 * SqlSessionFactory�� �ϳ� ���Ϲ޾ƿ��� ������ ����Ѵ�.
 */

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {
	private static SqlSessionFactory factory;
	
	static {
		
		
		try {
			//1. sqlConfig.xml�� �о�鿩�� Reader�� �ϳ� ���Ϲް�
			Reader r = Resources.getResourceAsReader("config/sqlConfig.xml");
			
			//2. SqlSessionFactory�� ���Ϲ޴´�.
			factory = new SqlSessionFactoryBuilder().build(r);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//
		
		}//
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
/*
*1. SqlSessionFactoryBuilder()
*
*/