package com.shinhan.GitProject;

import java.util.Scanner;

public class GitProjectController {
	static Scanner sc = new Scanner(System.in);
	static GitProjectService gitProjectService = new GitProjectService();
	
	public static void main(String[] args) {
		f_deleteById();
	}

	private static void f_deleteById() {
		System.out.print("삭제할 게시글 번호>>");
		int id = sc.nextInt();
		int result = gitProjectService.deleteById(id);
		GitProjectView.display(result + "건 삭제");
	}
}
