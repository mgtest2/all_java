package com.my.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.my.tdd.main.StaticService;
import com.my.tdd.main.StaticServiceConsumer;

@RunWith(PowerMockRunner.class)
@PrepareForTest( StaticService.class )
public class StaticTest {

	
	@Test
	public void test() throws Exception{
		 
		PowerMockito.mockStatic(StaticService.class);
		
		PowerMockito.when(StaticService.test()).thenReturn("test1");
		StaticServiceConsumer serviceConsumer = new StaticServiceConsumer();
		
		String actual = serviceConsumer.test();
		
		assertEquals("test", actual);
	}
	
	
}
