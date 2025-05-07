package com.shinhan.GitProject;
import java.util.List;

public class GitProjectService {
	
	GitProjectDAO gitProjectDAO = new GitProjectDAO();
		
	public List<GitProjectDTO> selectAll() {
		return gitProjectDAO.selectAll();
	}
  
  public int deleteById(int id) {
		return gitProjectDAO.delete(id);
	}
	
  public int update(GitProjectDTO update) {
		int result = gitprojectDAO.update(update);
		return result;
	}
}
