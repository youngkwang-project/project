package com.hk.project.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hk.project.vo.Member;

@Repository
public interface MemberMapper {
	
	public List<Member> memberList();
	
	public Member memberRegister(Member member);
	
	public int memberUpdate(int mno);
	
	public int memberUpdateDone(Member member);
	
	public int memberDelete(int mno);
	
	
		
}
