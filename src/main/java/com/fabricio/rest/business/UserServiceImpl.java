package com.fabricio.rest.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.springframework.stereotype.Service;

import com.fabricio.rest.data.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<User> getUsers() {
		
		List<User> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.setId(i);
			user.setName("Name " + i);
			list.add(user);
		}
		return list;
	}

	@Override
	public User getUser(Integer id) {

		Predicate<? super User> predicate = a -> a.getId() == id;
		
		Optional<User> first = getUsers().stream().filter(predicate).findFirst();
		
		Supplier<? extends User> supplier = User::new;
		
		return first.orElseGet(supplier);
	}
	

}
