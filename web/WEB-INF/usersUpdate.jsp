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
            cursor: pointer;
        }

        .tree-closed {
            height: 40px;
        }

        .tree-expanded {
            height: auto;
        }
    </style>
    <script type="text/javascript"
            src="../static/My97DatePicker/WdatePicker.js"></script>
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
            <form action="updateUsers" method="post">
                <input type="hidden" name="u_id" value="${users.u_id}">
                <table class="table  table-bordered">
                    <thead>
                    <tr>
                        <td>工号</td>
                        <td><input type="text" name="workId"
                                   value="${users.workId}" disabled></td>
                    </tr>
                    <tr>
                        <td>姓名</td>
                        <td style="font-weight:normal">
                            <input
                                    type="text" name="u_name"
                                    value="${users.u_name}" disabled></td>
                    </tr>
                    <tr>
                        <td>性别</td>
                        <td style="font-weight:normal">
                            <input type="radio" name="sex" <c:if test="${users.sex==0}">checked="checked"</c:if> value="0">男
                            <input type="radio" name="sex" <c:if test="${users.sex==1}">checked="checked"</c:if> value="1">女
                        </td>
                    </tr>
                    <tr>
                        <td>出生日期</td>
                        <td
                                style="font-weight:normal">
                            <input onclick="WdatePicker({skin:'whyGreen',lang:'zh-cn'})"
                                   class="Wdate"
                                   type="text"
                                   name="birthday"  value="<fmt:formatDate value="${users.birthday}" pattern="yyyy-MM-dd"/>">

                            格式：年-月-日
                        </td>
                    </tr>
                    <tr>
                        <td>身份证号</td>
                        <td
                                style="font-weight:normal"><input type="text"
                                                                  name="identityCard"
                                                                  value="${users.identityCard}"></td>
                    </tr>
                    <tr>
                        <td>电话号码</td>
                        <td style="font-weight:normal">
                            <input type="text" name="phone"
                                   value="${users.phone}"></td>
                    </tr>
                    <tr>
                        <td>联系地址</td>
                        <td
                                style="font-weight:normal"><input type="text"
                                                                  name="address"
                                                                  value="${users.address}"></td>
                    </tr>
                    <tr>
                        <td>所属部门</td>
                        <td style="font-weight:normal">
                            <select name="dep_id">
                                <c:forEach items="${departmentList}"
                                           var="department">
                                    <option <c:if test="${department.dep_id==users.dep_id}">selected</c:if>
                                            value="${department.dep_id}">${department.dep_name}
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>职位</td>
                        <td style="font-weight:normal">
                            <select name="pos_id">
                                    <c:forEach items="${positionList}" var="position">
                                        <option <c:if test="${position.pos_id==users.pos_id}">selected</c:if> value="${position.pos_id}"> ${position.pos_name}</option>
                                    </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>在职状态</td>
                        <td>
                            <select name="u_state" <c:if test="${login.dep_id != 3}">disabled</c:if>>
                                <option value="0" <c:if test="${users.u_state == 0}">selected</c:if>>在职</option>
                                <option value="1" <c:if test="${users.u_state == 0}">selected</c:if>>离职</option>
                            </select>
                        </td>
                    </tr>
                    <tr >
                        <td style="padding-top: 25px">修改密码</td>
                        <td>
                            原密码<input type="text" name="password" value="${users.password}"/><br/>
                            新密码<input type="password" name="pwd"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" >
                            <input type="submit" value="提交" style="margin-left: 45%">
                            <input type="reset" value="重置">
                        </td>
                    </tr>
                    </thead>
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
</script>
</body>
</html>
