package com.hk.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.hk.project.service.MemberService;
import com.hk.project.vo.Member;

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
		return "memberRegister";
	}
	
	@PostMapping("/member/register")
	public String memberRegister(Member member, Model model) {
		memberService.memberRegister(member);
		model.addAttribute("name",member.getMname());
		return "memberRegisterDone";
	}
	
	//회원정보수정
	@GetMapping("/member/update")
	public String memberUpdate(Member member) {
		memberService.memberUpdate(member);
		return "memberUpdate";
	}
	
	@PostMapping("/member/update")
	public String memberUpdate(Member member, Model model) {
		model.addAttribute("name",member.getMname());
		return "memberUpdateDone";
	}
	
	//회원삭제

}
