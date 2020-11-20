<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86182
  Date: 2020/8/13
  Times: 12:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div class="col-sm-3 col-md-2 sidebar">
        <div class="tree">
            <ul style="padding-left:0px;" class="list-group">
                <li class="list-group-item tree-closed" >
                    <a href="findEmployeetrain_Employeeremove"><i class="glyphicon glyphicon-dashboard"></i> 工作安排</a>
                </li>
                <li class="list-group-item tree-closed">
                    <span><i class="glyphicon glyphicon glyphicon-tasks"></i> 员工资料 <span class="badge" style="float:right">2</span></span>
                    <ul style="margin-top:10px;display:none;">
                        <li style="height:30px;">
                            <a href="findUsers"><i class="glyphicon glyphicon-user"></i> 员工资料</a>
                        </li>
                        <li style="height:30px;">
                            <a href=""><i class="glyphicon glyphicon-user"></i> 部门资料</a>
                        </li>
                    </ul>
                </li>
                <li class="list-group-item tree-closed">
                    <span><i class="glyphicon glyphicon glyphicon-tasks"></i> 统计管理 <span class="badge" style="float:right">2</span></span>
                    <ul style="margin-top:10px;display:none;">
                        <li style="height:30px;">
                            <a href=""><i class="glyphicon glyphicon-check"></i> 员工考勤</a>
                        </li>
                        <li style="height:30px;">
                            <a href=""><i class="glyphicon glyphicon-check"></i> 打卡时间</a>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </div>

</body>
</html>
