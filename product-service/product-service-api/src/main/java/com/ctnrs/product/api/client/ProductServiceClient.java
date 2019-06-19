/**
 * LegendShop微服务商城系统
 * ©版权所有,并保留所有权利。
 */
package com.ctnrs.product.api.client;


import com.ctnrs.basic.core.util.R;
import com.ctnrs.product.api.constant.ProductServiceNameConstant;
import com.ctnrs.product.api.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 商品服务远程调用客户端
 * @author zibin
 */
@FeignClient(ProductServiceNameConstant.PRODUCT_SERVICE)
public interface ProductServiceClient {

	@GetMapping("product/findByProductId")
	R<Product> findByProductId(@RequestParam(value = "productId") Long productId);

	@GetMapping("product/queryAll")
	R<List<Product>> queryAllProduct();

}
