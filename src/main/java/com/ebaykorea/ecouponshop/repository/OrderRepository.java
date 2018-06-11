package com.ebaykorea.ecouponshop.repository;

import com.ebaykorea.ecouponshop.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
