/**
 * 
 */
package kr.co.soyuni.service;

import java.util.ArrayList;

import kr.co.soyuni.domain.TestPaging;
import kr.co.soyuni.util.PagingUtil;

/**
  * @FileName : TestPagingService.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 21. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */
public interface TestPagingService {
	
	public int getTocalRecordCnt();
	public ArrayList<TestPaging> getAllList(int start, int end);
	public void setPagingUtil(PagingUtil pagingUtil);
}
