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
    <title>厨房妈妈</title>
    <!--sucai58.com 专注html3+css3素材的网站-->
    <meta name="description" content="厨房妈妈" />
    <meta name="keywords" content="厨房妈妈"/>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
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
    <li><a href="/address?userId=${userId}"><i class="am-icon-map-marker"></i><span>收货地址</span></a></li>
    <li><a href="/order?userId=${userId}"><i class="am-icon-newspaper-o"></i><span>我的订单</span></a></li>
    <li><a href="/shoppingCart?userId=${userId}"><i class="am-icon-cart-arrow-down"></i><span>购物车</span></a></li>
</ul>
<ul class="member-nav mt">
    <li><a href=""><i class="am-icon-phone"></i>联系我们</a></li>
</ul>
<div class="h50"></div>
<div data-am-widget="navbar" class="am-navbar am-cf am-navbar-default footer "  id="">
    <ul class="am-navbar-nav am-cf am-avg-sm-4">
        <li >
            <a href="/home" class="">
                <span class=""><img src="images/nav.png"/></span>
                <span class="am-navbar-label">点餐</span>
            </a>
        </li>
        <li>
            <a href="we.html" class="">
                <span class=""><img src="images/nav3.png"/></span>
                <span class="am-navbar-label">我们</span>
            </a>
        </li>
        <li >
            <a href="/member" class="">
                <span class=""><img src="images/nav4.png"/></span>
                <span class="am-navbar-label">我的</span>
            </a>
        </li>

    </ul>
</div>

</body>
</html>

