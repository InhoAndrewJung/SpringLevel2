package config;
/*
 * SqlSessionFactory를 하나 리턴받아오는 로직을 담당한다.
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
			//1. sqlConfig.xml을 읽어들여서 Reader를 하나 리턴받고
			Reader r = Resources.getResourceAsReader("config/sqlConfig.xml");
			
			//2. SqlSessionFactory를 리턴받는다.
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