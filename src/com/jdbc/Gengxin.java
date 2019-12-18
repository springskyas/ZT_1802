package com.jdbc;



import java.sql.*;


public class Gengxin {

	public static void main(String[] args) throws Exception {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获得连接
		/*java.sql.Connection conn = */
		Connection lianjie = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jbdc2", "root", "123456");
		//
		Statement yuju = lianjie.createStatement();
		//
		String sql = "UPDATE tb_user SET email = 'jack@163.com' WHERE id =1 ";
		//
		yuju.execute(sql);
	}

}
