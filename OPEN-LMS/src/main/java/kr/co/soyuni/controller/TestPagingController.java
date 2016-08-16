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

import kr.co.soyuni.domain.TestPaging;
import kr.co.soyuni.service.TestPagingService;
import kr.co.soyuni.util.PagingUtil;

/**
  * @FileName : TestPagingController.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 21. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */

@Controller
public class TestPagingController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestPagingController.class);

	@Autowired
	private TestPagingService testPagingService;
	
	@RequestMapping(value="/testPaging",method=RequestMethod.GET)
	public String list(@RequestParam(value="page", defaultValue="1") int page
						,ModelMap model, HttpServletRequest request){
		
		int totalCnt = 0;
		int recordCountPerPage = 20;
		int pageSize = 10;
		
		totalCnt = testPagingService.getTocalRecordCnt();
		
		PagingUtil pu = new PagingUtil(page,recordCountPerPage,pageSize,totalCnt);
		
		int start = pu.getFirstRecordIndex();
		int end   = recordCountPerPage; //pu.getLastRecordIndex();		

		pu.setCurrentPageNo(page);
		pu.setRecordCountPerPage(end);
		pu.setPageSize(pageSize);
		pu.setTotalRecordCount(totalCnt);
		
	
		List<TestPaging> lists = testPagingService.getAllList(start,end);
	
		model.addAttribute("lists", lists);
		model.addAttribute("paingLists", pu);
		model.addAttribute("start", start);
		model.addAttribute("end", end);		
		
		/*
		 * test code
		 * */
		
		TestPaging tp = new TestPaging(11,22,33);
		
		
		return "/test/testPaging";
	}
	
	
}
