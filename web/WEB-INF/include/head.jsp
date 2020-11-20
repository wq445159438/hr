<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/8/14
  Time: 12:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="navbar" class="navbar-collapse collapse">
    <ul class="nav navbar-nav navbar-right">
        <li style="padding-top:8px;">
            <div class="btn-group">
                <button type="button" class="btn btn-default btn-success dropdown-toggle" data-toggle="dropdown">
                    <i class="glyphicon glyphicon-user"></i> ${login.u_name} <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu">
                    <li><a href="/addLeaveUI"><i class="glyphicon glyphicon-cog"></i> 申请请假</a></li>
                    <li class="divider"></li>
                    <li><a href="quit"><i class="glyphicon glyphicon-off"></i> 退出系统</a></li>
                </ul>
            </div>
        </li>
        <li style="margin-left:10px;padding-top:8px;">
            <button type="button" class="btn btn-default btn-info <c:if test="${beginTime!=null}">disabled</c:if>" <c:if test="${beginTime==null}">onclick="javascript:sBan()"</c:if>>
                <span id="sBan">
                    <c:if test="${beginTime==null}">上班打卡</c:if>
                    <c:if test="${beginTime!=null}">上班已打卡</c:if>
                </span>
            </button>
            <button type="button" class="btn btn-default btn-danger <c:if test="${endTime!=null}">disabled</c:if>" <c:if test="${endTime==null}">onclick="javascript:xBan()"</c:if>>
                <span id="xBan">
                    <c:if test="${endTime==null}">下班打卡</c:if>
                    <c:if test="${endTime!=null}">下班已打卡</c:if>
                </span>
            </button>
        </li>
    </ul>

</div>
</body>
    <script src="../static/jquery/jquery-2.1.1.min.js"></script>
    <script type="text/javascript">
        function sBan() {
            if(confirm("您确定要打上班卡吗?")){
                location.href="sBan?u_id=${login.u_id}";
            }
        }

        function xBan() {
            if(confirm("您确定要打下班卡吗?")){
                location.href="xBan?u_id=${login.u_id}";
            }
        }
    </script>
</html>
