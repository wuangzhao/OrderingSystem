<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: angzhao
  Date: 2018/10/31
  Time: 下午1:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>${food.foodName}</title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <link rel="stylesheet" href="css/amazeui.min.css" />
    <link rel="stylesheet" href="css/style.css" />
    <script type="text/javascript" src="js/jquery.min.js" ></script>
    <script type="text/javascript" src="js/amazeui.min.js" ></script>
</head>
<body>
<header data-am-widget="header" class="am-header am-header-default header">
    <div class="am-header-left am-header-nav">
        <a onClick="javascript :history.back(-1);">
            <i class="am-header-icon am-icon-angle-left"></i>
        </a>
    </div>
    <h1 class="am-header-title"><a href="#title-link" class="" style="color: #333;">详情</a></h1>
</header>
<div data-am-widget="slider" class="am-slider am-slider-default" data-am-slider='{}' >
    <ul class="am-slides">
        <li>
            <div class="image-container">
                <img src="images/foodImg/${food.foodImg}">
            </div>
        </li>

    </ul>
</div>
<div class="detail">
    <h2>${food.foodName}</h2>
    <div class="price">
        <b>￥${food.foodPrice}</b>
    </div>
</div>
<div class="comment">
    <h2>详情</h2>

</div>
<div class="detail-con">
    ${food.foodDetails}
</div>
<div class="h50"></div>
<ul class="fixed-btn">
    <li ><a href="/shoppingCart/add?foodId=${food.foodId}" class="current">加入购物车</a></li>
</ul>
</body>
</html>

</html>
