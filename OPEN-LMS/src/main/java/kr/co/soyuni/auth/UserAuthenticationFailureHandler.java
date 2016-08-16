/**
 * 
 */
package kr.co.soyuni.auth;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

/**
  * @FileName : UserAuthenticationFailureHandler.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 22. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */
public class UserAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {
	
	private static final Logger logger = LoggerFactory.getLogger(UserAuthenticationFailureHandler.class);
	
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
    	logger.info("### Login Failed!!");

    	
    	logger.info("### Login Error Message : {}", exception.getMessage());
    	
        String forwardUrl = "/login?login_error=t" +
            "&error_message=" + URLEncoder.encode(exception.getMessage(), "UTF-8");

        
        saveException(request, exception);

        logger.info("### forwardUrl : {}", forwardUrl);
        RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
        redirectStrategy.sendRedirect(request, response, forwardUrl);
    }

}
