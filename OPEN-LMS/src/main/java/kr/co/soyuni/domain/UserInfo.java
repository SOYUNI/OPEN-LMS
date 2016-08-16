package kr.co.soyuni.domain;

import org.springframework.context.annotation.Role;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityCoreVersion;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

import java.io.Serializable;
import java.util.*;


/**
  * @FileName : UserInfo.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 22. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */
public class UserInfo extends User{


	static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;
	
	// UserDetails 설정 값
	// https://docs.spring.io/spring-security/site/docs/3.2.6.RELEASE/apidocs/org/springframework/security/core/userdetails/UserDetails.html

	
	public UserInfo(String username, String password, boolean enabled,
			boolean accountNonExpired, boolean credentialsNonExpired,boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities){
		
		super(username, password, enabled, accountNonExpired, credentialsNonExpired,
				    accountNonLocked, authorities);
	}
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	
	
	
	
	
}
