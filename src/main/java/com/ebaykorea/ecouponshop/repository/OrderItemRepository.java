package com.ebaykorea.ecouponshop.repository;

import com.ebaykorea.ecouponshop.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
