package com.hk.project.vo;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {

	
	int mno;
	String mname;
	String email;
	String pwd;
	Date cre_date;
	Date mod_date;
}
