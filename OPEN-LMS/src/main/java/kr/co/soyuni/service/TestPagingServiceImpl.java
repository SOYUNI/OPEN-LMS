package kr.co.soyuni.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.soyuni.dao.TestPagingMapper;
import kr.co.soyuni.domain.TestPaging;
import kr.co.soyuni.util.PagingUtil;

@Service
public class TestPagingServiceImpl implements TestPagingService {
	
	@Autowired 
	private TestPagingMapper testPagingMapper;
	private PagingUtil pagingUtil;
	
	@Override
	public int getTocalRecordCnt(){
		
		return testPagingMapper.getTotalRecordCnt();
	}
	 
	@Override
	public ArrayList<TestPaging> getAllList(int start, int end){
		
		Integer start_num =  start;
		Integer end_num   =  end;
		
		HashMap<String, Object> hashmap = new HashMap<String, Object>();
		
		hashmap.put("start", start_num);
		hashmap.put("end", end_num);
				
		return testPagingMapper.getAllList(hashmap);
	}
	
	@Override
	public void setPagingUtil(PagingUtil pagingUtil){
		
		this.pagingUtil = pagingUtil;
	}
	 

}
