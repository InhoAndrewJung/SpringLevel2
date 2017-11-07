package ibatis.services.user.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ibatis.services.domain.User;
import ibatis.services.user.UserDAO;

public class MyBatisUserDAOImpl10 implements UserDAO{
	
	private SqlSession sqlSession;
	
	
	public void setSqlSession(SqlSession sqlSession) {
		System.out.println("::"+getClass().getName()+".setSqlSession() Call...");
		this.sqlSession = sqlSession;
	}

	@Override
	public int addUser(User user) throws Exception {
		int result=sqlSession.insert("User10.addUser", user); //1,0
		sqlSession.commit();
		return result;
	}

	@Override
	public int updateUser(User user) throws Exception {
		int result = sqlSession.update("User10.updateUser",user);
		sqlSession.commit();
		return result;
	}

	@Override
	public int removeUser(String id) throws Exception {
		int result = sqlSession.update("User10.removeUser",id);
		sqlSession.commit();
		return result;
	}

	@Override
	public User getUser(String id) throws Exception {
		return sqlSession.selectOne("User10.getUser", id);
	}

	@Override
	public List<User> getUserList(User user) throws Exception {
		
		return sqlSession.selectList("User10.getUserList", user);
	}
}





