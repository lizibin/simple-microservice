/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.portal.controller;

import com.ctnrs.basic.core.util.R;
import com.ctnrs.order.api.client.OrderServiceClient;
import com.ctnrs.product.api.client.ProductServiceClient;
import com.ctnrs.product.api.model.Product;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * 订单控制层
 *
 * @author zibin
 */
@Controller
@AllArgsConstructor
@Slf4j
public class OrderController {

	private final ProductServiceClient productServiceClient;

	private final OrderServiceClient orderServiceClient;

	/**
	 * 提交订单
	 *
	 * @param request
	 * @return
	 */
	@RequestMapping("/submitOrder")
	@ResponseBody
	public String submitOrder(HttpServletRequest request, @RequestParam("productId") Long productId,@RequestParam("count") int count) {
		R<Product> result = productServiceClient.findByProductId(productId);
		if(!result.hasBody()){
			log.info("----------------没有查询到商品--------------->");
		}
		orderServiceClient.submitOrder(1L,1);

		log.info("----------------请求下单--------------->");

		return "productList";
	}

}
