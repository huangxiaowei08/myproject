package com.spring.boot.demo4jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.demo4jpa.entity.User;




public interface UserRepository extends JpaRepository<User, Long> {

  List<User> findByNameLike(String name);

}
