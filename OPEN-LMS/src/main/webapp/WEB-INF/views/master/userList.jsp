<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div id="content">
        <div class="outer">
          <div class="inner bg-light lter">

            <!--Begin Datatables-->
            <div class="row">
              <div class="col-lg-12">
                <div class="box success">
                  <header>
                    <div class="icons">
                      <i class="fa fa-building-o"></i>
                    </div>
                    <h5>사용자 관리</h5>
                  </header>
                  

        		  	        	                  
                  <div id="collapse4" class="body">

                    <table id="dataTable" class="table table-bordered table-condensed table-hover table-striped">
                      <thead>
                        <tr>
                          <th class="text-center">순번</th>
                          <th class="text-center">학번(아이디)</th>
                          <th class="text-center">성명</th>
                          <th class="text-center">전화번호</th>
                          <th class="text-center">이메일</th>
                          <th class="text-center">주소</th>
                          <th class="text-center">가입일</th>
                          <th class="text-center">사용여부</th>
                        </tr>
                      </thead>
                      <tbody>
				<c:choose>
				<c:when  test="${!empty usrLists}">			  
					<c:forEach items="${usrLists}" var="users" varStatus="status">
					<tr class="myclass"  > 
						<td class="text-center">${paingLists.totalRecordCount - ((paingLists.currentPageNo-1) * paingLists.recordCountPerPage + status.index) } </td>
						<td class="text-center"><a href="#">${users.mem_id}</a></td>
						<td class="text-center"><a href="#">${users.name}</a></td>
						<td class="text-center">${users.tel}</td>
						<td class="text-center">${users.email}</td>
						<td class="text-center">${users.address1} ${users.address2}</td>
						<td class="text-center"><fmt:formatDate value="${users.join_date}" pattern="yyyy-MM-dd"/></td>
						<td class="text-center">
							<c:choose>
							<c:when test="${users.is_active == 'Y'}">
								정상
							</c:when>
							<c:otherwise>
								사용중지
							</c:otherwise>
							</c:choose>
						</td>
					</tr>
					</c:forEach>
				</c:when>
				<c:otherwise><tr><td class='text-center bold_red' colspan="8">해당 항목이 없습니다.!! </td></tr></c:otherwise>
				</c:choose>                        
                      </tbody>
                    </table>
      		    <c:if test="${paingLists.totalRecordCount > 0}">
			<div class="text-center">       		    
			<ul class="pagination">
			
				<c:if test="${paingLists.prevPage > 0}">
				<li><a href="${pageContext.request.contextPath}/admin/userList?page=1">&laquo;&laquo;</a></li>
				<li><a href="${pageContext.request.contextPath}/admin/userList?page=${paingLists.prevPage}" >&laquo;</a></li>
				</c:if>
		        <c:forEach var="i" begin="${paingLists.startPage}" end="${paingLists.endPage}" step="1">
		            
		            <c:choose>
		                <c:when test="${i eq paingLists.currentPageNo}"><li class="active"><a href="${pageContext.request.contextPath}/admin/userList?page=${i}" >${i}</a></li></c:when>
		                <c:otherwise><li><a href="${pageContext.request.contextPath}/admin/userList?page=${i}">${i}</a></li></c:otherwise>
		            </c:choose>

		        </c:forEach>
		        
		        <c:if test="${paingLists.nextPage > 0}">
		        <li><a href="${pageContext.request.contextPath}/admin/userList?page=${paingLists.nextPage}" >&raquo;</a></li>
		        <li><a href="${pageContext.request.contextPath}/admin/userList?page=${paingLists.finalPage}">&raquo;&raquo;</a></li>
		        </c:if>				
			</ul>
			</div>
		    </c:if>
                  </div>
                </div>
              </div>
            </div><!-- /.row -->

            <!--End Datatables-->
            


          </div><!-- /.inner -->
        </div><!-- /.outer -->
 </div><!-- /#content -->

