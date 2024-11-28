package com.TestNG;

import org.testng.annotations.DataProvider;

public class GoogleSearchData {
	
	
	@DataProvider
	public String[] GoogleData() {
		
		String[] data = new String[3];
		
		data[0] = "mobile";
		data[1] = "cap";
		data[2] = "shoes";
		
		return data;
		
		
	}

}
