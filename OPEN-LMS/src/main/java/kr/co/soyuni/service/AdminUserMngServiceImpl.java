/**
 * 
 */
package kr.co.soyuni.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import kr.co.soyuni.domain.Members;
import kr.co.soyuni.domain.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.soyuni.dao.AdminUserMngMapper;

/**
  * @FileName : AdminUserMngServiceImpl.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 29. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */

@Service
public class AdminUserMngServiceImpl implements AdminUserMngService{
	

	@Autowired AdminUserMngMapper adminUserMngMapper;
	
	@Override
	public int getAllTotalUserList(String sch_key, String sch_val) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
		
		hashmap.put("sch_val", sch_key);
		hashmap.put("sch_val", sch_val);		
		
		return adminUserMngMapper.getAllTotalUserList(hashmap);
	}
	
	
	@Override
	public ArrayList<Members> getAllUserList(String sch_key, String sch_val, int start, int end) {
		// TODO Auto-generated method stub
		
		Integer start_num =  start;
		Integer end_num   =  end;
		
		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		
		
		hashmap.put("start", start_num);
		hashmap.put("end", end_num);
		hashmap.put("sch_val", sch_key);
		hashmap.put("sch_val", sch_val);		
		
		return adminUserMngMapper.getAllUserList(hashmap);
	}

}
