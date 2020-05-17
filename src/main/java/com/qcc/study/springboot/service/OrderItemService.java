package com.qcc.study.springboot.service;

import com.qcc.study.springboot.entity.OrderItem;
import com.qcc.study.springboot.repository.GoodStockRepository;
import com.qcc.study.springboot.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * TODO
 *
 * @author qianchaochen
 * @date 2020/5/17 14:26
 */
@Service
@Transactional
public class OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;
    @Autowired
    private GoodStockRepository goodStockRepository;

    /**
     * 添加订单, 并把最近新插入到数据库中的订单查询出来, 返回到前台
     * @author qianchaochen
     * @date 2020/5/17 14:28
     */
    public OrderItem addOrder(Long userId, Long goodsId, Integer count, BigDecimal price) {
        OrderItem orderItem = OrderItem.builder().orderNo(UUID.randomUUID().toString().replace("-",""))
                .userId(userId).goodsId(goodsId).price(price).count(count).build();
        orderItemRepository.insertOrderItem(orderItem);
        int updateRows = goodStockRepository.reduceStock(goodsId, count);
        if (updateRows <= 0) {
            throw new IllegalArgumentException("下单失败, 库存数量不足! ");
        }
        //将最新插入的数据返回
        return orderItemRepository.findOrderItemByNear();
    }
}
