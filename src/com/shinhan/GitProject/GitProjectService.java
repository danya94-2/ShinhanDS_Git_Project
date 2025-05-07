package com.shinhan.GitProject;

import java.util.List;

public class GitProjectService {
	
	GitProjectDAO gitProjectDAO = new GitProjectDAO();
		
	public List<GitProjectDTO> selectAll() {
		return gitProjectDAO.selectAll();
	}
	
}
