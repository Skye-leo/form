<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>所有表单</title>
	
	<script src="http://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

	<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

	<script type="text/javascript" src="js/allforms.js"></script>
</head>
<body>
<div class="row">
	<div class="col-md-3"></div>
	<div class="col-md-6">
		<div>
		<div class="panel panel-info">
		<div class="panel-heading">所有表单</div>
		  <div class="panel-body">
			<table class="table table-condensed">
				<div class="bs-example" data-example-id="striped-table">
			    <table class="table table-striped">
			      <thead>
			        <tr>
			          <th>#</th>
			          <th>表单名称</th>
			          <th>查看表单</th>
			        </tr>
			      </thead>
			      <tbody>
			        
			      </tbody>
			    </table>
			  </div>			
			</table>
		  </div>	
		</div>
		
		<form action="addform" method="post" id="newform" style="padding-top: 30px;">
			<div class="panel panel-default"><div class="panel-heading">新建表单</div>
				<div class="panel-body">
					<div class="form-group">
						<label>请输入表单名称</label>
						<input type="text" class="form-control form_name" name="form_name" placeholder="name">
					</div>
					<a href="javascript:submit_btn();" type="button" class="btn btn-default submit">提交</a>	
				</div>
			</div>
		</form>
	</div>
	</div>
	<div class="col-md-3"></div>
</div>
</body>
</html>