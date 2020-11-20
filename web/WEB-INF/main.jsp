<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="GB18030">
  <head>
    <meta charset="GB18030">
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
      <div class="row">
		<jsp:include page="include/left.jsp"></jsp:include>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">工作安排</h1>
			<div class="table-responsive">
				<table class="table  table-bordered">
					<thead>
					<tr >
						<th width="3%">#</th>
						<th width="42%">培训工作安排</th>
						<th width="15%">人员</th>
						<th width="15%">工号</th>
						<th width="15%">部门</th>
						<th width="10%">日期</th>
					</tr>
					</thead>
					<tbody>
					<c:forEach items="${employeetrainList}" var="employeetrain" varStatus="status">
						<tr  <c:if test="${status.index % 2 == 1}"> style="background-color: #d0edf9"</c:if>>
							<td>${status.count}</td>
							<td>${employeetrain.trainContent}</td>
							<td>${employeetrain.employeeName}</td>
							<td>${employeetrain.workID}</td>
							<td>${employeetrain.departmentName}</td>
							<td>
								<fmt:formatDate value="${employeetrain.trainDate}" pattern="yyyy-MM-dd"/>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
			</div>

			<div class="table-responsive">
				<table class="table  table-bordered">
					<thead>
					<tr >
						<th width="3%">#</th>
						<th width="42%">调动工作安排</th>
						<th width="15%">人员</th>
						<th width="15%">工号</th>
						<th width="15%">部门</th>
						<th width="10%">日期</th>
					</tr>
					</thead>
					<tbody>
					<c:forEach items="${employeeremoveList}" var="employeeremove" varStatus="status">
						<tr  <c:if test="${status.index % 2 == 1}"> style="background-color: #d0edf9"</c:if>>
							<td>${status.count}</td>
							<td>${employeeremove.reason}</td>
							<td>${employeeremove.employeeName}</td>
							<td>${employeeremove.workID}</td>
							<td>${employeeremove.beforeDepName}</td>
							<td>
								<fmt:formatDate value="${employeeremove.removeDate}" pattern="yyyy-MM-dd"/>
							</td>
						</tr>
					</c:forEach>
					</tbody>
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
