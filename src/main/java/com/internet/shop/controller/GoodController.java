package com.internet.shop.controller;

import com.internet.shop.domain.Good;
import com.internet.shop.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by MyUser on 07.10.2015.
 */
@Controller
public class GoodController {

    @Autowired
    private GoodService goodService;

    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    @ResponseBody
    public Page<Good> getGoods(Pageable pageable) {
        return goodService.getGoods(pageable);
    }

    @RequestMapping(value = "/good", method = RequestMethod.GET)
    @ResponseBody
    public Good getGood(long id){
        return goodService.getGood(id);
    }

    @RequestMapping(value = "/good", method = RequestMethod.POST)
    @ResponseBody
    public long addGood(String name, int price, int quantity, String description) {
        return goodService.addGood(name, price, quantity, description);
    }

    @RequestMapping(value = "/good", method = RequestMethod.PUT)
    @ResponseBody
    public Good updateGood(Good good){
        return goodService.updateGood(good);
    }
}
