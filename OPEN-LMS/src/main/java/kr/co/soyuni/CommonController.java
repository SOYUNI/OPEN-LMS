/**
 * 
 */
package kr.co.soyuni;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
  * @FileName : CommonController.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 22. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 : 공통 컨트롤러 ex- 공통에러 처리 등.
  */

@Controller
public class CommonController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class); 

	
	@RequestMapping(value="/commonError")
	public String allError(Model model){
		
		
		
		return "/common/error";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String actionLogin(Model model){
		
		return "/common/login";
	}
	
}
