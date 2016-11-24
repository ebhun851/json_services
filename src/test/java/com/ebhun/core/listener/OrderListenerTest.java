package com.ebhun.core.listener;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ebhun.core.activemq.service.StoreService;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class OrderListenerTest {

	private OrderListener listener;

	@Mock
	private StoreService storeService;

	@Before
	private void init() {
		listener = new OrderListener(storeService);
	}

	@Test
	public void processOrder() throws Exception {
		String orderData = "{\"id\":\"12345\",\"price\":\"15\"}";
		String orderId = listener.receiveOrderIn(orderData);
		assertEquals("12345", orderId);
	}

}
