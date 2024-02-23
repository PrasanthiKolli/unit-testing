package com.example.mockito.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SampleBusinessImplTest {

	@Test
	void findGreatestFromData_Test() {
		DataServiceStub dataServiceStub = new DataServiceStub();
		SampleBusinessImpl sample = new SampleBusinessImpl(dataServiceStub);
		int res = sample.findGreatestFromData();

		assertEquals(30, res);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] { 10, 20, 30 };
	}

}
