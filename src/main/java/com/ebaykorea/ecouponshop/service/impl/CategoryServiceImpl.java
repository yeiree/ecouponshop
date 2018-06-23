package com.ebaykorea.ecouponshop.service.impl;

import com.ebaykorea.ecouponshop.repository.CategoryRepository;
import com.ebaykorea.ecouponshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
}
