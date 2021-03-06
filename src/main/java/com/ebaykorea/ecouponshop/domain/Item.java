package com.ebaykorea.ecouponshop.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="item")
@Setter
@Getter
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="item_name")
    private String itemName;

    @JsonManagedReference
    @ManyToOne(targetEntity = Category.class, fetch = FetchType.EAGER)
    @JoinColumn(name="category_id")
    private Category category;

    private double price;

    @CreatedDate
    @Column(name="reg_date")
    private LocalDateTime registerDate;

    @LastModifiedDate
    @Column(name="mod_date")
    private LocalDateTime modifyDate;
}
