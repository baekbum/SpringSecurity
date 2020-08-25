<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>private board</title>
<link rel="stylesheet" href="../resources/bootstrap/css/bootstrap.css" />
<link rel="stylesheet" href="../resources/css/login/Login.css" />
</head>
<body>
<form class="form-signin" action="login.pb" method="POST">
    <img src="../resources/image/apple.jpg" style="width: 200px; height: 95px">
    <h1 class="h3 mb-3 font-weight-normal"></h1>
    <input type="text" name="userid" class="form-control" placeholder="ID" required autofocus>
    <input type="password" name="userpw" class="form-control" placeholder="Password" required>
    <button class="btn btn-lg btn-primary btn-block" type="submit">LOGIN</button>
    <c:if test="${param.err == true}">
        <p style="color: red">ID와 Password를 확인해주세요.</p>
    </c:if>
    
    <p class="mt-5 mb-3 text-muted">private.board.com</p>
</form>

<!-- 
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12"><div></div></div>
    </div>
    <div class="row">
        <div class="col-lg-3"></div>
        <div class="col-lg-6" style="display: inline-flex; margin-top: 10%">
            <div id="leftDiv" style="width: 50%">
                <img src="./resources/image/apple.jpg" style="width: 400px">
            </div>
            <div id="rightDiv" style="width: 50%">
                <form action="loginProcess" style="margin-top: 30%;" method="post">
                    <input id="userId" type="text" value="" style="margin-bottom: 5px;">
                    <input id="userPw" type="password" value="" style="margin-bottom: 5px;">
                    <input type="submit" value="로그인">
	            </form>
	            <span>회원가입</span>
	            <span>비밀번호 찾기</span>
            </div>
        </div>
        <div class="col-lg-3"><div></div></div>
    </div>
    <div class="row">
        <div class="col-lg-12"><div></div></div>
    </div>
</div>
 -->
<script defer src="../resources/component/jquery-3.5.1.min.js"></script>
<script defer src="../resources/component/popper.js"></script>
<script defer src="../resources/bootstrap/js/bootstrap.js"></script>
<script defer src="../resources/javascript/login/Login.js"></script>
</body>
</html>

