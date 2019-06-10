/**
 * LegendShop微服务商城系统
 * ©版权所有,并保留所有权利。
 */
package com.ctnrs.order.api.client;


import com.ctnrs.order.api.constant.OrderServiceNameConstant;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 订单服务远程调用客户端
 * @author zibin
 */
@FeignClient(OrderServiceNameConstant.ORDER_SERVICE)
public interface OrderServiceClient {


}
