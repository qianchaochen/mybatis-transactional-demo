package com.qcc.study.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO 商品库存实体
 *
 * @author qianchaochen
 * @date 2020/5/17 14:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GoodStock {
    //库存ID
    private Long stockId;
    //商品ID
    private Long goodsId;
    //商品数量
    private Integer total;
    //已售数量
    private Integer sold;
}
