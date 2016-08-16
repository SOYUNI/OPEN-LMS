/**
 * 
 */
package kr.co.soyuni.auth;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Role;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

import kr.co.soyuni.domain.UserInfo;

/**
  * @FileName : CustomJdbcDaoImpl.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 22. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 : 전자 정부 프레임워크 EgovJdbcUserDetailsManager class 참조
  */
public class CustomJdbcDaoImpl extends JdbcDaoImpl{


	@Override
	public UserDetails loadUserByUsername(String username)	throws UsernameNotFoundException {


		List<UserDetails> users = loadUsersByUsername(username);
	        if (users.size() == 0) {
	        	UsernameNotFoundException notFoundExp = new UsernameNotFoundException(messages.getMessage("사용자 없음", new Object[]{username}, "not found"));
	        	throw notFoundExp;
	        }	

	        UserInfo user = (UserInfo)users.get(0);  



	        
	        return user; //new UserInfo(users.get(0).getUsername(), users.get(0).getPassword(), users.get(0).isEnabled(), true, true, true, auths);
	        
	}
	
	
	// https://www.mkyong.com/spring-security/spring-security-limit-login-attempts-example/  소스 참고
	@Override
	protected List<UserDetails> loadUsersByUsername(String username) {
		return getJdbcTemplate().query(getUsersByUsernameQuery(), new String[] {username}, new RowMapper<UserDetails>() {
			
			public UserDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
				String username = rs.getString("mem_id");
				String password = rs.getString("passwd");
				boolean enabled = rs.getBoolean("enabled");
				String role 	= rs.getString("authorities");
				
			        
			        List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
			        auths.add(new SimpleGrantedAuthority(role));
			        
				logger.info("init??? ::  "+rs.getBoolean("enabled"));
				logger.info("role     ::  "+rs.getString("authorities"));
					
				return new UserInfo(username, password, enabled, true, true, true, auths);
			}
		});
	  }
			
	
	@Override
	protected List<GrantedAuthority> loadUserAuthorities(String username) {
		return getJdbcTemplate().query(getAuthoritiesByUsernameQuery(), new String[] {username}, new RowMapper<GrantedAuthority>() {
			public GrantedAuthority mapRow(ResultSet rs, int rowNum) throws SQLException {
				String roleName = getRolePrefix() + rs.getString(1);
				 logger.info("roleName   ::   "+roleName);
				return new SimpleGrantedAuthority(roleName);
			}
		});
	}
	
	
}

