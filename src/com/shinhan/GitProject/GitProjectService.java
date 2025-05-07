package com.shinhan.GitProject;

public class GitProjectService {
	
	GitProjectDAO gitprojectDAO = new GitProjectDAO();
	
	public int update(GitProjectDTO update) {
		int result = gitprojectDAO.update(update);
		return result;
	}

}
