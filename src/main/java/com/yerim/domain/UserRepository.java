package com.yerim.domain;

import org.springframework.data.jpa.repository.JpaRepository;

// User 테이블을 DB랑 연결시켜주는 역할 interface
public interface UserRepository extends JpaRepository<User, Long> {

}

