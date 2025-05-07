package com.shinhan.GitProject;

import java.util.List;

public class GitProjectView {


	public static void display (String message) {
		System.out.println("알림: " + message);
	}

	public static void display(List<GitProjectDTO> list) {
		list.stream().forEach(gitList -> System.out.println(gitList));
	}

}
