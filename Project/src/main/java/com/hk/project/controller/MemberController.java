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
	
	@GetMapping(value="member/list")
	public String memberListGet(Model model){
		model.addAttribute("members", memberService.memberListGet());
		return "memberList";
	}
	@GetMapping(value="member/register")
	public String memberRegisterGet() {
		
		return "memberRegister";
	}
	@PostMapping(value="member/register")
	public String memberRegisterPost(Member member, Model model) {
		memberService.memberRegisterPost(member);
		return "memberRegisterDone";
	}
	@GetMapping(value="member/update")
	public String memberGetOne(int mno, Model model) {
		model.addAttribute("member", memberService.memberGetOne(mno));

		return "memberUpdate";
	}
	@PostMapping(value="member/update")
	public String memberUpdatePost(Member member, Model model) {
		memberService.memberUpdatePost(member);
		return "memberUpdateDone";
	}
	@GetMapping(value="member/delete")
	public String memberDeletePost(int mno) {
		memberService.memberDeletePost(mno);
		return "memberDeleteDone";
	}
}
