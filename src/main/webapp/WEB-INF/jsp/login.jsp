<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: angzhao
  Date: 2018/11/5
  Time: 下午7:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>用户登陆</title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" href="css/amazeui.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/amazeui.min.js"></script>
    <script type="text/javascript" src="js/my.js"></script>
</head>
<body onload="service()">
<header data-am-widget="header" class="am-header am-header-default header">
    <div class="am-header-left am-header-nav">
        <a onClick="javascript :history.back(-1);">
            <i class="am-header-icon am-icon-angle-left"></i>
        </a>
    </div>
    <h1 class="am-header-title"><a href="#title-link" class="" style="color: #333;">登陆</a></h1>
</header>
<div class="login">
    <form action="/login/check">
        <div >
            <span>手机号</span>
            <input type="text" name="userTel" placeholder="输入手机号">
        </div>
        <div>
            <span>密码</span>
            <input type="password" name="userPassword" placeholder="输入密码">
        </div>
        <input class="btnLogin" type="submit" value="登陆">
    </form>
    <a class="btnRegister" href="/login/register">注册</a>
</div>
</body>
</html>
