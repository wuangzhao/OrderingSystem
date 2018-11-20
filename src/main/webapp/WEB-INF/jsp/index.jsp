<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: angzhao
  Date: 2018/10/3
  Time: 下午3:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>厨房妈妈</title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" href="css/amazeui.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/amazeui.min.js"></script>
</head>
<body>

<div data-am-widget="slider" class="am-slider am-slider-default" data-am-slider='{}'>
    <ul class="am-slides">
        <c:forEach items="${name}" var="picList">
            <li><img src="images/home/${picList.homeImgPath}"></li>
        </c:forEach>
    </ul>
</div>

<form action="/search">
    <input type="text" class="search" name="text"/>
</form>
<div data-am-widget="titlebar" class="am-titlebar am-titlebar-default title">
    <h2 class="am-titlebar-title "> 热门推荐 </h2>
    <nav class="am-titlebar-nav"><a href="/recommend" class="">more &raquo;</a></nav>
</div>
<ul data-am-widget="gallery" class="am-gallery am-avg-sm-2 am-avg-md-3 am-avg-lg-4 am-gallery-default product">
    <c:forEach items="${foods}" var="food">
        <li>
            <div class="am-gallery-item">
                <a href="/detail?foodId=${food.foodId}" class="">
                    <div class="image-container">
                        <img src="images/foodImg/${food.foodImg}" alt=""/>
                    </div>
                    <h3 class="am-gallery-title">${food.foodName}</h3>
                    <div class="am-gallery-desc"><em>${food.foodPrice}</em>
                        <a href="/shoppingCart/add?foodId=${food.foodId}" style="color: #F60;">
                            <i class="am-icon-cart-plus"></i>
                        </a>
                    </div>
                </a>
            </div>
        </li>
    </c:forEach>
</ul>
<div class="h50"></div>
<div data-am-widget="navbar" class="am-navbar am-cf am-navbar-default footer " id="">
    <ul class="am-navbar-nav am-cf am-avg-sm-4">
        <li><a href="/home" class=""> <span class=""><img src="images/nav.png"/></span> <span
                class="am-navbar-label">点餐</span> </a></li>
        <li><a href="/we" class=""> <span class=""><img src="images/nav3.png"/></span> <span
                class="am-navbar-label">我们</span> </a></li>
        <li><a href="/member" class=""> <span class=""><img src="images/nav4.png"/></span> <span
                class="am-navbar-label">我的</span> </a></li>
    </ul>
</div>
</body>
</html>
