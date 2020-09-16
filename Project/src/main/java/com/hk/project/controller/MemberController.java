package com.hk.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hk.project.service.MemberService;
import com.hk.project.vo.Member;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	//리스트gma
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
	public String memberRegisterDone(Member member, Model model) {
		
		memberService.memberRegisterDone(member);
		
		model.addAttribute("member",member);
		return "memberRegisterDone";
	}
	
	//회원정보수정
	@GetMapping("/member/update")
	public String memberUpdate(@RequestParam("mno") int mno, Model model) {
		
		model.addAttribute("member", memberService.memberUpdate(mno));
		return "memberUpdate";
	}
	
	@PostMapping("/member/update")
	public String memberUpdateDone(Member member, Model model) {
		model.addAttribute("member",member);
		return "memberUpdateDone";
	}
	
	//회원삭제
	@GetMapping("/member/delete")
	public String memberDelete(@RequestParam("mno") int mno) {
		memberService.memberDelete(mno);
		
		return "memberDeleteDone";
	}
}
