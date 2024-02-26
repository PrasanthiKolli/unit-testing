package com.example.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SampleBusinessImplMockAnnotationsTest {
	@Mock
	DataService dataService;

	@InjectMocks
	SampleBusinessImpl sample;

	@Test
	void findGreatestFromData_Test() {

		when(dataService.retriveAllData()).thenReturn(new int[] { 10, 20, 30 });
		int res = sample.findGreatestFromData();

		assertEquals(30, res);
	}
	
	@Test
	void findGreatestFromDataEmpty_Test() {

		when(dataService.retriveAllData()).thenReturn(new int[] { });
		int res = sample.findGreatestFromData();

		assertEquals(Integer.MIN_VALUE, res);
	}

}
