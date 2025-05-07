package com.shinhan.GitProject;

public class GitProjectView {

	
	public static void display(GitProjectDTO update) {
		if(update == null) {
			System.out.println("존재하지 않는 게시글입니다.");
			return;
		}
		System.out.println("작성자 : " + update.getWriter());
		System.out.println("게시글 제목 : " + update.getTitle());
		System.out.println("본문 : " + update.getContent());
		System.out.println("게시글 번호 : " + update.getId());
	}
}
