/**
 * 
 */
package kr.co.soyuni.domain;

/**
  * @FileName : TestPaging.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 21. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :
  */
public class TestPaging {
	
	private int test1;
	private String test2;
	private String test3;
	

	private int tt1 = 0;
	private int tt2 = 0;
	private int tt3 = 0;
	private int tt4 = 0;
	private int tt5 = 0;
	
	public TestPaging(){};
	
	public TestPaging(int tt1, int tt2, int tt3){
		
	
		this.tt1 = 3;
		this.tt2 = 3;
		this.tt3 = 3;
		
		tt4 = 8;
		tt5 = 23;
		
		
		System.out.println(" 1: "+tt1);	
		System.out.println(" 1: "+tt2);
		System.out.println(" 1: "+tt3);
		System.out.println(" 1-1: "+this.tt1);	
		System.out.println(" 1-1: "+this.tt2);
		System.out.println(" 1-1: "+this.tt3);		
		System.out.println(" 1-1: "+tt4);	
		System.out.println(" 1-1: "+tt5);		
		
		setTt1(22);
		setTt2(22);
		setTt3(22);
		setTt4(22);
		setTt5(22);		
		
		System.out.println(" 2: "+tt1);	
		System.out.println(" 2: "+tt2);
		System.out.println(" 3: "+tt3);
		System.out.println(" 2-1: "+this.tt1);	
		System.out.println(" 2-1: "+this.tt2);
		System.out.println(" 3-1: "+this.tt3);		
		System.out.println(" 2-1: "+this.tt4);	
		System.out.println(" 2-1: "+this.tt5);
		
								
		
	}
	
	
	
	
	public int getTest1() {
		return test1;
	}
	public void setTest1(int test1) {
		this.test1 = test1;
	}
	public String getTest2() {
		return test2;
	}
	public void setTest2(String test2) {
		this.test2 = test2;
	}
	public String getTest3() {
		return test3;
	}
	public void setTest3(String test3) {
		this.test3 = test3;
	}
	
	
	public int getTt1() {
		return tt1;
	}
	public void setTt1(int tt1) {
		this.tt1 = tt1;
	}
	public int getTt2() {
		return tt2;
	}
	public void setTt2(int tt2) {
		this.tt2 = tt2;
	}
	public int getTt3() {
		return tt3;
	}
	public void setTt3(int tt3) {
		this.tt3 = tt3;
	}

	public int getTt4() {
		return tt4;
	}

	public void setTt4(int tt4) {
		this.tt4 = tt4;
	}

	public int getTt5() {
		return tt5;
	}

	public void setTt5(int tt5) {
		this.tt5 = tt5;
	}

	

	
	
	
}
