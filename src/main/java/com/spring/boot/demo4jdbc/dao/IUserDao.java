package com.spring.boot.demo4jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import com.spring.boot.demo4jdbc.entity.User;

public interface IUserDao {
	public void dropTable();

	public void createTable();

	public void save(User user);

	public List<User> findAll();

	public void deleteAll();

	public List<User> findByNameLike(String name);
}
