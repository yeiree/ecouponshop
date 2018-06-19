package com.ebaykorea.ecouponshop.controller;

import com.ebaykorea.ecouponshop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/member")
public class MemberApiController {


    @GetMapping(path = "/test")
    public String test() {
        return "test";
    }

}
