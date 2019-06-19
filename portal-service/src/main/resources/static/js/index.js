var layer;
$(function(){
	layer=layui.use('layer');     
});


function queryProductList(){
	layer.open({
		  id :"queryProductList",
		  title :"查询所有商品",
		  type: 2, 
		  content: 'queryProductListPage', //这里content是一个URL，如果你不想让iframe出现滚动条，你还可以content: ['${contextPath}/s/loadProdListPage', 'no']
      area: ['1024px', '650px']
		}); 
}

