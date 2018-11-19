<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: angzhao
  Date: 2018/11/2
  Time: 下午12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <title>查找</title>
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
    <h1 class="am-header-title"> <a class="" style="color: #333;">厨房妈妈</a></h1>
</header>
<div class="search-input">
    <form action="/search">
        <input type="text" placeholder="请输入您搜索的内容" name="text"/>
    </form>
</div>
<ul data-am-widget="gallery" class="am-gallery am-avg-sm-2 am-avg-md-3 am-avg-lg-4 am-gallery-default product">
    <c:forEach items="${foodList}" var="food">
        <li>
            <div class="am-gallery-item">
                <a href="/detail?foodId=${food.foodId}" class="">
                    <div class="image-container">
                        <img src="images/foodImg/${food.foodImg}"  alt=""/>
                    </div>
                    <h3 class="am-gallery-title">${food.foodName}</h3>
                    <div class="am-gallery-desc">
                        <em>￥${food.foodPrice}</em>
                        <i class="am-icon-cart-plus">
                        </i>
                    </div>
                </a>
            </div>
        </li>
    </c:forEach>
</ul>
</body>
</html>

