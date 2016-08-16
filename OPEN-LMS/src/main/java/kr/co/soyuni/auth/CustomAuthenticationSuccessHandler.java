/**
 * 
 */
package kr.co.soyuni.auth;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
  * @FileName : CustomAuthenticationSuccessHandler.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 22. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler{
	
	private static final Logger logger = LoggerFactory.getLogger(CustomAuthenticationSuccessHandler.class);
	
	//@Autowired
	//private UserService userService = null;	
	
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth) throws IOException, ServletException{
    	

	    request = ((ServletRequestAttributes)RequestContextHolder.currentRequestAttributes()).getRequest();
	    String ipAddress = request.getHeader("X-FORWARDED-FOR");
	        if (ipAddress == null)
	        	ipAddress = request.getRemoteAddr();
	        
	    
	    
    	//log.setIp(ipAddress);
    	//log.setM_userid(auth.getName());
    	
    	logger.info("      auth.getAuthorities()  check  :   "+auth.getAuthorities());
    	
    	
    	//userService.insertLoginLog(log); 
    	

    	HttpSession session = request.getSession(false);
    	String url = "";
    	
	    if (session != null) {
	        url = (String) request.getSession().getAttribute("url_prior_login");
	    }if (url != null) {

	        response.sendRedirect(url);

	    }else {    	  
	    	
	    	String DEF_AUTH = String.valueOf(auth.getAuthorities());
	    	
	    	switch (DEF_AUTH) {
	    	case	"[ROLE_STU]" :
	    		response.sendRedirect(request.getContextPath() + "/myclass/main");    		
	    		break;
	    	case	"[ROLE_ADM]" :
	    		response.sendRedirect(request.getContextPath() + "/admin/");    		
	    		break;
	    	case	"[ROLE_PROF]" :
	    		response.sendRedirect(request.getContextPath() + "/prof/");    		
	    		break;
	    	default	   :
	    		response.sendRedirect(request.getContextPath() + "/");
	    	}    	
	    }
    	//public int insertLoginLog(
    	
    }	

}
