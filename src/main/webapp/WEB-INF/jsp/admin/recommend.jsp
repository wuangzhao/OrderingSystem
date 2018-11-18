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
    <meta charset="utf-8"/>
    <title>厨房妈妈</title>
    <!--sucai58.com 专注html3+css3素材的网站-->
    <meta name="description" content="厨房妈妈"/>
    <meta name="keywords" content="厨房妈妈"/>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" href="../css/amazeui.min.css"/>
    <link rel="stylesheet" href="../css/style.css"/>
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/amazeui.min.js"></script>
</head>
<body>
<header data-am-widget="header" class="am-header am-header-default header">
    <div class="am-header-left am-header-nav">
        <a onClick="javascript :history.back(-1);">
            <i class="am-header-icon am-icon-angle-left"></i>
        </a>
    </div>
    <h1 class="am-header-title"><a class="" style="color: #333;">食物列表</a></h1>
</header>
<div class="c-comment-list" style="border: 0; padding-left: 5%; font-size: 20px">
    <c:forEach items="${foodList}" var="food">
        <div style="overflow: hidden">
            <div class="o-con-img"><img src="../images/foodImg/${food.foodImg}"></div>
            <div class="o-con-txt">
                <p>${food.foodName}</p>
                <p class="price">￥${food.foodPrice}</p>
            </div>
            <div class="c-com-btn">
                <a href="/admin/recommendDelete?foodId=${food.foodId}"
                   style="position: relative; bottom: -100%; border: 2px solid #ff1a16;color: #ff1a16;">删除推荐</a>
            </div>
            <div class="clear2"></div>
        </div>
    </c:forEach>
</div>
<div class="c-comment-list" style="border: 0; padding-left: 5%; font-size: 20px">
    <c:forEach items="${notCommendList}" var="food">
        <div style="overflow: hidden">
            <div class="o-con-img"><img src="../images/foodImg/${food.foodImg}"></div>
            <div class="o-con-txt">
                <p>${food.foodName}</p>
                <p class="price">￥${food.foodPrice}</p>
            </div>
            <div class="c-com-btn">
                <a href="/admin/recommendAdd?foodId=${food.foodId}"  style="position: relative; bottom: -100%;">添加推荐</a>
            </div>
            <div class="clear2"></div>
        </div>
    </c:forEach>
</div>

</body>
</html>

