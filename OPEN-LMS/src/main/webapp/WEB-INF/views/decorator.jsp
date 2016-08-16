<%@ page contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %> 
<!DOCTYPE html> 
<html class="no-js" lang="kr">
<head>
	<title><decorator:title default="LMS"/></title>
    <!--IE Compatibility modes-->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!--Mobile first-->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/new_adminUI/assets/lib/bootstrap/css/bootstrap.min.css">
    <!-- jquery UI -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/jquery-ui.min.css">
    <!--  공통 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

    <!-- Font Awesome -->

   <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/font-awesome-4.6.3/css/font-awesome.min.css">
    
    <!-- Metis core stylesheet -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/new_adminUI/assets/css/main.min.css">

    <!-- Metis Theme stylesheet -->

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->

    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->

    <!--[if lt IE 9]>
      <script src="${pageContext.request.contextPath}/resources/new_adminUI/assets/lib/html5shiv/html5shiv.js"></script>
        <script src="${pageContext.request.contextPath}/resources/new_adminUI/assets/lib/respond/respond.min.js"></script>
       <![endif]-->
	    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/new_adminUI/assets/css/style-switcher.css">
	    <link rel="stylesheet/less" type="text/css" href="${pageContext.request.contextPath}/resources/new_adminUI/assets/css/less/theme.less">
	    <script src="${pageContext.request.contextPath}/resources/new_adminUI/assets/lib/less/less-1.7.3.min.js"></script>
	
	    <!--Modernizr 2.8.2-->
	    <script src="${pageContext.request.contextPath}/resources/new_adminUI/assets/lib/modernizr/modernizr.min.js"></script>       
    <!--jQuery 2.1.1 -->
    <script src="${pageContext.request.contextPath}/resources/new_adminUI/assets/lib/jquery/jquery.min.js"></script>
    
    <!--jQuery UI -->
    <script src="${pageContext.request.contextPath}/resources/js/jquery-ui.min.js"></script>    
    <!--jQuery UI -->
    <script src="${pageContext.request.contextPath}/resources/js/jquery-ui.datepicker.js"></script>   	    
    <decorator:head/>
</head>


  <body class="  ">
    <div class="bg-dark dk" id="wrap">
      <div id="top">

        <!-- .navbar -->
        <nav class="navbar navbar-inverse navbar-static-top">
          <div class="container-fluid">

            <!-- Brand and toggle get grouped for better mobile display -->
            <header class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span> 
                <span class="icon-bar"></span> 
                <span class="icon-bar"></span> 
                <span class="icon-bar"></span> 
              </button>

            </header>
            <div class="topnav">
              <div class="btn-group">
                <a data-placement="bottom" data-original-title="Fullscreen" data-toggle="tooltip" class="btn btn-default btn-sm" id="toggleFullScreen">
                  <i class="glyphicon glyphicon-fullscreen"></i>
                </a> 
              </div>
              <div class="btn-group">
                <a href="/static/j_spring_security_logout" data-toggle="tooltip" data-original-title="Logout" data-placement="bottom" class="btn btn-metis-1 btn-sm">
                  <i class="fa fa-power-off"></i>
                </a> 
              </div>
              <div class="btn-group">
                <a data-placement="bottom" data-original-title="Show / Hide Left" data-toggle="tooltip" class="btn btn-primary btn-sm toggle-left" id="menu-toggle">
                  <i class="fa fa-bars"></i>
                </a> 
                <a data-placement="bottom" data-original-title="Show / Hide Right" data-toggle="tooltip" class="btn btn-default btn-sm toggle-right"> <span class="glyphicon glyphicon-comment"></span>  </a> 
              </div>
            </div>
 
            <div class="collapse navbar-collapse navbar-ex1-collapse">

              <!-- .nav -->
              <ul class="nav navbar-nav">
                <li> <a href="${pageContext.request.contextPath}/admin">관리자 메인화면</a>  </li>
                <li> <a target="_blank"href="/">사용자 메인화면</a>  </li>
              </ul><!-- /.nav -->
            </div>
 
          </div><!-- /.container-fluid -->
        </nav><!-- /.navbar -->
        <header class="head">
          <div class="main-bar">
            <h4>
              <i class="fa fa-home"></i>&nbsp; LMS 관리자 페이지</h4>
          </div><!-- /.main-bar -->
        </header><!-- /.head -->
      </div><!-- /#top -->
      
      <div id="left">
        <div class="media user-media bg-dark dker">
          <div class="user-media-toggleHover">
            <span class="fa fa-user"></span> 
          </div>

        </div>

        <!-- #menu -->
        <ul id="menu" class="bg-blue dker">
          <li class="nav-header">Menu</li>
          <li class="nav-divider"></li>
          <li class="">
            <a href="${pageContext.request.contextPath}/admin/">
              <i class="fa fa-dashboard"></i><span class="link-title">&nbsp;관리자 메인</span> 
            </a> 
          </li>


        </ul><!-- /#menu -->
      </div><!-- /#left -->
      

	<decorator:body/>

 
    </div><!-- /#wrap -->
    

      
    
 
    <footer class="Footer bg-dark dker">
      <p>2016 &copy; </p>
    </footer><!-- /#footer -->

    <!-- #helpModal -->
    <div id="helpModal" class="modal fade">
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
            <h4 class="modal-title">Modal title</h4>
          </div>
          <div class="modal-body">
            <p>
              Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor
              in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
            </p>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          </div>
        </div><!-- /.modal-content -->
      </div><!-- /.modal-dialog -->
    </div><!-- /.modal --><!-- /#helpModal -->
    
    
    <!--Bootstrap -->
    <script src="${pageContext.request.contextPath}/resources/new_adminUI/assets/lib/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>    
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap-select.js"></script>
    
    
    <!-- Screenfull -->
    <script src="${pageContext.request.contextPath}/resources/new_adminUI/assets/lib/screenfull/screenfull.js"></script>

    <!-- Metis core scripts -->
    <script src="${pageContext.request.contextPath}/resources/new_adminUI/assets/js/core.min.js"></script>

    <!-- Metis demo scripts -->
    <script src="${pageContext.request.contextPath}/resources/new_adminUI/assets/js/app.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/new_adminUI/assets/js/style-switcher.min.js"></script>

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
