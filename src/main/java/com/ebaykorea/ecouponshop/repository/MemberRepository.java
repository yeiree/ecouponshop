package com.ebaykorea.ecouponshop.repository;

import com.ebaykorea.ecouponshop.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
