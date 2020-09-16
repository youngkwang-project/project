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
	
	public List<Member> memberList(){
		return memberMapper.memberList();
	}
	
	public int memberRegister(Member member) {
		return memberMapper.memberRegister(member);
	}
	
	public int memberUpdate(int mno) {
		return memberMapper.memberUpdate(mno);
	}
	
	public int memberUpdateDone(Member member) {
		return memberMapper.memberUpdateDone(member);
	}
	
	
	public int memberDelete(int mno) {
		return memberMapper.memberDelete(mno);
	}
	
	
	
	
//	list, register, update, delete, updateone
}
