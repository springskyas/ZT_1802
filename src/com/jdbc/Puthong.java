package com.jdbc;

import java.sql.*;
import java.sql.DriverManager;

public class Puthong {

	public static void main(String[] args) throws Exception {
		//
		Class.forName("com.mysql.jdbc.Driver");
		//
		Connection lianjie = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jbdc2", "root", "123456");
		//
		Statement yuju = lianjie.createStatement();
		//
		String sql = "select * from tb_user";
		//
		ResultSet rs = yuju.executeQuery(sql);
		System.out.println("id	|	name 	|	sex");
		//
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String sex = rs.getString("sex");
			System.out.println(id + "	|	" + name +"	|	" + sex);
		}
	}

}
