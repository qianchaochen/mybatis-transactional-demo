package com.qcc.study.springboot.repository;

import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author qianchaochen
 * @date 2020/5/17 14:10
 */
@Repository
public interface GoodStockRepository {

    @Update("update good_stock set sold = sold+#{reduceCount} " +
            "where goods_id = #{goodsId} and total > sold + #{reduceCount}")
    int reduceStock(Long goodsId, Integer reduceCount);

}
