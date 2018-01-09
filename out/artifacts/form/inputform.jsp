<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>选取输入界面</title>
	
	<script src="http://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

	<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

	<script type="text/javascript" src="js/inputform.js"></script>

</head>
<body>

<div class="row">
	<div class="col-md-3"></div>
	
	<div class="col-md-6">
	<div class="page-header">
	<h1>中地会信息录入平台<small>请选择表单录入</small></h1>	
		<div class="panel panel-info">
		<div class="panel-heading">您好，你的个人编号是：&nbsp;100203</div>
		<div class="panel-body">
			
			<div class="dropdown" style="margin-bottom:20px;">
			  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
			    选择表单
			    <span class="caret"></span>
			  </button>
			  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
			    
			  </ul>
			</div>
			
			<!-- 模拟一 -->
			<div class="panel panel-warning input_form" id="test1">
		    <div class="panel-heading" id="form_title">表单</div>
		    <div class="panel-body">
	    		<form action="submitform" method="POST">
				  
				</form>
			</div>
            </div>
           
		</div>
		</div>
	<div class="col-md-3"></div>
</div>
</body>
</html>