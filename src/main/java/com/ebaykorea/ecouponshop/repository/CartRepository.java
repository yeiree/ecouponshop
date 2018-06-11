package com.ebaykorea.ecouponshop.repository;

import com.ebaykorea.ecouponshop.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
