package com.shinhan.GitProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
	private int update() {
		return 0;
		
	}
	
	//원정
	public int delete(int id) {
		int result = 0;
		Connection conn = DBUtill.getConnection();
		PreparedStatement st = null;
		String sql = "delete from Board where id = ?";
		try {
			st = conn.prepareStatement(sql);
			st.setInt(1, id);
			result = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
