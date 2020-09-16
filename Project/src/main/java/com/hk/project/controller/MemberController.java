package com.hk.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hk.project.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	//리스트
	@GetMapping("/member/list")
	public String memberList(Model model) {
		model.addAttribute("members",memberService.memberList());
		return "memberList";
	}
	
	//회원가입
	@GetMapping("/member/register")
	public String memberRegister(Model model) {
		return "memberRegisterGet";
	}
	
	
	//회원정보수정
	
	//회원삭제

}
