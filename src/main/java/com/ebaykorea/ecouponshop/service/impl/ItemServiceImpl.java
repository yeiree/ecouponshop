package com.ebaykorea.ecouponshop.service.impl;

import com.ebaykorea.ecouponshop.repository.ItemRepository;
import com.ebaykorea.ecouponshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;
}
