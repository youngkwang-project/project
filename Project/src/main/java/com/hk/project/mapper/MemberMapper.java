package com.hk.project.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hk.project.vo.MemberVO;

@Repository
public interface MemberMapper {

	public List<MemberVO> memberList();
	
}
