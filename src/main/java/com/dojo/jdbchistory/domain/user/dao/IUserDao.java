package com.dojo.jdbchistory.domain.user.dao;

import java.util.List;
import java.util.Optional;

import com.dojo.jdbchistory.domain.user.entity.User;

public interface IUserDao {

	public List<User> findAll();

	public Optional<User> findById(long id);

	public int create(User User);

	public int update(long id, User User);

	public int delete(long id);

}
