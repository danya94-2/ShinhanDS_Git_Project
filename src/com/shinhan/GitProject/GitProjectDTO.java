package com.shinhan.GitProject;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GitProjectDTO {
	private int id;
	private String writer;
	private Date createdDate;
	private String title;
	private String content;
	private String password;
	private int qaType;
}

