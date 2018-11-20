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
    <title>购物车</title>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <link rel="stylesheet" href="css/amazeui.min.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/amazeui.min.js"></script>
    <script type="text/javascript" src="js/my.js"></script>
</head>
<body>
<header data-am-widget="header" class="am-header am-header-default header">
    <div class="am-header-left am-header-nav">
        <a onClick="javascript :history.back(-1);">
            <i class="am-header-icon am-icon-angle-left"></i>
        </a>
    </div>
    <h1 class="am-header-title"><a class="" style="color: #333;">购物车</a></h1>
</header>
<ul class="order-style">
    <li id="li1"  style="border-bottom: 2px solid #ff5500;
    background: transparent; " onclick="a2(this)"><a>共${shoppingCart.amount}个商品</a></li>
</ul>
<div class="c-comment-list" style="border: 0;">
    <c:forEach items="${shoppingCart.foodAndAmountModelList}" var="detail" varStatus="varStatus">
        <a class="o-con" href="/detail?foodId=${detail.foodEntity.foodId}">
            <div class="o-con-img"><img src="images/foodImg/${detail.foodEntity.foodImg}"></div>
            <div class="o-con-txt">
                <p>${detail.foodEntity.foodName}</p>
                <p class="price">￥${detail.foodEntity.foodPrice}</p>
            </div>
            <div class="o-con-much"><h4>x${detail.foodAmount}</h4></div>
        </a>
        <div class="clear1"></div>
    </c:forEach>
    <div class="c-com-money">金额：<span>￥ ${shoppingCart.totalPrice}</span></div>
    <div class="c-com-btn" name="service">
        <form name="pay" action="/shoppingCart/pay">
            <input type="submit" name="payOrderForm" value="结算"/>
        </form>
    </div>
</div>
</body>
</html>
