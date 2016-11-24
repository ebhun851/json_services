package com.ebhun.core.listener;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import com.ebhun.core.activemq.service.StoreService;
import com.ebhun.core.domain.Order;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class OrderListener {
	private final StoreService storeService;

	@Autowired
	public OrderListener(StoreService storeService) {
		this.storeService = storeService;
	}

	@JmsListener(destination = "QA.JSON.IN")
	@SendTo("QA.JSON.OUT")
	public String receiveOrderIn(String xml) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Order order = mapper.readValue(xml, Order.class);
		storeService.registerOrder(order);

		System.out.println("Order number is:" + order.getId());
		return order.getId();
	}
}