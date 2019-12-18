package com.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.*;

public class Shiliinput {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("E:\\2019下学期\\Java基础入门\\shili.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rows = sheet.getLastRowNum();
		for (int i = 0; i < rows; i++) {
			//读取每一行
			XSSFRow row = sheet.getRow(i);
			//找到第4个单元格
			XSSFCell cell = row.getCell(3);
			//读取这个单元格的值
			String xuehao = cell.getStringCellValue();
			System.out.println(xuehao);
			
			XSSFCell cell16 = row.getCell(15);
			//读取这个单元格的值
			String zuo_shili = cell16.getStringCellValue();
			System.out.println(zuo_shili);
			//找到第16个单元格
			XSSFCell cell17 = row.getCell(16);
			//读取这个单元格的值
			String you_shili = cell17.getStringCellValue();
			System.out.println(you_shili);
			
			Class.forName("com.mysql.jdbc.Driver");
			//通过驱动获得连接对象
			Connection lianjie = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc ?characterEncoding = utf8", "root", "123456");
			//
			//Statement yuju = lianjie.createStatement();
			//
			//String sql = "UPDATE 18rj2 SET '左眼裸眼视力' =" + zuo_shili +"' where ' '学号' = '" + xuehao +"'";
			//System.out.println(sql);
			//
			//yuju.execute(sql);
			PreparedStatement ydy_yuju = lianjie.prepareStatement("" + "update 18rj2 set '' = ?,''=? where ''=?");
			ydy_yuju.setString(1, zuo_shili);
			ydy_yuju.setString(1, you_shili);
			ydy_yuju.setString(1, xuehao);
		}
	}

}
