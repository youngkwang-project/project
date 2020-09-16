package com.hk.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.hk.project.service.MemberService;
import com.hk.project.vo.Member;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;
	
	public String memberListGet(Model model){
		model.addAttribute("members", memberService.memberListGet());
		return "memberList";
	}
	
	public String memberRegisterGet() {
		
		return "memberRegister";
	}
	
	public String memberRegisterPost(Member member, Model model) {
		memberService.memberRegisterPost(member);
		return "memberRegisterDone";
	}
	
	public String memberGetOne(int mno) {
		memberService.memberGetOne(mno);
		return "memberUpdate";
	}
	
	public String memberUpdatePost(Member member, Model model) {
		model.addAttribute("member", memberService.memberUpdatePost(member));
		return "memberUdate";
	}
	
	public String memberDeletePost(int mno) {
		memberService.memberDeletePost(mno);
		return "memberDelete";
	}
}
