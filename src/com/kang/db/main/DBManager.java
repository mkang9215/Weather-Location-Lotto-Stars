package com.kang.db.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class DBManager {

	public static Connection connect() throws Exception {
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/kangPool");
		return ds.getConnection();
	}	
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
//			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (Exception e) {
//			e.printStackTrace();
		}
		try {
			con.close();
		} catch (Exception e) {
//			e.printStackTrace();
		}
	}

}
