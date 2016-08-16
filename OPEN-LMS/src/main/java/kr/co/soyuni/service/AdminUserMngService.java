/**
 * 
 */
package kr.co.soyuni.service;

import java.util.ArrayList;

import kr.co.soyuni.domain.Members;


/**
  * @FileName : AdminUserMngService.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 29. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */

public interface AdminUserMngService {

	public int getAllTotalUserList(String sch_key, String sch_val);
	public ArrayList<Members> getAllUserList(String sch_key, String sch_val, int start, int end);
}
