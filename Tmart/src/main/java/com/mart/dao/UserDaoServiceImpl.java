package com.mart.dao;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service("userDaoService")
public class UserDaoServiceImpl extends DaoSupport implements UserDaoService {
	
	
	@Override

	public int insertUser(Map<String, String> paramMap) {
 		return getSqlSession().insert("insertUser",paramMap);
	}

	@Override
	public Map<String, Object> selectUser(String username) {
  		return getSqlSession().selectOne("selectUser",username);
	}

}
