<%--
  Created by IntelliJ IDEA.
  User: lvdongting
  Date: 2022/12/13
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD
HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>登录</title>
    <style>
        #a {

            width:50%;
            height:200px;
            border: 1px dashed ;
            background-color:lightyellow;
            text-align:center;
        }
        body{
            background-color:lightblue;
        }
    </style>
</head>
<body>
<%@include file="pageguide510.jsp" %>

<div id="a">
    <h1>登录界面</h1>
    <form action="userindex614.jsp" method="post">
        账号:<input type="text" name="id"/>
        <br>
        密码:<input type="password" name="password"/>
        <br>

        <input type="submit" value="login"/>
        没有账号？<a href ="register614.jsp">注册账号</a>
    </form>
</div>
<%@include file="pageguide510.jsp" %>

</body>
</html>


