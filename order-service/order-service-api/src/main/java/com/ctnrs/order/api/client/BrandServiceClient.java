/**
 * LegendShop微服务商城系统
 * ©版权所有,并保留所有权利。
 */
package com.ctnrs.order.api.client;


import com.ctnrs.order.constant.OrderServiceNameConstant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(OrderServiceNameConstant.ORDER_SERVICE)
public interface BrandServiceClient {

    @GetMapping("brand/queryBrandsByBrandIds")
    R<List<Brand>> queryBrandsByBrandIds(@RequestParam("brandIds") List<Long> brandIds);
}
