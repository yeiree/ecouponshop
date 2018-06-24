package com.ebaykorea.ecouponshop.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="member")
@Setter
@Getter
public class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="login_id")
    private String loginId;

    private String password;

    private String name;

    @CreatedDate
    @Column(name="reg_date")
    private LocalDateTime regdate;

    @LastModifiedDate
    @Column(name="mod_date")
    private LocalDateTime moddate;


}
