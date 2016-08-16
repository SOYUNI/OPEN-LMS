/**
 * 
 */
package kr.co.soyuni.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
  * @FileName : AdminMainIndexController.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 26. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */

@Controller
public class AdminMainIndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminMainIndexController.class);

	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public String adminMainIndex(Model model){
		
	
		logger.info("init??? ???");
		
		return "/master/index";
	}
}
