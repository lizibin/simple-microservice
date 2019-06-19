/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.order.controller;

import com.ctnrs.basic.core.base.ResResultManager;
import com.ctnrs.basic.core.util.R;
import com.ctnrs.product.api.client.ProductServiceClient;
import com.ctnrs.stock.api.client.StockServiceClient;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 订单的服务控制层
 *
 * @author zibin
 */
@RestController
@AllArgsConstructor
@RequestMapping("order")
public class OrderController {


	private ProductServiceClient productServiceClient;

	private StockServiceClient stockServiceClient;

	/**
	 * 下单方法
	 *
	 * @return
	 */
	@PostMapping("/submitOrder")
	public R submitOrder(HttpServletRequest request, @RequestParam("productId") Long productId, @RequestParam("count") int count) {
		//保存订单


		//再扣除商品库存

		R<Boolean> result = stockServiceClient.deductionStock(111L, 3L);
		if(!result.getResult()){
			return ResResultManager.setResultError("库存扣除异常，下单失败");
		}

		//再保存订单

		//返回结果
		return ResResultManager.setResultSuccess("下单成功！下单商品为：");
	}
}
