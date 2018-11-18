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
<header data-am-widget="header" class="am-header am-header-default header">
    <div class="am-header-left am-header-nav">
        <a onClick="javascript :history.back(-1);">
            <i class="am-header-icon am-icon-angle-left"></i>
        </a>
    </div>
    <h1 class="am-header-title"> <a class="" style="color: #333;">推荐</a></h1>
</header>
<div class="search-input">
    <form action="/search">
        <input type="text" placeholder="请输入您搜索的内容" name="text"/>
    </form>
</div>
<ul data-am-widget="gallery" class="am-gallery am-avg-sm-2 am-avg-md-3 am-avg-lg-4 am-gallery-default product">
<c:forEach items="${foods}" var="food">
    <li>
        <div class="am-gallery-item">
            <a href="/detail?foodId=${food.foodId}" class="">
                <img src="images/foodImg/${food.foodImg}"  alt=""/>
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
    <%--<li>--%>
        <%--<div class="am-gallery-item">--%>
            <%--<a href="/detail?foodId=${food.foodId}" class="">--%>
                <%--<img src="images/p.png"  alt=""/>--%>
                <%--<h3 class="am-gallery-title">商务单人餐</h3>--%>
                <%--<div class="am-gallery-desc">--%>
                    <%--<em>￥50</em><i class="am-icon-cart-plus"></i>--%>
                <%--</div>--%>
            <%--</a>--%>
        <%--</div>--%>
    <%--</li>--%>
    <%--<li>--%>
        <%--<div class="am-gallery-item">--%>
            <%--<a href="detail.html" class="">--%>
                <%--<img src="images/p1.png"  alt=""/>--%>
                <%--<h3 class="am-gallery-title">虐狗情人杯</h3>--%>
                <%--<div class="am-gallery-desc">--%>
                    <%--<em>￥50</em><i class="am-icon-cart-plus"></i>--%>
                <%--</div>--%>
            <%--</a>--%>
        <%--</div>--%>
    <%--</li>--%>
    <%--<li>--%>
        <%--<div class="am-gallery-item">--%>
            <%--<a href="detail.html" class="">--%>
                <%--<img src="images/p2.png"  alt=""/>--%>
                <%--<h3 class="am-gallery-title">卤香滑鸡 </h3>--%>
                <%--<div class="am-gallery-desc">--%>
                    <%--<em>￥50</em><i class="am-icon-cart-plus"></i>--%>
                <%--</div>--%>
            <%--</a>--%>
        <%--</div>--%>
    <%--</li>--%>
    <%--<li>--%>
        <%--<div class="am-gallery-item">--%>
            <%--<a href="detail.html" class="">--%>
                <%--<img src="images/p3.png"  alt=""/>--%>
                <%--<h3 class="am-gallery-title">酷炫绵绵球</h3>--%>
                <%--<div class="am-gallery-desc">--%>
                    <%--<em>￥50</em><i class="am-icon-cart-plus"></i>--%>
                <%--</div>--%>
            <%--</a>--%>
        <%--</div>--%>
    <%--</li>--%>
</ul>
</body>
</html>

