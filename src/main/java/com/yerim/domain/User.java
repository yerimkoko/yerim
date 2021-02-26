package com.yerim.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * ORM (JPA)
 * - 객체와 테이블을 매핑해준다.
 */

@Getter // Getter
@NoArgsConstructor // 기본 생성자
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String name;

    private String password;

    private String salt;

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

}
