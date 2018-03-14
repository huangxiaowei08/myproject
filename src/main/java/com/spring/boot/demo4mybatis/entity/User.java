package com.spring.boot.demo4mybatis.entity;

public class User {
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
