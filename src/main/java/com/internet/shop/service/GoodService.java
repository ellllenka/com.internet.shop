package com.internet.shop.service;

import com.internet.shop.domain.Good;
import com.internet.shop.domain.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by MyUser on 05.10.2015.
 */
public class GoodService {

    @Autowired
    private GoodRepository goodRepository;


    public Good getGood(long id){
        return goodRepository.findOne(id);
    }

    public Page<Good> getGoods(Pageable pageable) {
        return goodRepository.findAll(pageable);
    }

    public long addGood(String name, int price, int quantity, String description){
        Good good = new Good(name, price, quantity, description);
        good = goodRepository.save(good);
        return good.getId();
    }

    public void updateGood(Good good){
        goodRepository.save(good);
    }

}
