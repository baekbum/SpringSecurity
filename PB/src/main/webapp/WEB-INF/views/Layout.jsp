<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>private board</title>
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.css" />
<link rel="stylesheet" href="resources/css/Layout.css" />
<link rel="stylesheet" href="resources/jqwidgets/styles/jqx.base.css" type="text/css"/>
<link rel="stylesheet" href="resources/jqwidgets/styles/jqx.material.css" type="text/css"/>
</head>
<body>
<div class="container-fluid">
  <div class="row" style="margin-top: 15px;">
    <div class="col-2" style="border-color: black; border-style: dashed;">
      <div id="logo"></div>
    </div>
    <div class="col-8" style="border-color: black; border-style: dashed;">
      <div id="topMenu"></div>
    </div>
    <div class="col-2" style="border-color: black; border-style: dashed;">
      <div id="userInfo"></div>
    </div>
  </div>
  <div class="row">
    <div class="col-2" style="border-color: black; border-style: dashed;">
      <div id="leftContents" style="height: 785px;"></div>
    </div>
    <div class="col-10" style="border-color: black; border-style: dashed;">
      <div id="mainContents" style="height: 785px;">main</div>
    </div>
  </div>
</div>

<script defer src="resources/component/jquery-3.5.1.min.js"></script>
<script defer src="resources/component/popper.js"></script>
<script defer src="resources/bootstrap/js/bootstrap.js"></script>
<script defer src="resources/jqwidgets/jqx-all.js"></script>
<script defer src="resources/javascript/Layout.js"></script>
</body>
</html>

