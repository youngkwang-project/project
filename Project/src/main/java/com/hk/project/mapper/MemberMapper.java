package com.hk.project.mapper;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberMapper {
	
	public List<Member> memberList();
	
	public Member memberRegister(Member member);
	
	public int memberUpdate(int mno);
	
	public int memberUpdateDone(Member member);
	
	public int memberDelete(int mno);
	
	
		
}
