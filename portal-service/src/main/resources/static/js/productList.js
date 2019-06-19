$(function () {
  layui.use('table', function () {
    var table = layui.table;
    table.render({
      elem: '#productList'
      , url: 'queryProductList'
      , cellMinWidth: 80
      , page: true
      , id: 'productListReload'
      , height: 500
      , cols: [[
        {field: 'id', width: 180, title: '序列'}
        , {field: 'productName', title: '商品名称'}
        , {field: 'price', width: 180, title: '商品价格', sort: true}
        , {field: 'stock', title: '商品库存'}
        , {fixed: 'right', width: 250, align: 'center', title: '操作', toolbar: '#productOperBar'}
      ]]

    });

    //监听操作工具条
    table.on('tool(product-filter)', function (obj) {
      var data = obj.data;
      if (obj.event === 'buy') {
        layer.confirm('您确定要购买' + data.productName + '商品吗？', {
          icon: 3,
          btn: ['确定', '取消'] //按钮
        }, function () {
          layer.msg('正在下单', {icon: 1});
        }, function (index) {
          layer.close(index);
        });
      }
    });

    //异步搜索条件
    var $ = layui.$, active = {
      reload: function () {
        var demoReload = $('#demoReload');
        //执行重载
        table.reload('productListReload', {
          page: {
            curr: 1 //重新从第 1 页开始
          }
          , where: {
            name: demoReload.val()
          }
        });
      }
    };

    $('.userTable .layui-btn').on('click', function () {
      var type = $(this).data('type');
      active[type] ? active[type].call(this) : '';
    });
  });
});
