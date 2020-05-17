package com.qcc.study.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * TODO 订单实体
 *
 * @author qianchaochen
 * @date 2020/5/17 14:04
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {
    //订单ID
    private Long itemId;
    //订单编号
    private String orderNo;
    //用户ID
    private Long userId;
    //商品ID
    private Long goodsId;
    //商品价格
    private BigDecimal price;
    //下单数量
    private Integer count;

}
