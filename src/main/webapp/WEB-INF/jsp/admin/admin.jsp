<%--
  Created by IntelliJ IDEA.
  User: angzhao
  Date: 2018/11/2
  Time: 下午1:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>后台管理</title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" href="css/amazeui.min.css" />
    <link rel="stylesheet" href="css/style.css" />
    <script type="text/javascript" src="js/jquery.min.js" ></script>
    <script type="text/javascript" src="js/amazeui.min.js" ></script>
</head>
<body>
<div class="member">
    <div class="member-pic">
        <img src="images/default_photo.png" />
    </div>
    <div class="member-infor">${username}</div>
</div>
<ul class="member-nav">
    <li><a href="/admin/order"><i class="am-icon-newspaper-o"></i><span>待交付订单</span></a></li>
    <li><a href="/admin/foodUpload"><i class="am-icon-newspaper-o"></i><span>上架</span></a></li>
    <li><a href="/admin/foodDelete"><i class="am-icon-newspaper-o"></i><span>下架</span></a></li>
    <li><a href="/admin/slideShow"><i class="am-icon-newspaper-o"></i><span>轮播图</span></a></li>
    <li><a href="/admin/recommend"><i class="am-icon-newspaper-o"></i><span>推荐</span></a></li>
</ul>
<div class="h50"></div>
<div data-am-widget="navbar" class="am-navbar am-cf am-navbar-default footer "  id="">
    <ul class="am-navbar-nav am-cf am-avg-sm-4">
        <li > <a href="/member" class=""> <span class=""><img src="images/nav4.png"/></span> <span class="am-navbar-label">管理员</span> </a> </li>
    </ul>
</div>
</body>
</html>