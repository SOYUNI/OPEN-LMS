<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<title>Login Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="decorator" content="welcome"> 
<!-- Loading Bootstrap -->
<link href="/resources/css/bootstrap.css" rel="stylesheet">

<!-- Loading Flat UI -->
<link href="/resources/css/flat-ui.css" rel="stylesheet">
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
<!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
<!--[if lt IE 9]>
  <script src="resources/js/html5shiv.js"></script>
<![endif]-->

<sec:authorize access="isAuthenticated()">
<script>
	location.href="/myclass/";
</script>
</sec:authorize>
</head>
<body onload='document.f.j_username.focus();'>
    <div class="container">
      <div class="demo-headline">
        <h1 class="demo-logo">
         
          <small>로그인 페이지</small>
        </h1>
      </div> <!-- /demo-headline -->

	<c:if test="${not empty error}">
		<div class="errorblock">
			로그인 실패했습니다. 다시 시도해주세요.<br /> 원인 :
			<!-- ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
			<c:choose>
				<c:when test="${errorMessage} == 'Bad credentials' ">
					
				</c:when>
				<c:otherwise>
					${errorMessage}
				</c:otherwise>
			</c:choose>
			-->
		</div>
	</c:if>

	<form name='f' action="<c:url value='/static/j_spring_security_check' />" method='POST'>
<!-- 
		<table align="center">
			<tr>
				<td>User:</td>
				<td><input type='text' name='j_username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='j_password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="reset" type="reset" /></td>
			</tr>
		</table>
 -->		
      <div class="login">
        <div class="login-screen">
          <div class="login-icon">
            <h4>성덕대학교 <small>부설원격평생교육원</small></h4>
          </div>

          <div class="login-form" style="width:40%;">
            <div class="control-group" style="float:left;padding-top:20px;padding-bottom:30px;">
              아이디 : <input type="text" class="login-field" value="" placeholder="Enter your name" name="j_username" id="j_username" />
              <label class="login-field-icon fui-man-16" for="login-name"></label>
            </div>

            <div class="control-group" style="float:right;padding-top:20px;padding-bottom:30px;">
              비밀번호 : <input type="password" class="login-field" value="" placeholder="Password" id="j_password" name="j_password" />
              <label class="login-field-icon fui-lock-16" for="login-pass"></label>
            </div>
            <input name="submit" type="submit" class="btn btn-primary btn-large btn-block" value="LOGIN" />
          </div>
        </div>
      </div>
	</form>
	
	</div>	
</body>
</html>

