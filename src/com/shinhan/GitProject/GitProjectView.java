package com.shinhan.GitProject;

import java.util.List;

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

	public static void display (String message) {
		System.out.println("알림: " + message);
	}

	public static void display(List<GitProjectDTO> list) {
		list.stream().forEach(gitList -> System.out.println(gitList));
	}

}
