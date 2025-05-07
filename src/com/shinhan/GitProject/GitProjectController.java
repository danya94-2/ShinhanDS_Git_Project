package com.shinhan.GitProject;

import java.util.List;

public class GitProjectController {
	
	static GitProjectService gitProjectService = new GitProjectService();
	
	public static void main(String[] args) {
		f_selectAll();
		
	}
	
	private static List<GitProjectDTO> f_selectAll() {
		System.out.println("==selectAll==");
		List<GitProjectDTO> list = gitProjectService.selectAll();
		GitProjectView.display(list);
		return list;
	}
	
	
}
