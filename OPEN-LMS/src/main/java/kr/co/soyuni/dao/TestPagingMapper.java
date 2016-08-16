/**
 * 
 */
package kr.co.soyuni.dao;

import java.util.ArrayList;
import java.util.HashMap;

import kr.co.soyuni.domain.TestPaging;

/**
  * @FileName : TestPagingMapper.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 21. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */
public interface TestPagingMapper {
	
	public int getTotalRecordCnt();

	public ArrayList<TestPaging> getAllList(HashMap<String,Object> hashmap);
}
