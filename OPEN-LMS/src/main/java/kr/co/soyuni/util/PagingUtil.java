
package kr.co.soyuni.util;

/**
  * @FileName : PagingUtil.java
  * @Project : OPEN-LMS
  * @Date : 2016. 7. 14. 
  * @작성자 : 꽃씨하나
  * @변경이력 :
  * @프로그램 설명 :  전자정부 프레임워크 페이징 처리 계산식 참조
  * 				  http://www.egovframe.go.kr/wiki/doku.php?id=egovframework:rte:ptl:view:paginationtag
  */
public class PagingUtil {
	
	
	/*
	 *  	이름				설명						사용자입력여부	계산공식
		currentPageNo			현재 페이지 번호				yes
		recordCountPerPage		한 페이지당 게시되는 게시물 건 수		yes	
		pageSize			페이지 리스트에 게시되는 페이지 건수		yes	
		totalRecordCount		전체 게시물 건 수				yes	
		totalPageCount			페이지 개수					no		totalPageCount = ((totalRecordCount-1)/recordCountPerPage) + 1
		firstPageNoOnPageList		페이지 리스트의 첫 페이지 번호			no		firstPageNoOnPageList = ((currentPageNo-1)/pageSize)*pageSize + 1
		lastPageNoOnPageList		페이지 리스트의 마지막 페이지 번호		no		lastPageNoOnPageList = firstPageNoOnPageList+pageSize-1
														if(lastPageNoOnPageList>totalRecordCount){lastPageNoOnPageList=totalPageCount}
		firstRecordIndex		페이징 SQL의 조건절에 사용되는 시작 rownum	no		firstRecordIndex = (currentPageNo - 1) * recordCountPerPage
		lastRecordIndex			페이징 SQL의 조건절에 사용되는 마지막 rownum	no		lastRecordIndex = currentPageNo * recordCountPerPage
	 * 
	 * 
	 */
	

	int	currentPageNo	   	=	0;
	int	recordCountPerPage 	=	0;
	int	pageSize	   	=	0;
	int	totalRecordCount 	=	0;


	
	int	totalPageCount	   	=	0;
	int	firstPageNoOnPageList 	=	0;
	int	lastPageNoOnPageList	=	0;
	int	firstRecordIndex 	=	0;
	int	lastRecordIndex	   	=	0;
	
	int	finalPage       	=       0;  // 마지막 레코드
	int startPage 			=       0;  // 시작 페이지
	int endPage				=		0;  // 마지막 페이지
	int prevPage			=		0;  // 이전 페이지 블록
	int nextPage			=		0;  // 다음 페이지 블록
	
	public	PagingUtil(int currentPageNo, int recordCountPerPage,int pageSize,int totalRecordCount){
		
		this.totalPageCount = ((totalRecordCount-1)/recordCountPerPage) + 1;
		this.firstPageNoOnPageList = ((currentPageNo-1)/pageSize)*pageSize + 1;
		this.lastPageNoOnPageList = firstPageNoOnPageList+pageSize-1;
		if( lastPageNoOnPageList > totalRecordCount ){ lastPageNoOnPageList = totalPageCount; }
		
		this.firstRecordIndex = (currentPageNo - 1) * recordCountPerPage; 
		this.lastRecordIndex = currentPageNo * recordCountPerPage;
	}

	private void setPagingValue(){
		
		if ( currentPageNo <= 0 ) this.setCurrentPageNo(1); // page 번호 기본값 설정
		if ( recordCountPerPage <= 0 ) this.setRecordCountPerPage(20); // recordCountPerPage 번호 기본값 설정
		
		int finalPage = (totalRecordCount + (recordCountPerPage - 1)) / recordCountPerPage;	//
		
		if (this.currentPageNo > finalPage) this.setCurrentPageNo(finalPage); 			// 기본 값 설정

		if (this.currentPageNo < 0 || this.currentPageNo > finalPage) this.currentPageNo = 1; 	// 현재 페이지 유효성 체크
		
        this.startPage = ((currentPageNo - 1) / pageSize) * pageSize + 1; 	
        this.endPage = startPage + pageSize - 1; 						
      
        if (endPage > finalPage) { 								
            this.endPage = finalPage;
        }		

        this.prevPage = (startPage < 0) ? 0 : startPage - 1 ;
        this.nextPage = (endPage >= finalPage) ? 0 : endPage  + 1 ;
        
		this.setFinalPage(finalPage);

	}
	
	
	public int getTotalPageCount() {
		return totalPageCount;
	}


	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}


	public int getFirstPageNoOnPageList() {
		return firstPageNoOnPageList;
	}


	public void setFirstPageNoOnPageList(int firstPageNoOnPageList) {
		this.firstPageNoOnPageList = firstPageNoOnPageList;
	}


	public int getLastPageNoOnPageList() {
		return lastPageNoOnPageList;
	}


	public void setLastPageNoOnPageList(int lastPageNoOnPageList) {
		this.lastPageNoOnPageList = lastPageNoOnPageList;
	}


	public int getFirstRecordIndex() {
		return firstRecordIndex;
	}


	public void setFirstRecordIndex(int firstRecordIndex) {
		this.firstRecordIndex = firstRecordIndex;
	}


	public int getLastRecordIndex() {
		return lastRecordIndex;
	}


	public void setLastRecordIndex(int lastRecordIndex) {
		this.lastRecordIndex = lastRecordIndex;
	}


	public int getCurrentPageNo() {
		return currentPageNo;
	}


	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}


	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}


	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}


	public int getPageSize() {
		return pageSize;
	}


	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}


	public int getTotalRecordCount() {
		return totalRecordCount;
	}


	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
		this.setPagingValue();
	}


	public int getFinalPage() {
		return finalPage;
	}


	public void setFinalPage(int finalPage) {
		this.finalPage = finalPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getPrevPage() {
		return prevPage;
	}

	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	
	
	
}
