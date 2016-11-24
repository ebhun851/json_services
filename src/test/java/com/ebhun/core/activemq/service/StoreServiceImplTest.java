package com.ebhun.core.activemq.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.ebhun.core.domain.Order;;

@RunWith(MockitoJUnitRunner.class)
public class StoreServiceImplTest {

	private StoreServiceImpl serviceImpl;

	@Before
	public void init() {
		serviceImpl = new StoreServiceImpl();
	}

	@Test
	public void fetchOrderListTest(){
		Order order = new Order("12345","15");
		
		serviceImpl.registerOrder(order);
		
		assertEquals(1,serviceImpl.getReceivedOrders().size());
		
	}
}
