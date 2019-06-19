/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.portal.controller;

import com.ctnrs.basic.core.util.R;
import com.ctnrs.portal.dto.LayerDTO;
import com.ctnrs.product.api.client.ProductServiceClient;
import com.ctnrs.product.api.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * 商品控制层
 *
 * @author zibin
 */
@Controller
@AllArgsConstructor
public class ProductController {

	private final ProductServiceClient productServiceClient;

	@RequestMapping("/queryProductList")
	@ResponseBody
	public Object queryProductList(HttpServletRequest request) {
		R<List<Product>> result = productServiceClient.queryAllProduct();
		return new LayerDTO(0, "返回成功", 10L, result.getResult());
	}

}
