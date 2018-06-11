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
    @Transactional(readOnly = true)
    public Member getMember(Long id) {
        return memberRepository.getOne(id);
    }
}
