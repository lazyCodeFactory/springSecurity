package com.mart.dao;

import java.util.Map;

public interface UserDaoService {
	public int insertUser(Map<String, String> paramMap);
	
	public Map<String, Object> selectUser(String username);
}
