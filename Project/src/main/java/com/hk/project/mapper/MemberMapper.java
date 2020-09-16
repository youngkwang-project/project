package com.hk.project.mapper;

import java.util.List;

import com.hk.project.vo.Member;

public interface MemberMapper {
	
	public List<Member> memberList();
	
	public int memberRegister(Member member);
	
	public Member memberUpdateGet(int mno);
	
	public int memberUpdatePost(Member member);
	
	public Member memberDelete(int mno);
}
