package com.hk.project.mapper;

import java.util.List;

public interface MemberMapper {

		public List<Member> memberListGet();
		
		public int memberRegisterPost(Member member);
		
		public Member memberGetOne(int mno);
		
		public int memberUpdatePost(Member member);
		
		public int memberDeletePost(int mno);
		
		
}
