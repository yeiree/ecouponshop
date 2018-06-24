package com.ebaykorea.ecouponshop.controller;

import com.ebaykorea.ecouponshop.domain.Member;
import com.ebaykorea.ecouponshop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/main")
public class MainController {
    @Autowired
    MemberService memberService;

    @GetMapping(path="/item")
    public String itemList(){return "main/itemlist";}

    /*@PostMapping("/join")
    public String join(@ModelAttribute Member member){
        member.setRegdate(LocalDateTime.now());

        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        String encode = passwordEncoder.encode(member.getPassword());
        member.setPassword(encode);

        member = memberService.addMember(member);
        return "redirect:/members/welcome";
    }

    @GetMapping(path="/welcome")
    public String welcome(){return "members/welcome";}*/

}
