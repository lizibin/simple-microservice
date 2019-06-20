<!DOCTYPE html>
<html>
<link rel="stylesheet" href="../js/layui/css/layui.css" media="all">
<body>
<div style="padding: 10px;">
    <div class="productTable">
        搜索订单：
        <div class="layui-inline">
            <input class="layui-input" name="name" id="demoReload" autocomplete="off">
        </div>
        <button class="layui-btn " data-type="reload">搜索</button>
    </div>
    <!-- 获取数据的表格 -->
    <table id="orderList" lay-filter="order-filter"></table>
    <!-- 底部固定区域 -->
    <div class="layui-footer">
        &nbsp;&nbsp;&nbsp;-说明：
        1、本案例由www.ctnrs.com提供，如有引用请保留链接。
        2、本案例涉及到——商品服务——订单服务——库存服务，三个服务作为演示案例
    </div>
</div>

<!-- 操作列的标签-->
<script type="text/html" id="productOperBar">
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="buy">购买</a>
</script>
<script src="../js/jquery-1.8.2.min.js"></script>
<script src="../js/layui/layui.js"></script>
<script src="../js/orderList.js"></script>
</body>
</html>