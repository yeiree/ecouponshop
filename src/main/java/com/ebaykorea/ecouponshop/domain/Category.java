package com.ebaykorea.ecouponshop.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="category")
@Setter
@Getter
public class Category implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Id
    @Column(name="code")
    private String code;

    @Column(name="category_name")
    private String categoryName;

    @CreatedDate
    @Column(name="reg_date")
    private LocalDateTime registerDate;

    @LastModifiedDate
    @Column(name="mod_date")
    private LocalDateTime modifyDate;
}
