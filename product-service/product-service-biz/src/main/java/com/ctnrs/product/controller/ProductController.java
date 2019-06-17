/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.product.controller;

import com.ctnrs.basic.core.base.ResResultManager;
import com.ctnrs.basic.core.util.R;
import com.ctnrs.product.api.model.Product;
import com.ctnrs.product.mapper.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 商品的服务控制层
 *
 * @author zibin
 */
@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {

	private final ProductMapper productMapper;

	/**
	 * 根据商品id查询商品
	 *
	 * @return
	 */
	@GetMapping("/findByProductId/{productId}")
	public R<Product> findByProductId(@PathVariable Long productId) {
		Product product = productMapper.findByProductId(productId);
		return ResResultManager.setResultSuccess(product);
	}
}
