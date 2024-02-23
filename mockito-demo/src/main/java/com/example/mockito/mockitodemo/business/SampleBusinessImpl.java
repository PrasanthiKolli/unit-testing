package com.example.mockito.mockitodemo.business;

import java.util.Arrays;

public class SampleBusinessImpl {
	private DataService dataService;
	

	public SampleBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}




	public int findGreatestFromData() {

		int[] data = dataService.retriveAllData();

		int largevalue = Arrays.stream(data).max().getAsInt();

		return largevalue;
	}

}

interface DataService {

	int[] retriveAllData();
}
