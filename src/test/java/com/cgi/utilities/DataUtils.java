package com.cgi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
/**
 * All dataproviders required for the project kept here.
 */
public class DataUtils {
	
	@DataProvider
	public Object[][] invalidLoginData() {
		Object[][] data = new Object[2][3];

		data[0][0] = "saul";
		data[0][1] = "saul123";
		data[0][2] = "Invalid credentials";

		data[1][0] = "kim";
		data[1][1] = "kim123";
		data[1][2] = "Invalid credentials";

		return data;
	}
	
	
	@DataProvider
	public Object[][] commonDataProvider(Method mtd) throws IOException
	{
		//@Test method name is the sheetname
		String sheetName=mtd.getName();
		Object[][] data= ExcelUtils.getSheetIntoTwoDimensionalArray("src/test/resources/orange_data.xlsx", sheetName);
		return data;
	}

}
