/**
 * 
 */
package kr.co.soyuni.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.soyuni.domain.Members;
import kr.co.soyuni.domain.UserInfo;
import kr.co.soyuni.service.AdminUserMngService;
import kr.co.soyuni.util.CommonSch;
import kr.co.soyuni.util.PagingUtil;

/**
  * @FileName : AdminUserMngController.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 29. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */

@Controller
public class AdminUserMngController {

	
	private static final Logger logger = LoggerFactory.getLogger(AdminUserMngController.class);
	
	
	@Autowired AdminUserMngService adminUserMngService = null;
	
	
	@RequestMapping(value="/admin/userList", method = {RequestMethod.GET, RequestMethod.POST})
	public String getAllUserList(@RequestParam(value="page", defaultValue="1") int page
	   ,CommonSch commonSch,ModelMap model, HttpServletRequest request) throws Exception{

		int totalCnt = 0;
		String sch_key =  commonSch.getSch_key();	//  제목,내용 검색어 구분
		String sch_val =  commonSch.getSch_val(); 	//  검색값
		
		
		totalCnt = adminUserMngService.getAllTotalUserList(sch_key, sch_val);
		
		
		int recordCountPerPage = 20;
		int pageSize = 10;
		
		PagingUtil pu = new PagingUtil(page,recordCountPerPage,pageSize,totalCnt);		
		
		int start = pu.getFirstRecordIndex();
		int end   = recordCountPerPage; //pu.getLastRecordIndex();
		//int finalPage = (totalCnt + (recordCountPerPage - 1)) / recordCountPerPage;
		
		pu.setCurrentPageNo(page);
		pu.setRecordCountPerPage(end);
		pu.setPageSize(pageSize);
		pu.setTotalRecordCount(totalCnt);
		//pu.setFinalPage(finalPage);
		
		List<Members> usrLists = adminUserMngService.getAllUserList(sch_key, sch_val, start, end);
		
		
		model.addAttribute("usrLists", usrLists);
		model.addAttribute("paingLists", pu);
		model.addAttribute("start", start);
		model.addAttribute("end", end);
		
		
		return "/master/userList";
		
	}
}
