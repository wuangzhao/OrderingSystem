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
    <title>厨房妈妈</title>
    <meta name="description" content="厨房妈妈" />
    <meta name="keywords" content="厨房妈妈"/>
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <link rel="stylesheet" href="css/amazeui.min.css" />
    <link rel="stylesheet" href="css/style.css" />
    <script type="text/javascript" src="js/jquery.min.js" ></script>
    <script type="text/javascript" src="js/amazeui.min.js" ></script>
</head>
<body>
<div data-am-widget="slider" class="am-slider am-slider-default" data-am-slider='{}' >
    <ul class="am-slides">
        <li><img src="images/foodImg/${food.foodImg}"> </li>

    </ul>
</div>
<div class="detail">
    <h2>${food.foodName}</h2>
    <div class="price">
        <b>￥${food.foodPrice}</b><span>（积分可抵扣5元）</span>
    </div>
    <div class="kucun">
        <p>库存：${food.foodReserve}</p>
        <p>运费：免运费</p>
    </div>
</div>
<div class="comment">
    <h2>宝贝评价（0）</h2>
    <ul>
        <li><a hhref="">有图（0）</a></li>
        <li><a hhref="">好评（0）</a></li>
        <li><a hhref="">中评（0）</a></li>
        <li><a hhref="">差评（0）</a></li>
    </ul>
</div>
<div class="detail-con">
    ${food.foodDetails}
</div>
<div class="h50"></div>
<ul class="fixed-btn">
    <li ><a href="" class="current">立即购买</a></li>
    <li><a href="javascript:;">加入购物车</a></li>
</ul>
</body>
</html>

</html>
