/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 商品服务启动类
 * @author zibin
 */
@SpringBootApplication
@MapperScan(basePackages="com.ctnrs.order.mapper")
public class OrderServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApp.class, args);
	}

}
