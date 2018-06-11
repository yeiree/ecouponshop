package com.ebaykorea.ecouponshop.repository;

import com.ebaykorea.ecouponshop.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
