package com.qcc.study.springboot.repository;

import com.qcc.study.springboot.entity.OrderItem;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author qianchaochen
 * @date 2020/5/17 14:09
 */
@Repository
public interface OrderItemRepository {
/**
 * 使用@Param注解标注接口参数时, 在sql的映射语句中需要使用 #{orderItem.属性名} 方式来进行引用.
 * @author qianchaochen
 * @date 2020/5/17 15:28
 */
    @Update("insert into order_item(order_no, user_id, goods_id, price, count) " +
            "values(#{orderItem.orderNo}, #{orderItem.userId} ,#{orderItem.goodsId} ,#{orderItem.price}, #{orderItem.count})")
    void insertOrderItem(@Param("orderItem") OrderItem orderItem);

/**
 * 不使用@Param注解标注接口参数时, sql的映射语句中取值时,直接使用对象的属性名
 * @author qianchaochen
 * @date 2020/5/17 15:28
 */
    @Update("insert into order_item(order_no, user_id, goods_id, price, count) " +
            "values(#{orderNo}, #{userId} ,#{goodsId} ,#{price}, #{count})")
    void insertOrderItem2(OrderItem orderItem);

    @Select("select * from order_item where item_id=(select @@identity )")
    @Results({
            @Result(property = "itemId", column = "item_id"),
            @Result(property = "orderNo", column = "order_no"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "goodsId", column = "goods_id"),
    })
    OrderItem findOrderItemByNear();
}
