package com.mart.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mart.dao.UserDaoServiceImpl;
import com.mart.util.ShaEncoder;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {
  
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Resource(name = "shaEncoder")
	private ShaEncoder encoder;

	@Resource(name = "userDaoService")
	private UserDaoServiceImpl dao;


	
	@RequestMapping(value = "/")
	public ModelAndView index(HttpSession session, ModelAndView model) {
		System.out.println("Welcome login! {}"+session.getId());
		model.setViewName("/login/login");
		return model;
	}
	
	

	@RequestMapping(value = "/login")
	public ModelAndView login(HttpSession session, ModelAndView model) {
		System.out.println("Welcome login! {}"+session.getId());
		model.setViewName("/login/login");
		return model;
	}

	@RequestMapping(value = "/enroll")
	public ModelAndView enroll(HttpSession session, ModelAndView model) {
		model.setViewName("/member/signUp");
		return model;
	}
 
	@RequestMapping(value = "/insertUser")
	public String insertUser(HttpServletRequest request, HttpServletResponse response) {
 		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String nickname = request.getParameter("nickname");
		String email = request.getParameter("email");
		String tel = request.getParameter("phoneNumber");
		String gender = request.getParameter("gender");
		
		String dbpw = encoder.saltEncoding(password, id);

 		String authority = "ROLE_USER";
		Map<String, String> paramMap = new HashMap<String, String>();

		paramMap.put("userid", id);
		paramMap.put("passwd", dbpw);
		paramMap.put("name", name);
		paramMap.put("nickname", nickname);
		paramMap.put("email", email);
		paramMap.put("tel", tel);
		paramMap.put("gender", gender);
		paramMap.put("authority", authority);
		logger.info("paramMap >>>>>>>>>>>>>>>>>"+paramMap.toString());
 		int result = dao.insertUser(paramMap);
		return "/login/login";
	}

 

}
