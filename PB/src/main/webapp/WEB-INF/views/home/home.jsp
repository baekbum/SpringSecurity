<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
</head>
<body>
<jsp:forward page="../Layout.jsp"></jsp:forward>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P> <br>
<input type="hidden" id="param" value="seadmin"> 
<!-- <input type="button" id="oracleTest" value="오라클 테스트"/> -->

<script defer src="./resources/component/jquery-3.5.1.min.js"></script>
<script defer src="./resources/javascript/home/home.js"></script>
</body>
</html>
