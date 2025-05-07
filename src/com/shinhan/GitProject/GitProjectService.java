package com.shinhan.GitProject;

public class GitProjectService {

	GitProjectDAO gitProjectDAO = new GitProjectDAO();

	public int deleteById(int id) {
		return gitProjectDAO.delete(id);
	}
}
