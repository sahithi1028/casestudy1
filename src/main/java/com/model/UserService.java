package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
	
	@Autowired 
	UserDAO userDAOImpl;
	public void addUser(User user)
	{
		userDAOImpl.addUser(user);
	}

	public boolean updateUser(User user)
	{
		return userDAOImpl.updateUser(user);
	}
	public boolean deleteUser(String email)
	{
		return userDAOImpl.deleteUser(email);
	}
	public User findUser(String email)
	{
		return userDAOImpl.findUser(email);
		
	}
	public List<User> findAllUsers()
	{
		return userDAOImpl.findAll();
	}
}
