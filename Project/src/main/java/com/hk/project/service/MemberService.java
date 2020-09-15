package com.hk.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.project.mapper.MemberMapper;
import com.hk.project.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	MemberMapper memberMapper;

	public List<MemberVO> memberList() {

		return memberMapper.memberList();
	}

}
