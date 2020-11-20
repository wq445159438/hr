<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="utf-8">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

	<link rel="stylesheet" href="../static/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="../static/css/font-awesome.min.css">
	<link rel="stylesheet" href="../static/css/main.css">
	<style>
	.tree li {
        list-style-type: none;
		cursor:pointer;
	}
	.tree-closed {
	    height : 40px;
	}
	.tree-expanded {
	    height : auto;
	}
	</style>
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <div><a class="navbar-brand" style="font-size:32px;" href="#">微人事管理系统</a></div>
        </div>
		  <jsp:include page="include/head.jsp"></jsp:include>
      </div>
    </nav>
    <div class="container-fluid">
		<jsp:include page="include/left.jsp"></jsp:include>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">员工信息详情</h1>
			<div class="table-responsive">
				<table class="table  table-bordered">
					<thead>
					<tr>
						<th width="20%">工号</th><th
							style="font-weight:normal">${users.workId}</th>
					</tr>
					<tr>
						<th>姓名</th><th style="font-weight:normal">${users.u_name}</th>
					</tr>
					<tr>
						<th>性别</th>
						<th style="font-weight:normal">
							<c:if test="${users.sex == 0}">男</c:if>
							<c:if test="${users.sex == 1}">女</c:if>
						</th>
					</tr>
					<tr>
						<th>出生日期</th>
						<th style="font-weight:normal">
							<fmt:formatDate value="${users.birthday}" pattern="yyyy-MM-dd"/>
						</th>
					</tr>
					<tr>
						<th>身份证号</th><th style="font-weight:normal">${users.identityCard}</th>
					</tr>
					<tr>
						<th>家庭住址</th><th style="font-weight:normal">${users.address}</th>
					</tr>
					<tr>
						<th>电话号码</th><th style="font-weight:normal">${users.phone}</th>
					</tr>
					<tr>
						<th>所属部门</th><th style="font-weight:normal">${users.dep_name}</th>
					</tr>
					<tr>
						<th>职位</th><th style="font-weight:normal">${users.pos_name}</th>
					</tr>
					<tr>
						<th>上班时间</th><th style="font-weight:normal"><fmt:formatDate value="${users.s_ban}" pattern="HH:mm"/></th>
					</tr>
					<tr>
						<th>下班时间</th><th style="font-weight:normal"><fmt:formatDate value="${users.x_ban}" pattern="HH:mm"/></th>
					</tr>
					<tr>
						<th>员工状态</th>
						<th style="font-weight:normal">
							<c:if test="${users.u_state == 0}">在职</c:if>
							<c:if test="${users.u_state == 1}">离职</c:if>
						</th>
					</tr>
					</thead>
				</table>
			</div>
        </div>
      </div>
    </div>
    <script src="../static/jquery/jquery-2.1.1.min.js"></script>
    <script src="../static/bootstrap/js/bootstrap.min.js"></script>
	<script src="../static/script/docs.min.js"></script>
        <script type="text/javascript">
            $(function () {
			    $(".list-group-item").click(function(){
				    if ( $(this).find("ul") ) {
						$(this).toggleClass("tree-closed");
						if ( $(this).hasClass("tree-closed") ) {
							$("ul", this).hide("fast");
						} else {
							$("ul", this).show("fast");
						}
					}
				});
            });
        </script>
  </body>
</html>
