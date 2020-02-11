package com.my.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import com.my.tdd.main.Service;
import com.my.tdd.main.ServiceConsumer;

public class ServiceTest {

	@Test
	public void service(){
		
		Service service = Mockito.mock(Service.class);
		
		Mockito.doThrow(new Exception()).when(service);
		
		ServiceConsumer consumer = new ServiceConsumer();
		consumer.setService(service);
		
		String actual = consumer.testService();
		
		assertEquals("fail", actual);
		
	}
	
	@Test
	public void serviceDoNothing(){
		
		Service service = Mockito.mock(Service.class);
		
		Mockito.doNothing().when(service).serviceCall();
		
		ServiceConsumer consumer = new ServiceConsumer();
		consumer.setService(service);
		
		String actual = consumer.testService();
		
		assertEquals("fail", actual);
		
	}
	
	
	@Test
	public void serviceDoAnswer(){
		
		Service service = Mockito.mock(Service.class);
		
		Mockito.doAnswer(new Answer<Void>(){
			public Void answer(InvocationOnMock invocation) throws Throwable{
				
				System.out.print("test");
				return null;
			}
		}).when(service).serviceCall();
		
		ServiceConsumer consumer = new ServiceConsumer();
		consumer.setService(service);
		
		String actual = consumer.testService();
		
		assertEquals("fail", actual);
		
	}
	
	
	
}
