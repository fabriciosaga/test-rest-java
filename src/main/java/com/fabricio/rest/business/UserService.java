package com.fabricio.rest.business;

import java.util.List;

import com.fabricio.rest.data.User;

public interface UserService {

	List<User> getUsers();

	User getUser(Integer id);

	User setUser(User user);

}
