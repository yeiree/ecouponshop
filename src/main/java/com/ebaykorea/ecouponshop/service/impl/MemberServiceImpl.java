package com.ebaykorea.ecouponshop.service.impl;

import com.ebaykorea.ecouponshop.domain.Member;
import com.ebaykorea.ecouponshop.repository.MemberRepository;
import com.ebaykorea.ecouponshop.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberRepository memberRepository;

    @Override
    public Member getMember(Long id) {
        return null;
    }

    @Override
    @Transactional
    public Member addMember(Member member){
        member = memberRepository.save(member);

        return member;
    }
}
