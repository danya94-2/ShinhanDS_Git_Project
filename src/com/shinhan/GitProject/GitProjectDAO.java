package com.shinhan.GitProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class GitProjectDAO {

	//희정
	private List<GitProjectDTO> selectAll() {
		return null;
	}
	
	//대현
	private int Insert() {
		return 0;
		
	}
	
	//진호
	private int update(GitProjectDTO update) {
		Connection conn;
		PreparedStatement pst;
		ResultSet rs;
		int resultCount;
		String sql = "update Board set writer = ?, title = ?, content = ? where id = ?";
		conn = DBUtil.getConnection();
		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, update.getWriter());
			pst.setString(2, update.gettitle());
			pst.setString(3, update.getcontent());
			pst.setInt(4, update.getid());
			resultCount = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbDisconnect(conn, pst, null);
		}
		
		return resultCount;
		
		
	}
	
	//원정
	private int delete() {
		return 0;
	}
}
