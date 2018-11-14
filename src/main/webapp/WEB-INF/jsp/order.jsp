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
    <title>厨房妈妈</title>
    <!--sucai58.com 专注html3+css3素材的网站-->
    <meta name="description" content="厨房妈妈"/>
    <meta name="keywords" content="厨房妈妈"/>
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
    <h1 class="am-header-title"><a href="#title-link" class="" style="color: #333;">全部订单</a></h1>
</header>
<ul class="order-style">
    <li id="li1"  style="border-bottom: 2px solid #ff5500;
    background: transparent;" onclick="a2(this)"><a>全部</a></li>
    <li id="li2" onclick="a2(this)"><a>待付款</a></li>
    <li id="li3" onclick="a2(this)"><a>已完成</a></li>
</ul>
<iframe id="id_iframe" name="nm_iframe" style="display:none;"></iframe>
<div id="all1">
    <c:forEach items="${orderFormList}" var="order">
        <div class="c-comment">
            <span class="c-comment-num">订单编号：${order.orderFormId}</span>
            <span class="c-comment-suc">${order.status}</span>
        </div>

        <div class="c-comment-list" style="border: 0;">
            <c:forEach items="${order.orderFormDetailList}" var="detail" varStatus="varStatus">
                <a class="o-con" href="/detail?foodId=${detail.foodId}">
                    <div class="o-con-img"><img src="images/foodImg/${detail.foodImg}"></div>
                    <div class="o-con-txt">
                        <p>${detail.foodName}</p>
                        <p class="price">￥${detail.foodPrice}</p>
                        <p>合计：<span>￥${detail.totalPrice}</span></p>
                    </div>
                    <div class="o-con-much"><h4>x${detail.amount}</h4></div>
                </a>
                <div class="clear1"></div>
            </c:forEach>
            <br/>
            <div class="c-com-money">共计${order.totalAmount}个商品 实付金额：<span>￥ ${order.totalPrice}</span></div>
        </div>
        <div class="c-com-btn" name="service">
            <input type="hidden" value="${order.status}" name="status">
            <a href="/order/pay?orderFormId=${order.orderFormId}">立即支付</a>
            <a href="/order/cancel?orderFormId=${order.orderFormId}">取消订单</a>
        </div>
        <div class="clear"></div>
    </c:forEach>
</div>
<div id="all2" style="display: none;">
    <c:forEach items="${waitPayOrderFormList}" var="order">
        <div class="c-comment">
            <span class="c-comment-num">订单编号：${order.orderFormId}</span>
            <span class="c-comment-suc">${order.status}</span>
        </div>

        <div class="c-comment-list" style="border: 0;">
            <c:forEach items="${order.orderFormDetailList}" var="detail">
                <a class="o-con" href="/detail?foodId=${detail.foodId}">
                    <div class="o-con-img"><img src="images/foodImg/${detail.foodImg}"></div>
                    <div class="o-con-txt">
                        <p>${detail.foodName}</p>
                        <p class="price">￥${detail.foodPrice}</p>
                        <p>合计：<span>￥${detail.totalPrice}</span></p>
                    </div>
                    <div class="o-con-much"><h4>x${detail.amount}</h4></div>

                </a>
            </c:forEach>
            <br/>
            <div class="c-com-money">共计${order.totalAmount}个商品 实付金额：<span>￥ ${order.totalPrice}</span></div>
        </div>
        <div class="c-com-btn" name="service">
            <input type="hidden" value="${order.status}" name="status">
            <a href="/order/pay?orderFormId=${order.orderFormId}">立即支付</a>
            <a href="/order/cancel?orderFormId=${order.orderFormId}">取消订单</a>
        </div>
        <div class="clear"></div>
    </c:forEach>
</div>
<div id="all3" style="display: none;">
    <c:forEach items="${waitCommentOrderFormList}" var="order">
        <div class="c-comment">
            <span class="c-comment-num">订单编号：${order.orderFormId}</span>
            <span class="c-comment-suc">${order.status}</span>
        </div>

        <div class="c-comment-list" style="border: 0;">
            <c:forEach items="${order.orderFormDetailList}" var="detail">
                <a class="o-con" href="/detail?foodId=${detail.foodId}">
                    <div class="o-con-img"><img src="images/foodImg/${detail.foodImg}"></div>
                    <div class="o-con-txt">
                        <p>${detail.foodName}</p>
                        <p class="price">￥${detail.foodPrice}</p>
                        <p>合计：<span>￥${detail.totalPrice}</span></p>
                    </div>
                    <div class="o-con-much"><h4>x${detail.amount}</h4></div>
                </a>
            </c:forEach>
            <br/>
            <div class="c-com-money">共计${order.totalAmount}个商品 实付金额：<span>￥ ${order.totalPrice}</span></div>
        </div>
        <div class="clear"></div>
    </c:forEach>
</div>
</body>
</html>
