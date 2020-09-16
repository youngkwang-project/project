package com.hk.project.controller;

import java.lang.reflect.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	@GetMapping("/member/list")
	public String MemberList(Model model) {
		
		model.addAttribute("members",memberService.memberList());
		return "memberList";
	}
	
	@GetMapping("/member/register")
	public String MemberRegister(Model model) {
		
		return "memberRegister";
	}
	@PostMapping("/member/register")
	public String MemberRegisterDone(Member member, Model model) {
		
		memberService.memberRegister(member);
		model.addAttribute("member",member);
		return "memberRegister";
	}
	@GetMapping("/member/update")
	public String memberUpdate(@RequestParam("mno") int mno,Model model) {
			
		model.addAttribute("member",memberService.memberUpdate(mno));
		
		return "memberUpdate";
	}
	@PostMapping("/member/update")
	public String memberUpdateDone(Member member) {
		
		memberService.memberUpdateDone(member);
		
		return "memberUpdateDone";
	}
	@GetMapping("/member/delete")
	public String memberDeleteDone(Member member, Model model) {
		
		memberService.memberDeleteDone(member);
		model.addAttribute("member",member);
		
		return "memberDeleteDone";
	}
		
		
}
