package com.shinhan.GitProject;

import java.util.Scanner;
import java.util.List;

public class GitProjectController {
	static Scanner sc = new Scanner(System.in);
	static GitProjectService gitProjectService = new GitProjectService();
	
	public static void main(String[] args) {
		f_deleteById();
    f_selectAll();
	}

	private static void f_deleteById() {
		System.out.print("삭제할 게시글 번호>>");
		int id = sc.nextInt();
		int result = gitProjectService.deleteById(id);
		GitProjectView.display(result + "건 삭제");
	}
	
	private static List<GitProjectDTO> f_selectAll() {
		System.out.println("==selectAll==");
		List<GitProjectDTO> list = gitProjectService.selectAll();
		GitProjectView.display(list);
		return list;
	}
	
}
