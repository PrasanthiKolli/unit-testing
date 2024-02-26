package com.example.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SampleBusinessImplMockTest {

	@Test
	void findGreatestFromData_Test() {
		DataService dataService = mock(DataService.class);
		
		when(dataService.retriveAllData()).thenReturn(new int[] {10,20,30});
		SampleBusinessImpl sample = new SampleBusinessImpl(dataService);
		int res = sample.findGreatestFromData();

		assertEquals(30, res);
	}

}
