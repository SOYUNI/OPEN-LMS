/**
 * 
 */
package kr.co.soyuni.dao;

import java.util.ArrayList;
import java.util.HashMap;

import kr.co.soyuni.domain.Members;
import kr.co.soyuni.domain.UserInfo;

/**
  * @FileName : AdminUserMngMapper.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 29. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */

public interface AdminUserMngMapper {
	
	public int getAllTotalUserList(HashMap<String,String> hashmap);
	public ArrayList<Members> getAllUserList(HashMap<String,Object> hashmap);
}
