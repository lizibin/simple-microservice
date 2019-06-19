/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.order.mapper;

import com.ctnrs.product.api.model.Product;
import org.apache.ibatis.annotations.Select;

/**
 * 订单的数据层mapper
 * @author zibin
 */
public interface OrderMapper {
	@Select("insert into order(order_number,order_product_name,order_price,count,buy_date) values(#{name}, #{age},#{sex})")
	Product findByProductId(String orderNumber,String orderProductName);

}
