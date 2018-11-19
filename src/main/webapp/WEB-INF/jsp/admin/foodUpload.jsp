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
    <title>食物上新</title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" href="../css/amazeui.min.css"/>
    <link rel="stylesheet" href="../css/style.css"/>
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/amazeui.min.js"></script>
    <script type="text/javascript" src="../js/my.js"></script>
</head>
<header data-am-widget="header" class="am-header am-header-default header">
    <div class="am-header-left am-header-nav">
        <a onClick="javascript :history.back(-1);">
            <i class="am-header-icon am-icon-angle-left"></i>
        </a>
    </div>
    <h1 class="am-header-title"><a href="#title-link" class="" style="color: #333;"></a></h1>
</header>
<div class="login">
    <form action="/admin/foodUpload" enctype="multipart/form-data" method="post">
        <div>
            <span>名称</span>
            <input type="text" name="foodName" placeholder="食物名称">
        </div>
        <div>
            <span>价格</span>
            <input type="text" name="foodPrice" placeholder="食物价格">
        </div>
        <div>
            <span>详情</span>
            <input type="text" name="foodDetails" placeholder="食物详情">
        </div>
        <div>
            <span>图片</span>
            <label for="uploadImage" class="login-label">上传图片</label>
            <input type="file" name="foodImgFile" id="uploadImage" class="input-file">
        </div>

        <input class="btnLogin" type="submit" value="上传">
    </form>
</div>
</body>
</html>

