package com.shinhan.GitProject;

import java.util.List;

public class GitProjectService {
	
	GitProjectDAO gitProjectDAO = new GitProjectDAO();
		
	public List<GitProjectDTO> selectAll() {
		return gitProjectDAO.selectAll();
	}
	
	public List<GitProjectDTO> selectByWriter(String writer) {
		return gitProjectDAO.selectByWriter(writer);
	}
	
}
