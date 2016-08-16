/**
 * 
 */
package kr.co.soyuni.domain;

import java.util.Date;

/**
  * @FileName : Members.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 30. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */
public class Members {

	private int 	mem_idx = 0;
	private String 	mem_id = "";
	private String 	passwd = "";
	private String 	is_join_sns = "";
	private String 	name = "";
	private String 	tel = "";
	private String 	email = "";
	private String 	zipcode = "";
	private String 	address1 = "";
	private String 	address2 = "";
	private String 	role = "";
	private String 	ip = "";
	private String 	is_active = "";
	private int 	level = 0;
	private Date 	join_date;
	
	
	public int getMem_idx() {
		return mem_idx;
	}
	public void setMem_idx(int mem_idx) {
		this.mem_idx = mem_idx;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getIs_join_sns() {
		return is_join_sns;
	}
	public void setIs_join_sns(String is_join_sns) {
		this.is_join_sns = is_join_sns;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
	
}
