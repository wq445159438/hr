<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
            cursor: pointer;
        }

        .tree-closed {
            height: 40px;
        }

        .tree-expanded {
            height: auto;
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
        <h1 class="page-header">员工信息</h1>
        <div class="table-responsive">
            <form action="findEmployee" method="post" id="searchForm">
                <input type="hidden" name="pageNum" id="pageNum">
                用户名称：<input type="text" name="empName"
                            value="${users.usersName}" style="padding-left: auto">
                <input type="submit" value="查询">
            </form>

                <a href="/addUsersUI">新增用户</a>

            <form action="deleteEmployeeByIds" method="post" id="delForm">
                <table class="table  table-bordered">
                    <thead>
                    <tr>
                        <th width="5%">工号</th>
                        <th width="5%">姓名</th>
                        <th width="5%">性别</th>
                        <th width="10%">出生日期</th>
                        <th width="30%">家庭住址</th>
                        <th width="10%">电话</th>
                        <th width="10%">部门</th>
                        <th width="10%">职位</th>
                        <th width="10%">操作</th>
                    </tr>
                    </thead>
                    <tbody id="userData">
                    <c:forEach items="${users1}" var="users" varStatus="status">
                        <tr <c:if test="${status.index % 2 == 1}"> style="background-color: #d0edf9"</c:if>>
                            <td>${users.workId}</td>
                            <td>${users.u_name}</td>
                            <td>
                                <c:if test="${users.sex == 0}">男</c:if>
                                <c:if test="${users.sex == 1}">女</c:if>
                            </td>
                            <td>
                                <fmt:formatDate value="${users.birthday}" pattern="yyyy-MM-dd"/>
                            </td>
                            <td>${users.address}</td>
                            <td>${users.phone}</td>
                            <td>${users.dep_name}</td>
                            <td>${users.pos_name}</td>

                            <td><a href="findUsersById?u_id=${users.u_id}">详情</a>

                                    <a href="deleteUsersById?u_id=${users.u_id}" onclick="del()">删除</a>
                                    <a href="updateUsersUI?u_id=${users.u_id}">修改</a>

                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

            </form>
        </div>
    </div>
</div>
</div>
<script src="../static/jquery/jquery-2.1.1.min.js"></script>
<script src="../static/bootstrap/js/bootstrap.min.js"></script>
<script src="../static/script/docs.min.js"></script>
<script type="text/javascript">
    $(function () {
        $(".list-group-item").click(function () {
            if ($(this).find("ul")) {
                $(this).toggleClass("tree-closed");
                if ($(this).hasClass("tree-closed")) {
                    $("ul", this).hide("fast");
                } else {
                    $("ul", this).show("fast");
                }
            }
        });
    });

    function del(){
        if(window.confirm('你确定要删除吗')){
            //后台删除数据方法
            return true;
        }else{
            return false;
        }
    }
</script>
</body>
</html>
