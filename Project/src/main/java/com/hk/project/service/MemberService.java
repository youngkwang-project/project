package com.hk.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.project.mapper.MemberMapper;
import com.hk.project.vo.Member;

@Service
public class MemberService {
	
	
	@Autowired
	MemberMapper memberMapper;
	
	public List<Member> memberListGet(){
		return memberMapper.memberListGet();
	}
	
	public int memberRegisterPost(Member member) {
		return memberMapper.memberRegisterPost(member);
	}
	
	public Member memberGetOne(int mno) {
		return memberMapper.memberGetOne(mno);
	}
	
	public int memberUpdatePost(Member member) {
		return memberMapper.memberUpdatePost(member);
	}
	
	public int memberDeletePost(int mno) {
		return memberMapper.memberDeletePost(mno);
	}
}
