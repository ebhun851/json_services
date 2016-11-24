package com.ebhun.core.activemq.service;


import com.ebhun.core.domain.Order;

public interface StoreService {

	public void registerOrder(Order order);
}
