package com.elina.MockitoDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CalcTest {
	
	Calculator c = null;
	
	@Mock
	CalcService service;
	// CalcService service = Mockito.mock(CalcService.class);  
	// create a mock service that does not contain any content
	
	@Rule    // need to add this if using @Mock annotation
	public MockitoRule rule = MockitoJUnit.rule();
	
	@Before
	public void init() {
		c = new Calculator(service);
	}
	
	@Test
	public void testPerform() {
		Mockito.when(service.add(2, 3)).thenReturn(5);  // suppose this function
		// is performed by other 3rd party organization so we don't want to test it
		
		assertEquals(10, c.perform(2, 3));   // we only need to test perform
		
		Mockito.verify(service).add(2, 3);   // check if we are calling the service instead of hard coding
	}
	

}
