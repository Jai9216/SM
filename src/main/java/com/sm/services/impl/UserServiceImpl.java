package com.sm.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sm.entities.User;
import com.sm.exceptions.UserException;
import com.sm.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public User registerUser(User user) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserById(Integer userId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserProfile(String token) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByUsername(String username) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String followUser(Integer reqUserId, Integer followUserId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unFollowUser(Integer reqUserId, Integer followUserId) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findUserByIds(List<Integer> userIds) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchUser(String query) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserDetails(User updatedUser, User existingUser) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
