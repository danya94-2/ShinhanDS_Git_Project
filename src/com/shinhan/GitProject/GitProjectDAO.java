package com.shinhan.GitProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;


public class GitProjectDAO {

	
	public List<GitProjectDTO> selectAll() {
		List<GitProjectDTO> gitList = new ArrayList<GitProjectDTO>();
		Connection conn = DBUtil.getConnection();
		Statement st = null;
		ResultSet rs = null;
		String sql = "select * from Board";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				GitProjectDTO list = makeList(rs);
				gitList.add(list);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.dbDisconnect(conn, st, rs);
		}
		return gitList;
	}

	private GitProjectDTO makeList(ResultSet rs) throws SQLException {
		GitProjectDTO list = GitProjectDTO.builder()
				.id(rs.getInt("id"))
				.writer(rs.getString("writer"))
				.createdDate(rs.getDate("createdDate"))
				.title(rs.getString("title"))
				.content(rs.getString("contenc"))
				.build();
		return list;
	}

	
	private int insert() {
		return 0;
		
	}
	
	
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
			]
			e.printStackTrace();
		}
		return result;
	}
}
