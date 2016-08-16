<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html> 
<html class="no-js" lang="kr">
<head>
	<title>LMS</title>
    <!--IE Compatibility modes-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!--Mobile first-->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->
    <link rel="stylesheet" href="/soyuni/resources/new_adminUI/assets/lib/bootstrap/css/bootstrap.min.css">
    <!-- jquery UI -->
    <link rel="stylesheet" href="/soyuni/resources/css/jquery-ui.min.css">
    <!--  공통 -->
    <link rel="stylesheet" href="/soyuni/resources/css/style.css">

    <!-- Font Awesome -->

   <link rel="stylesheet" href="/soyuni/resources/font-awesome-4.6.3/css/font-awesome.min.css">
    
    <!-- Metis core stylesheet -->
    <link rel="stylesheet" href="/soyuni/resources/new_adminUI/assets/css/main.min.css">

    <!-- Metis Theme stylesheet -->

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->

    <!--[if lt IE 9]>
      <script src="/soyuni/resources/new_adminUI/assets/lib/html5shiv/html5shiv.js"></script>
        <script src="/soyuni/resources/new_adminUI/assets/lib/respond/respond.min.js"></script>
       <![endif]-->
	    <link rel="stylesheet" href="/soyuni/resources/new_adminUI/assets/css/style-switcher.css">
	    <link rel="stylesheet/less" type="text/css" href="/soyuni/resources/new_adminUI/assets/css/less/theme.less">
	    <script src="/soyuni/resources/new_adminUI/assets/lib/less/less-1.7.3.min.js"></script>
	
	    <!--Modernizr 2.8.2-->
	    <script src="/soyuni/resources/new_adminUI/assets/lib/modernizr/modernizr.min.js"></script>       
    <!--jQuery 2.1.1 -->
    <script src="/soyuni/resources/new_adminUI/assets/lib/jquery/jquery.min.js"></script>
    
    <!--jQuery UI -->
    <script src="/soyuni/resources/js/jquery-ui.min.js"></script>    
    <!--jQuery UI -->
    <script src="/soyuni/resources/js/jquery-ui.datepicker.js"></script>   	    
    
</head>


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
                          <th class="text-center">test1(아이디)</th>
                          <th class="text-center">test2</th>
                          <th class="text-center">test3</th>
                        </tr>
                      </thead>
                      <tbody>
				<c:choose>
				<c:when  test="${!empty lists}">			  
					<c:forEach items="${lists}" var="lists" varStatus="status">
					<tr class="myclass"  > 
						<td class="text-center">${paingLists.totalRecordCount - ((paingLists.currentPageNo-1) * paingLists.recordCountPerPage + status.index) } </td>
						<td class="text-center"><a href="#">${lists.test1}</a></td>
						<td class="text-center"><a href="#">${lists.test2}</a></td>
						<td class="text-center"><a href="#">${lists.test3}</a></td>
					</tr>
					</c:forEach>
				</c:when>
				<c:otherwise><tr><td class='text-center bold_red' colspan="3">해당 항목이 없습니다.!! </td></tr></c:otherwise>
				</c:choose>                        
                      </tbody>
                    </table>
      		<c:if test="${paingLists.totalRecordCount > 0}">
			<div class="text-center">       		    
			<ul class="pagination">
			
				<c:if test="${paingLists.prevPage > 0}">
				<li><a href="${pageContext.request.contextPath}/testPaging?page=1">&laquo;&laquo;</a></li>
				<li><a href="${pageContext.request.contextPath}/testPaging?page=${paingLists.prevPage}" >&laquo;</a></li>
				</c:if>
				
		        <c:forEach var="i" begin="${paingLists.startPage}" end="${paingLists.endPage}" step="1">
		            <c:choose>
		                <c:when test="${i eq paingLists.currentPageNo}"><li class="active"><a href="${pageContext.request.contextPath}/testPaging?page=${i}" >${i}</a></li></c:when>
		                <c:otherwise><li><a href="${pageContext.request.contextPath}/testPaging?page=${i}">${i}</a></li></c:otherwise>
		            </c:choose>
		        </c:forEach>
		        
		        <c:if test="${paingLists.nextPage > 0}">
		        <li><a href="${pageContext.request.contextPath}/testPaging?page=${paingLists.nextPage}" >&raquo;</a></li>
		        <li><a href="${pageContext.request.contextPath}/testPaging?page=${paingLists.finalPage}">&raquo;&raquo;</a></li>
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

    <!--Bootstrap -->
    <script src="/soyuni/resources/new_adminUI/assets/lib/bootstrap/js/bootstrap.min.js"></script>
    <script src="/soyuni/resources/js/bootstrap.min.js"></script>    
    <script src="/soyuni/resources/js/bootstrap-select.js"></script>
    
    
    <!-- Screenfull -->
    <script src="/soyuni/resources/new_adminUI/assets/lib/screenfull/screenfull.js"></script>

    <!-- Metis core scripts -->
    <script src="/soyuni/resources/new_adminUI/assets/js/core.min.js"></script>

    <!-- Metis demo scripts -->
    <script src="/soyuni/resources/new_adminUI/assets/js/app.min.js"></script>
    <script src="/soyuni/resources/new_adminUI/assets/js/style-switcher.min.js"></script>

	<script type="text/javascript">
	
	        // Remove active for all items.
	        //$('.bg-blue li').removeClass('active');
	
	        // highlight submenu item
	        $('li a[href="' + this.location.pathname + '"]').parent().addClass('active');
	     	// Highlight parent menu item.
	        $('ul a[href="' + this.location.pathname + '"]').parents('li').addClass('active');
   	
	</script>   
	
</body>
</html>