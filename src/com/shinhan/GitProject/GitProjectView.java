package com.shinhan.GitProject;

import java.util.List;

public class GitProjectView {

	public static void display(List<GitProjectDTO> list) {
		list.stream().forEach(gitList -> System.out.println(gitList));
	}

}
