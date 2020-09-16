package com.hk.project.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hk.project.vo.Member;

@Repository
public interface MemberMapper {
	
	public List<Member> memberList();
	
	public int memberRegisterDone(Member member);
	
	public Member memberUpdate(int mno);
	
	public int memberUpdateDone(Member member);
	
	public int memberDelete(int mno);
	
	
		
}
