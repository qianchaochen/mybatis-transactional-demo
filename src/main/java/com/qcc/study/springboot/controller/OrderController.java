package com.qcc.study.springboot.controller;

import com.qcc.study.springboot.entity.OrderItem;
import com.qcc.study.springboot.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author qianchaochen
 * @date 2020/5/17 14:43
 */
@RestController
public class OrderController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping("/order/add")
    public OrderItem addOrder(Long goodsId, Integer count, BigDecimal price) {

        Long userId = 1001L;

        return orderItemService.addOrder(userId, goodsId, count, price);
    }

}
