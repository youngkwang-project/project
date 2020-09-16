package com.hk.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("/member/list")
	public String memberList(Model model) {
		model.addAttribute("members",memberService.memberList());
		return "memberList";
	}

}
