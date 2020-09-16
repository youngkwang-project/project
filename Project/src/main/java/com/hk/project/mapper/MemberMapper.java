package com.hk.project.mapper;

import java.util.List;

import com.hk.project.vo.Member;

public interface MemberMapper {
	
	public List<Member> memberList();
	
	public int memberRegister(Member member);
	
	public Member memberUpdate(int mno);
	
	public int memberUpdateDone(Member member);
	
	public int memberDelete(int mno);
}
