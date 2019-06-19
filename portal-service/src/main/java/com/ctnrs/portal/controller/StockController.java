/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * 库存控制层
 *
 * @author zibin
 */
@Controller
public class StockController {

	@RequestMapping("/queryProductList")
	public String queryProductList(HttpServletRequest request) {

		return "productList";
	}

}
