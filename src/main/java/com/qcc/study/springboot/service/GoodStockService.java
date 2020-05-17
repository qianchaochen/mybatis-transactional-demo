package com.qcc.study.springboot.service;

import com.qcc.study.springboot.repository.GoodStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * TODO
 *
 * @author qianchaochen
 * @date 2020/5/17 14:29
 */
@Service
@Transactional
public class GoodStockService {
    @Autowired
    private GoodStockRepository repository;


    public void reduceStock(Long goodsId, Integer reduceCount) {
        repository.reduceStock(goodsId, reduceCount);
    }

}
