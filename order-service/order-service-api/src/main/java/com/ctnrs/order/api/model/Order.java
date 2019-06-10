/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.order.api.model;

import lombok.Data;

/**
 * 订单的实体
 */
@Data
public class Order {

	private String orderNumber;

	private String orderProductName;

	private Double orderPrice;
}
