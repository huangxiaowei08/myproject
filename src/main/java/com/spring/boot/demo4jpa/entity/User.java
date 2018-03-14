package com.spring.boot.demo4jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
public class User {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private Integer age;

  public User() {
  }

  public User(String name, Integer age) {
    this.name = name;
    this.age = age;
  }
 }
