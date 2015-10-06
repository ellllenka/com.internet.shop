package com.internet.shop.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by MyUser on 05.10.2015.
 */
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
}
