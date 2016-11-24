package com.ebhun.core.activemq.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ebhun.core.domain.Order;

import lombok.Getter;

@Service
public class StoreServiceImpl implements StoreService {
	@Getter
    private final List<Order> receivedOrders = new ArrayList<>();
    
    @Override
    public void registerOrder(Order order) {
        this.receivedOrders.add(order);
    }
}