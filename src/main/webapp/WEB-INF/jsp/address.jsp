<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: angzhao
  Date: 2018/11/4
  Time: 下午8:51
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
    <h1 class="am-header-title"> <a href="#title-link" class="" style="color: #333;">收货地址</a></h1>
    <div class="am-header-right am-header-nav">
        <a href="#right-link" class=""> </a>
    </div>
</header>
<ul class="address-list">
    <c:forEach items="${addressList}" var="address">
        <li>
            <p>收货人：${address.receiver}&nbsp;&nbsp;${address.telPhone}</p>
            <p class="order-add1">收货地址：${address.address}</p>
            <hr>
            <div class="address-cz">
                <label class="am-radio am-warning">
                    <input type="radio" name="radio3" value="" data-am-ucheck="" checked="" class="am-ucheck-radio"><span class="am-ucheck-icons"><i class="am-icon-unchecked"></i><i class="am-icon-checked"></i></span> 设为默认
                </label>
                <a href=""><img src="images/bj.png" style="width: 18px;">&nbsp;编辑</a>
                <a href="">删除</a>
            </div>
        </li>
    </c:forEach>
    <%--<li class="curr">--%>
        <%--<p>收货人：安女士&nbsp;&nbsp;153********</p>--%>
        <%--<p class="order-add1">收货地址：河北省廊坊市 青云谱区解放西路258号河北省廊坊市 青云谱区解放西路258号</p>--%>
        <%--<hr>--%>
        <%--<div class="address-cz">--%>
            <%--<label class="am-radio am-warning">--%>
                <%--<input type="radio" name="radio3" value="" data-am-ucheck="" checked="" class="am-ucheck-radio"><span class="am-ucheck-icons"><i class="am-icon-unchecked"></i><i class="am-icon-checked"></i></span> 设为默认--%>
            <%--</label>--%>
            <%--<a href=""><img src="images/bj.png" style="width: 18px;">&nbsp;编辑</a>--%>
            <%--<a href="">删除</a>--%>
        <%--</div>--%>
    <%--</li>--%>
    <%--<li>--%>
        <%--<p>收货人：安女士&nbsp;&nbsp;182********</p>--%>
        <%--<p class="order-add1">收货地址：河北省廊坊市 青云谱区解放西路258号河北省廊坊市 青云谱区解放西路258号</p>--%>
        <%--<hr>--%>
        <%--<div class="address-cz">--%>
            <%--<label class="am-radio am-warning">--%>
                <%--<input type="radio" name="radio3" value="" data-am-ucheck="" class="am-ucheck-radio"><span class="am-ucheck-icons"><i class="am-icon-unchecked"></i><i class="am-icon-checked"></i></span> 设为默认--%>
            <%--</label>--%>
            <%--<a href=""><img src="images/bj.png" style="width: 18px;">&nbsp;编辑</a>--%>
            <%--<a href="">删除</a>--%>
        <%--</div>--%>
    <%--</li>--%>
    <%--<li>--%>
        <%--<p>收货人：安女士&nbsp;&nbsp;182********</p>--%>
        <%--<p class="order-add1">收货地址：河北省廊坊市 青云谱区解放西路258号河北省廊坊市 青云谱区解放西路258号</p>--%>
        <%--<hr>--%>
        <%--<div class="address-cz">--%>
            <%--<label class="am-radio am-warning">--%>
                <%--<input type="radio" name="radio3" value="" data-am-ucheck="" class="am-ucheck-radio"><span class="am-ucheck-icons"><i class="am-icon-unchecked"></i><i class="am-icon-checked"></i></span> 设为默认--%>
            <%--</label>--%>
            <%--<a href=""><img src="images/bj.png" style="width: 18px;">&nbsp;编辑</a>--%>
            <%--<a href="">删除</a>--%>
        <%--</div>--%>
    <%--</li>--%>
    <%--<li>--%>
        <%--<p>收货人：安女士&nbsp;&nbsp;182********</p>--%>
        <%--<p class="order-add1">收货地址：河北省廊坊市 青云谱区解放西路258号河北省廊坊市 青云谱区解放西路258号</p>--%>
        <%--<hr>--%>
        <%--<div class="address-cz">--%>
            <%--<label class="am-radio am-warning">--%>
                <%--<input type="radio" name="radio3" value="" data-am-ucheck="" class="am-ucheck-radio"><span class="am-ucheck-icons"><i class="am-icon-unchecked"></i><i class="am-icon-checked"></i></span> 设为默认--%>
            <%--</label>--%>
            <%--<a href=""><img src="images/bj.png" style="width: 18px;">&nbsp;编辑</a>--%>
            <%--<a href="">删除</a>--%>
        <%--</div>--%>
    <%--</li>--%>
</ul>
</body>
</html>

