package com.mart.security.onAuthentication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class UserLoginFailureHandler implements AuthenticationFailureHandler{
	private static final Logger logger = LoggerFactory.getLogger(UserLoginSuccessHandler.class);

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException auth)throws IOException, ServletException {
		for(StackTraceElement s : auth.getStackTrace()){
			   System.out.println("================================");
 			   System.out.println(s.getClassName());
			   System.out.println(s.getMethodName());
			   System.out.println(s.getLineNumber()+"");
 			   System.out.println("================================");
			   	  
		}
		
 		request.setAttribute("errMsg",auth.getMessage());
 		System.out.println("에러 터짐");
		request.getRequestDispatcher("/WEB-INF/views/login/login.jsp").forward(request, response);
	  	
	}

}
