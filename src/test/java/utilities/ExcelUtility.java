package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	 String path;
	
	public ExcelUtility(String path)
	{
		this.path=path;
	}
	
	public int getrowcount(String sheetname) throws IOException //it is int because it will print integer
	{
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(sheetname);
		int rowcount=sh.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;
	}
	
	public int getcellcount(String sheetname, int rownum) throws IOException
	{

		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(sheetname);
		row=sh.getRow(rownum);
		int cellcount=row.getLastCellNum(); //due to int so the static method is int
		wb.close();
		fi.close();
		return cellcount;	
	}
	
	public String getcelldata(String sheetname, int rownum, int cellnum) throws IOException
	{
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(sheetname);
		row=sh.getRow(rownum);
		cell=row.getCell(cellnum);
		String data; //due to string the method is in string
		
		try
		{
			data=cell.toString();
		}
		catch(Exception e)
		{
			data=""; //some of the cells sometimes does not have values for that we use trycatch method
		}
		wb.close();
		fi.close();
		return data;
	}
	
	public void setcelldata(String sheetname, int rownum, int cellnum, String data) throws IOException
	{
	    File file= new File(path);
		if(!file.exists())
		{
			wb=new XSSFWorkbook();
			fo=new FileOutputStream(path);
			wb.write(fo);
		}
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		
		if(wb.getSheetIndex(sheetname)==-1)
			wb.createSheet(sheetname);
		sh=wb.getSheet(sheetname);
		
		if(sh.getRow(rownum)==null)
			sh.createRow(rownum);
		row=sh.getRow(rownum);
		
		cell=row.createCell(cellnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(path);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}

}
