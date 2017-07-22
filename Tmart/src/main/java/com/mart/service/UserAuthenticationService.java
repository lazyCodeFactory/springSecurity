package com.mart.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mart.dao.UserDaoService;
import com.mart.vo.UserDetailsVO;
 public class UserAuthenticationService implements UserDetailsService {
	private static final Logger logger = LoggerFactory.getLogger(UserAuthenticationService.class);

	@Autowired
	private UserDaoService userDaoService;
	
	
	private SqlSessionTemplate sqlSession;
	
	public UserAuthenticationService() {
 	
	}
	 
	public UserAuthenticationService(SqlSessionTemplate sqlSession) {
 		this.setSqlSession(sqlSession);
	}
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	

	@Override
	public UserDetails loadUserByUsername(String id) {
		  Map<String, Object> user = userDaoService.selectUser(id);
		  System.out.println("user >>>>>>>>>>>>>>>>>>>"+user.toString());
 		  if(user ==null) { 
			  System.out.println(id+"이라는 해당 유저는 없다 ");
			  throw new UsernameNotFoundException(id); 
		  } 
			  
 			  List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
			  list.add(new SimpleGrantedAuthority(user.get("authority").toString()));
 
//			  String name = user.get("username").toString();
//			  String passwd = user.get("password").toString();
//			  boolean enabled = false;
//			  	 if ((Integer)user.get("enabled") == 1) {
//					 enabled =true;
//				 } 
//			 
//			  boolean accountNonExpired = true;
//			  boolean credentialsNonExpired = true; 
//			  boolean accountNonLocked = true;	 
// 			  String email     = 	user.get("email").toString();
//			  String nickname  = 	user.get("nickname").toString();
//			  String tel       = 	user.get("phonenumber").toString();
//			  String gender    = 	user.get("gender").toString();
			  return new UserDetailsVO(user.get("username").toString(),user.get("password").toString(),(Integer)user.get("enabled") == 1,true,true,true,list,user.get("name").toString(),user.get("nickname").toString(),user.get("email").toString(),user.get("phonenumber").toString(),user.get("gender").toString());

	}

 

	}	

	
	

 
