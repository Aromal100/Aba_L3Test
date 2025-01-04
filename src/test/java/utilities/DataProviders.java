package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name="LoginData")
	public String[][] getdata() throws IOException
	{
		String path=".\\testdata\\LoginTestData.xlxs";
		ExcelUtility ex= new ExcelUtility(path);
		int totalrows=ex.getrowcount("Sheet1");
		int totalcols=ex.getcellcount("Sheet1", 1);
		String logindata[][]=new String[totalrows][totalcols]; //created 2 dimension so that can store
		for(int i=1;i<=totalrows;i++)	
		{
			for(int j=0;j<totalcols;j++)
			{
				logindata[i-1][j]=ex.getcelldata("Sheet1", i, j);
			}
		}
		return logindata;	
		
	}

}
