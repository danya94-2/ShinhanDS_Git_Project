package com.shinhan.GitProject;

import java.util.List;

public class GitProjectController {
	
	static GitProjectService gitProjectService = new GitProjectService();
	
	public static void main(String[] args) {
		f_selectAll();
		f_selectByWriter();
	}
	
	private static List<GitProjectDTO> f_selectByWriter() {
		System.out.println("==selectByWriter==");
		List<GitProjectDTO> writer_list = gitProjectService.selectAll();
		GitProjectView.display(writer_list);
		return writer_list;
	}

	private static List<GitProjectDTO> f_selectAll() {
		System.out.println("==selectAll==");
		List<GitProjectDTO> list = gitProjectService.selectAll();
		GitProjectView.display(list);
		return list;
	}
	
	
}
