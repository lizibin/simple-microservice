/**
 * <p>Company: http://www.ctnrs.com</p>
 * <p>Copyright: Copyright (c) 2019</p>
 */
package com.ctnrs.product.mapper;


import com.ctnrs.product.api.model.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 商品的数据层mapper
 * @author zibin
 */
public interface ProductMapper {

	@Select("select * from product where id = #{productId})")
	Product findByProductId(@Param("productId") Long productId);
}
