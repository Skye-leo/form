<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>编辑表单</title>
	
	<script src="http://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

	<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

	<script type="text/javascript" src="js/editform.js"></script>
</head>
<body>
<div class="row">
	<div class="col-md-3"></div>
	<input type="hidden" id="form_id" value="${param['form_id']}">
	<div class="col-md-6">
		<div class="panel panel-info">
		<div class="panel-heading">当前编辑的表单--实测表单1</div>
		<div class="panel-body">
			<div class="btn-group" role="group" aria-label="...">
			  <a href="addTags.jsp?form_id=${param['form_id']}">
			  <button type="button" class="btn btn-default tag_button" value="1">新增输入字段</button>
			  </a>
<!-- 			  <button type="button" class="btn btn-default tag_button" value="2"></button>
			  <button type="button" class="btn btn-default tag_button" value="3">下拉框</button>
			  <button type="button" class="btn btn-default tag_button" value="4">长文本框</button> -->
			</div>
			<table class="table table-condensed">
				<div class="bs-example" data-example-id="striped-table">
			    <table class="table table-striped">
			      <thead>
			        <tr>
			          <th>排序</th>
			          <th>字段名称</th>
			          <th>类型限制</th>
			          <th>默认值</th>
			          <th>操作</th>
			        </tr>
			      </thead>
			      <tbody>
				    
			      </tbody>
			    </table>
			    <button type="button" class="btn btn-primary btn-sm btn-block">确定</button>
			  </div>			
			</table>
		</div>
	<div class="col-md-3"></div>
</div>
</body>
</html>