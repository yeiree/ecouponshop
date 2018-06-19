package com.ebaykorea.ecouponshop.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "order_item")
@Setter
@Getter
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="item_id")
    private Long itemId;


    @Column(name="item_name")
    private String itemName;

    // 이렇게 넣으면... Order Category도 넣어야한다..
    // 꼭 그걸 필요 없어서..
    // private Category category;

    @CreatedDate
    @Column(name="reg_date")
    private LocalDateTime registerDate;

    @LastModifiedDate
    @Column(name="mod_date")
    private LocalDateTime modifyDate;
}
